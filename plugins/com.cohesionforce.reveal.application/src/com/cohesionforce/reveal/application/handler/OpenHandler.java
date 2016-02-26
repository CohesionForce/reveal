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
package com.cohesionforce.reveal.application.handler;

import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import com.cohesionforce.reveal.Presentation;
import com.cohesionforce.reveal.RevealPackage;

public class OpenHandler {
	
	@Execute
	public void execute(@Active Shell shell, @Active MWindow window,
			EPartService partService, EModelService modelService) {
		FileDialog fileDialog = new FileDialog(shell);
		String filepath = fileDialog.open();
		if (filepath != null) {
			RevealPackage.eINSTANCE.eClass();
			final ResourceSet rs = new ResourceSetImpl();
			final URI uri = URI.createFileURI(filepath);
			final Resource resource = rs.getResource(uri, true);
			if (resource != null) {
				Presentation site = (Presentation) resource.getContents().get(0);
				window.getContext().set(Presentation.class, site);
				MPart part = partService
						.createPart("reveal.descriptor.siteEditorPart");
				part.getTransientData().put(Presentation.class.getName(), site);
				MPartStack stack = (MPartStack) modelService.find(
						"reveal.stack.siteStack", window);
				stack.getChildren().add(part);
				partService.activate(part);
			}
		}
	}
	
}