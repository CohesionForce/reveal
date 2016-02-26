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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

import com.cohesionforce.reveal.generator.main.PresentationGenerator;
 
public class EcoreGeneratorModule extends AbstractGenericResourceRuntimeModule {
 
    @Override
    protected String getLanguageName() {
        return "does.not.seem.to.matter";
    }
 
    @Override
    protected String getFileExtensions() {
        return "ecore";
    }
 
    public Class<? extends IGenerator> bindIGenerator() {
        return PresentationGenerator.class;
    }
 
    public Class<? extends ResourceSet> bindResourceSet() {
        return ResourceSetImpl.class;
    }
 
}