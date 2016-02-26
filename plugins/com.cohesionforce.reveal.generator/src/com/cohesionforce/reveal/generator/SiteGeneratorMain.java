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

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class SiteGeneratorMain {

	private static Injector injector = Guice.createInjector(new EcoreGeneratorModule());

	public static void main(String[] args) {

		HelpFormatter formatter = new HelpFormatter();
		// create Options object
		Options options = new Options();

		// add t option
		options.addOption("i", true, "input Site.webgen file");
		options.addOption("o", true, "output directory for generated source");
		CommandLineParser parser = new GnuParser();
		CommandLine cmd;
		try {
			cmd = parser.parse(options, args);
			String inputFile = cmd.getOptionValue("i");
			if (inputFile == null) {
				formatter.printHelp("SiteGenerator", options);
				return;
			}
			String outputDir = cmd.getOptionValue("o");
			if (outputDir == null) {
				formatter.printHelp("SiteGenerator", options);
				return;
			}
			Generator generator = injector.getInstance(Generator.class);
			generator.runGenerator(inputFile, outputDir);
		} catch (ParseException e) {
			System.err.println("Could not parse command line options. Reason: " + e.getMessage());
		}

	}

}
