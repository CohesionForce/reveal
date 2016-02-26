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

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.Active;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;

import com.cohesionforce.reveal.Presentation;
import com.cohesionforce.reveal.generator.EcoreGeneratorModule;
import com.cohesionforce.reveal.generator.Generator;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GenerateHandler {

	private static Injector injector = Guice.createInjector(new EcoreGeneratorModule());

	private final static String DIRECTORY = "export_directory";
	@Inject
	@Preference
	IEclipsePreferences preferences;
	
	@Execute
	public void execute(MWindow window, @Active Shell shell) {
		try {
			Presentation presentation = window.getContext().get(Presentation.class);
			String previous = preferences.get(DIRECTORY, null);
			DirectoryDialog dialog = new DirectoryDialog(shell, SWT.OPEN);
			if(previous != null)
			{
				dialog.setFilterPath(previous);
			}
			String filename = dialog.open();
			if (filename != null) {
				preferences.put(DIRECTORY, filename);
				preferences.flush();
				
				Generator generator = injector.getInstance(Generator.class);
				
				generator.runGenerator(presentation.eResource(), filename);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@CanExecute
	public boolean canExecute(MWindow window) {
		Presentation presentation = window.getContext().get(Presentation.class);
		return presentation != null;
	}
}