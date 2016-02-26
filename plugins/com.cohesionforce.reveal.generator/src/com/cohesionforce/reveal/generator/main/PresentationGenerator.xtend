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
 package com.cohesionforce.reveal.generator.main

import com.cohesionforce.reveal.Presentation
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import com.cohesionforce.reveal.Slide
import com.cohesionforce.reveal.TransitionStyle

class PresentationGenerator implements IGenerator {

	Presentation presentation = null
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (Presentation presentation : resource.contents.filter(typeof(Presentation))) {
			this.presentation = presentation
			fsa.generateFile("index.html", '''
<html>
    <head>
        <link rel="stylesheet" href="css/reveal.css">
        <link rel="stylesheet" href="css/theme/sky.css">
        <link rel="stylesheet" href="lib/css/zenburn.css">
    </head>
    <body>
        <div class="reveal">
            <div class="slides">
               <div class="footer"><span>Innovative Solutions for Mission Critical Systems<span></div>
               <div class="header-left"></div><div class="header-right"></div>
            «FOR slide : presentation.slides»
            «generateSlide(slide)»
            «ENDFOR»
            </div>
        </div>

		<script src="lib/js/head.min.js"></script>
		<script src="js/reveal.js"></script>

		<script>
			Reveal.initialize({
				controls: «presentation.controls»,
				progress: «presentation.progress»,
				slideNumber: «presentation.slideNumber»,
				history: «presentation.history»,
				keyboard: «presentation.keyboard»,
				center: «presentation.center»,
				touch: «presentation.touch»,
				loop: «presentation.loop»,
				fragments: «presentation.fragments»,
				embedded: «presentation.embedded»,
				help: «presentation.help»,
				showNotes: «presentation.showNotes»,
				autoSlide: «presentation.autoSlide»,
				autoSlideStoppable: «presentation.autoSlideStoppable»,
				mouseWheel: «presentation.mouseWheel»,
				hideAddressBar: «presentation.hideAddressBar»,
				previewLinks: «presentation.previewLinks»,				
				transition: '«presentation.transition.toString»',
				transitionSpeed: '«presentation.transitionSpeed.toString»',
				backgroundTransition: '«presentation.backgroundTransition»',
				viewDistance: «presentation.viewDistance»,
				parallaxBackgroundImage: '«presentation.parallaxBackgroundImage»',
				parallaxBackgroundSize: '«presentation.parallaxBackgroundSize»',
				width: «presentation.width»,
				height: «presentation.height»,
				margin: «presentation.margin»,
				minScale: «presentation.minScale»,
				maxScale: «presentation.maxScale»,
				// Optional libraries used to extend on reveal.js
				dependencies: [
					{ src: 'lib/js/classList.js', condition: function() { return !document.body.classList; } },
					{ src: 'plugin/markdown/marked.js', condition: function() { return !!document.querySelector( '[data-markdown]' ); } },
                    { src: 'plugin/markdown/markdown.js', condition: function() { return !!document.querySelector( '[data-markdown]' ); } },
                    { src: 'plugin/highlight/highlight.js', async: true, callback: function() { hljs.initHighlightingOnLoad(); } },
					{ src: 'plugin/notes/notes.js' }
				]
			});
		</script>
    </body>
</html>
				''')
		}
	}
	
	def CharSequence generateSlide(Slide slide) {'''
		«IF !slide.slides.empty»
		<section>
		«ENDIF»
		«IF slide.markdown»
<section data-markdown «IF slide.transition != TransitionStyle.DEFAULT»data-transition="«slide.transition.toString»"«ENDIF»><script type="text/template">
«slide.text»
</script>
       	«ELSE»
<section «IF slide.transition != TransitionStyle.DEFAULT»data-transition="«slide.transition.toString»"«ENDIF»>
«slide.text»
       	«ENDIF»
</section>
       	«FOR child: slide.slides»
       		«generateSlide(child)»
       	«ENDFOR»
		«IF !slide.slides.empty»
</section>
		«ENDIF»
'''}
}