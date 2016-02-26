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
package com.cohesionforce.reveal.generator;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;
import com.google.inject.Provider;

import com.cohesionforce.reveal.RevealPackage;

public class Generator {
	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private IGenerator generator;

	@Inject
	private JavaIoFileSystemAccess fileAccess;

	public void runGenerator(String inputFile, String outputDir) {

		RevealPackage.eINSTANCE.eClass();
		
		// load the resource
		ResourceSet set = resourceSetProvider.get();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reveal", new XMIResourceFactoryImpl());
		Resource resource = set.getResource(URI.createURI(inputFile), true);

		// validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}

		// configure and start the generator
		runGenerator(resource, outputDir);
	}
	
	public void runGenerator(Resource resource, String outputDir) {
		fileAccess.setOutputPath(outputDir);
		generator.doGenerate(resource, fileAccess);

		System.out.println("Code generation finished.");
	}	


}
