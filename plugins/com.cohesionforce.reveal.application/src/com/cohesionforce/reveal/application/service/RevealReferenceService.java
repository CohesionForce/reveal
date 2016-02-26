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
package com.cohesionforce.reveal.application.service;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.swt.DefaultReferenceService;

import com.cohesionforce.reveal.Slide;

/**
 * @author jlangley
 *
 */
public class RevealReferenceService extends DefaultReferenceService {

	@Inject
	private EPartService partService;

	@Inject
	private EModelService modelService;

	@Inject
	@Active
	private MWindow window;

	@Override
	public void openInNewContext(EObject eObject) {
		if (eObject instanceof Slide) {
			Slide page = (Slide) eObject;
			URI base = page.eResource().getURI();
			URI full = base.appendFragment(page.eResource().getURIFragment(page));

			MPart part = partService.createPart("reveal.descriptor.slideEditorPart");
			part.getTransientData().put(Slide.class.getName(), page);
			part.setElementId(full.toString());
			MPartStack stack = (MPartStack) modelService.find("reveal.stack.pageStack", window);
			if (stack != null) {
				stack.getChildren().add(part);
			}
			partService.activate(part);

		} else {
			super.openInNewContext(eObject);
		}
	}
}
