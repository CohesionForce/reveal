/*******************************************************************************
 * Copyright (c) 2016 CohesionForce, Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     CohesionForce, Inc - initial API and implementation
 *******************************************************************************/
package com.cohesionforce.reveal.application.part;

import java.io.IOException;
import java.util.EventObject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.PersistState;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContextFactory;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;

import com.cohesionforce.reveal.Presentation;
import com.cohesionforce.reveal.RevealPackage;
import com.cohesionforce.reveal.application.service.RevealReferenceService;
import com.cohesionforce.reveal.provider.RevealItemProviderAdapterFactory;

public class SiteEditorPart {

	private Presentation presentation;
	private MPart part;
	private EditingDomain domain;
	private Composite content;

	private CommandStackListener commandStackListener = new CommandStackListener() {
		@Override
		public void commandStackChanged(EventObject event) {
			part.setDirty(((CommandStack) event.getSource()).canUndo());
		}
	};

	/**
	 * Render the editor.
	 *
	 * @param parent
	 *            the {@link Composite} to render to
	 */
	@PostConstruct
	public void createComposite(Composite parent, MPart inPart,
			IEclipseContext context, MWindow window) {
		parent.setLayout(new FillLayout(SWT.VERTICAL));

		final ScrolledComposite scrolled = new ScrolledComposite(parent,
				SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		scrolled.setExpandHorizontal(true);
		scrolled.setExpandVertical(true);
		RowLayout rowLayout = new RowLayout(SWT.VERTICAL);
		rowLayout.wrap = true;
		scrolled.setLayout(rowLayout);
		content = new Composite(scrolled, SWT.NONE);
		content.setBackground(parent.getDisplay().getSystemColor(
				SWT.COLOR_WHITE));
		content.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10)
				.create());
		content.setLayoutData(GridDataFactory.fillDefaults().create());
		scrolled.setContent(content);

		this.part = inPart;
		String fileURI = inPart.getPersistedState().get("uri");
		if (fileURI != null) {
			RevealPackage.eINSTANCE.eClass();
			final ResourceSet rs = new ResourceSetImpl();
			final URI uri = URI.createFileURI(fileURI);
			final Resource resource = rs.getResource(uri, true);
			if (resource != null && resource.getContents().size() > 0
					&& resource.getContents().get(0) instanceof Presentation) {
				presentation = (Presentation) resource.getContents().get(0);
				window.getContext().set(Presentation.class, presentation);
			}
		} else {
			Object object = inPart.getTransientData().get(Presentation.class.getName());
			if (object instanceof Presentation) {
				presentation = (Presentation) object;
				part.getPersistedState().put("uri",
						presentation.eResource().getURI().toFileString());
			}
		}

		if (presentation != null) {
			String filename = presentation.eResource().getURI().lastSegment();
			part.setLabel(filename);

			BasicCommandStack commandStack = new BasicCommandStack();
			commandStack.addCommandStackListener(commandStackListener);

			domain = new AdapterFactoryEditingDomain(
					new RevealItemProviderAdapterFactory(), commandStack);

			domain.getResourceSet().getResources().add(presentation.eResource());

			try {

				RevealReferenceService refService = new RevealReferenceService();
				ContextInjectionFactory.inject(refService, context);
				VView view = ViewProviderHelper.getView(presentation, null);
				final ViewModelContext vmc = ViewModelContextFactory.INSTANCE
						.createViewModelContext(view
								, presentation,
								refService);

				ECPSWTViewRenderer.INSTANCE.render(content, vmc);
			} catch (final ECPRendererException e) {
				e.printStackTrace();
			}
		}
		content.layout();
		scrolled.setMinSize(content.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		scrolled.layout();
		parent.layout();
	}

	@PreDestroy
	public void preDestroy() {
		if (domain != null) {
			while (domain.getCommandStack().canUndo()) {
				domain.getCommandStack().undo();
			}
			domain.getResourceSet().getResources().clear();
			domain.getCommandStack().removeCommandStackListener(
					commandStackListener);
		}
	}

	@PersistState
	public void persistState() {
		part.getPersistedState().put("uri",
				presentation.eResource().getURI().toFileString());
	}

	@Persist
	public void persist() {
		try {
			presentation.eResource().save(null);
			domain.getCommandStack().flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}