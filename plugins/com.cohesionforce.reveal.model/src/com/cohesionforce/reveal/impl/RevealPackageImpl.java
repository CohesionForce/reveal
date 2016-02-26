/**
 */
package com.cohesionforce.reveal.impl;

import com.cohesionforce.reveal.Background;
import com.cohesionforce.reveal.Presentation;
import com.cohesionforce.reveal.Repeat;
import com.cohesionforce.reveal.RevealFactory;
import com.cohesionforce.reveal.RevealPackage;
import com.cohesionforce.reveal.Slide;
import com.cohesionforce.reveal.Theme;
import com.cohesionforce.reveal.TransitionSpeed;
import com.cohesionforce.reveal.TransitionStyle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RevealPackageImpl extends EPackageImpl implements RevealPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionSpeedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum themeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum repeatEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.cohesionforce.reveal.RevealPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RevealPackageImpl() {
		super(eNS_URI, RevealFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RevealPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RevealPackage init() {
		if (isInited) return (RevealPackage)EPackage.Registry.INSTANCE.getEPackage(RevealPackage.eNS_URI);

		// Obtain or create and register package
		RevealPackageImpl theRevealPackage = (RevealPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RevealPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RevealPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRevealPackage.createPackageContents();

		// Initialize created meta-data
		theRevealPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRevealPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RevealPackage.eNS_URI, theRevealPackage);
		return theRevealPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresentation() {
		return presentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Controls() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Progress() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_SlideNumber() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_History() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Keyboard() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Center() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Touch() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Loop() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Rtl() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Fragments() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Embedded() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Help() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_ShowNotes() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_AutoSlide() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_AutoSlideStoppable() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_MouseWheel() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_HideAddressBar() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_PreviewLinks() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Transition() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_TransitionSpeed() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_BackgroundTransition() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_ViewDistance() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_ParallaxBackgroundImage() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_ParallaxBackgroundSize() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_ParallaxBackgroundHorizontal() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_ParallaxBackgroundVertical() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentation_Slides() {
		return (EReference)presentationEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPresentation_Backgrounds() {
		return (EReference)presentationEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Theme() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Width() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Height() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_Margin() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_MinScale() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPresentation_MaxScale() {
		return (EAttribute)presentationEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlide() {
		return slideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlide_Background() {
		return (EReference)slideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlide_Markdown() {
		return (EAttribute)slideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlide_Text() {
		return (EAttribute)slideEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlide_Transition() {
		return (EAttribute)slideEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlide_TransitionSpeed() {
		return (EAttribute)slideEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlide_Slides() {
		return (EReference)slideEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackground() {
		return backgroundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_Src() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_Size() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackground_Repeat() {
		return (EAttribute)backgroundEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionStyle() {
		return transitionStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionSpeed() {
		return transitionSpeedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTheme() {
		return themeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepeat() {
		return repeatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevealFactory getRevealFactory() {
		return (RevealFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		presentationEClass = createEClass(PRESENTATION);
		createEAttribute(presentationEClass, PRESENTATION__CONTROLS);
		createEAttribute(presentationEClass, PRESENTATION__PROGRESS);
		createEAttribute(presentationEClass, PRESENTATION__SLIDE_NUMBER);
		createEAttribute(presentationEClass, PRESENTATION__HISTORY);
		createEAttribute(presentationEClass, PRESENTATION__KEYBOARD);
		createEAttribute(presentationEClass, PRESENTATION__CENTER);
		createEAttribute(presentationEClass, PRESENTATION__TOUCH);
		createEAttribute(presentationEClass, PRESENTATION__LOOP);
		createEAttribute(presentationEClass, PRESENTATION__RTL);
		createEAttribute(presentationEClass, PRESENTATION__FRAGMENTS);
		createEAttribute(presentationEClass, PRESENTATION__EMBEDDED);
		createEAttribute(presentationEClass, PRESENTATION__HELP);
		createEAttribute(presentationEClass, PRESENTATION__SHOW_NOTES);
		createEAttribute(presentationEClass, PRESENTATION__AUTO_SLIDE);
		createEAttribute(presentationEClass, PRESENTATION__AUTO_SLIDE_STOPPABLE);
		createEAttribute(presentationEClass, PRESENTATION__MOUSE_WHEEL);
		createEAttribute(presentationEClass, PRESENTATION__HIDE_ADDRESS_BAR);
		createEAttribute(presentationEClass, PRESENTATION__PREVIEW_LINKS);
		createEAttribute(presentationEClass, PRESENTATION__TRANSITION);
		createEAttribute(presentationEClass, PRESENTATION__TRANSITION_SPEED);
		createEAttribute(presentationEClass, PRESENTATION__BACKGROUND_TRANSITION);
		createEAttribute(presentationEClass, PRESENTATION__VIEW_DISTANCE);
		createEAttribute(presentationEClass, PRESENTATION__PARALLAX_BACKGROUND_IMAGE);
		createEAttribute(presentationEClass, PRESENTATION__PARALLAX_BACKGROUND_SIZE);
		createEAttribute(presentationEClass, PRESENTATION__PARALLAX_BACKGROUND_HORIZONTAL);
		createEAttribute(presentationEClass, PRESENTATION__PARALLAX_BACKGROUND_VERTICAL);
		createEReference(presentationEClass, PRESENTATION__SLIDES);
		createEReference(presentationEClass, PRESENTATION__BACKGROUNDS);
		createEAttribute(presentationEClass, PRESENTATION__THEME);
		createEAttribute(presentationEClass, PRESENTATION__WIDTH);
		createEAttribute(presentationEClass, PRESENTATION__HEIGHT);
		createEAttribute(presentationEClass, PRESENTATION__MARGIN);
		createEAttribute(presentationEClass, PRESENTATION__MIN_SCALE);
		createEAttribute(presentationEClass, PRESENTATION__MAX_SCALE);

		slideEClass = createEClass(SLIDE);
		createEReference(slideEClass, SLIDE__BACKGROUND);
		createEAttribute(slideEClass, SLIDE__MARKDOWN);
		createEAttribute(slideEClass, SLIDE__TEXT);
		createEAttribute(slideEClass, SLIDE__TRANSITION);
		createEAttribute(slideEClass, SLIDE__TRANSITION_SPEED);
		createEReference(slideEClass, SLIDE__SLIDES);

		backgroundEClass = createEClass(BACKGROUND);
		createEAttribute(backgroundEClass, BACKGROUND__SRC);
		createEAttribute(backgroundEClass, BACKGROUND__SIZE);
		createEAttribute(backgroundEClass, BACKGROUND__REPEAT);

		// Create enums
		transitionStyleEEnum = createEEnum(TRANSITION_STYLE);
		transitionSpeedEEnum = createEEnum(TRANSITION_SPEED);
		themeEEnum = createEEnum(THEME);
		repeatEEnum = createEEnum(REPEAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(presentationEClass, Presentation.class, "Presentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresentation_Controls(), ecorePackage.getEBoolean(), "controls", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Progress(), ecorePackage.getEBoolean(), "progress", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_SlideNumber(), ecorePackage.getEBoolean(), "slideNumber", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_History(), ecorePackage.getEBoolean(), "history", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Keyboard(), ecorePackage.getEBoolean(), "keyboard", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Center(), ecorePackage.getEBoolean(), "center", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Touch(), ecorePackage.getEBoolean(), "touch", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Loop(), ecorePackage.getEBoolean(), "loop", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Rtl(), ecorePackage.getEBoolean(), "rtl", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Fragments(), ecorePackage.getEBoolean(), "fragments", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Embedded(), ecorePackage.getEBoolean(), "embedded", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Help(), ecorePackage.getEBoolean(), "help", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_ShowNotes(), ecorePackage.getEBoolean(), "showNotes", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_AutoSlide(), ecorePackage.getEInt(), "autoSlide", "0", 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_AutoSlideStoppable(), ecorePackage.getEBoolean(), "autoSlideStoppable", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_MouseWheel(), ecorePackage.getEBoolean(), "mouseWheel", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_HideAddressBar(), ecorePackage.getEBoolean(), "hideAddressBar", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_PreviewLinks(), ecorePackage.getEBoolean(), "previewLinks", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Transition(), this.getTransitionStyle(), "transition", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_TransitionSpeed(), this.getTransitionSpeed(), "transitionSpeed", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_BackgroundTransition(), this.getTransitionStyle(), "backgroundTransition", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_ViewDistance(), ecorePackage.getEInt(), "viewDistance", "3", 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_ParallaxBackgroundImage(), ecorePackage.getEString(), "parallaxBackgroundImage", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_ParallaxBackgroundSize(), ecorePackage.getEString(), "parallaxBackgroundSize", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_ParallaxBackgroundHorizontal(), ecorePackage.getEString(), "parallaxBackgroundHorizontal", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_ParallaxBackgroundVertical(), ecorePackage.getEString(), "parallaxBackgroundVertical", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentation_Slides(), this.getSlide(), null, "slides", null, 0, -1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentation_Backgrounds(), this.getBackground(), null, "backgrounds", null, 0, -1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Theme(), this.getTheme(), "theme", null, 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Width(), ecorePackage.getEInt(), "width", "960", 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Height(), ecorePackage.getEInt(), "height", "700", 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_Margin(), ecorePackage.getEFloat(), "margin", "0.1", 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_MinScale(), ecorePackage.getEFloat(), "minScale", "0.2", 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPresentation_MaxScale(), ecorePackage.getEFloat(), "maxScale", "1.5", 0, 1, Presentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slideEClass, Slide.class, "Slide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlide_Background(), this.getBackground(), null, "background", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlide_Markdown(), theXMLTypePackage.getBoolean(), "markdown", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlide_Text(), ecorePackage.getEString(), "text", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlide_Transition(), this.getTransitionStyle(), "transition", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlide_TransitionSpeed(), this.getTransitionSpeed(), "transitionSpeed", null, 0, 1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlide_Slides(), this.getSlide(), null, "slides", null, 0, -1, Slide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backgroundEClass, Background.class, "Background", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackground_Src(), ecorePackage.getEString(), "src", null, 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackground_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackground_Repeat(), this.getRepeat(), "repeat", null, 0, 1, Background.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transitionStyleEEnum, TransitionStyle.class, "TransitionStyle");
		addEEnumLiteral(transitionStyleEEnum, TransitionStyle.DEFAULT);
		addEEnumLiteral(transitionStyleEEnum, TransitionStyle.NONE);
		addEEnumLiteral(transitionStyleEEnum, TransitionStyle.FADE);
		addEEnumLiteral(transitionStyleEEnum, TransitionStyle.SLIDE);
		addEEnumLiteral(transitionStyleEEnum, TransitionStyle.CONVEX);
		addEEnumLiteral(transitionStyleEEnum, TransitionStyle.CONCAVE);
		addEEnumLiteral(transitionStyleEEnum, TransitionStyle.ZOOM);

		initEEnum(transitionSpeedEEnum, TransitionSpeed.class, "TransitionSpeed");
		addEEnumLiteral(transitionSpeedEEnum, TransitionSpeed.DEFAULT);
		addEEnumLiteral(transitionSpeedEEnum, TransitionSpeed.FAST);
		addEEnumLiteral(transitionSpeedEEnum, TransitionSpeed.SLOW);

		initEEnum(themeEEnum, Theme.class, "Theme");
		addEEnumLiteral(themeEEnum, Theme.BLACK);
		addEEnumLiteral(themeEEnum, Theme.WHITE);
		addEEnumLiteral(themeEEnum, Theme.LEAGUE);
		addEEnumLiteral(themeEEnum, Theme.BEIGE);
		addEEnumLiteral(themeEEnum, Theme.SKY);
		addEEnumLiteral(themeEEnum, Theme.NIGHT);
		addEEnumLiteral(themeEEnum, Theme.SERIF);
		addEEnumLiteral(themeEEnum, Theme.SIMPLE);
		addEEnumLiteral(themeEEnum, Theme.SOLARIZED);
		addEEnumLiteral(themeEEnum, Theme.CUSTOM);

		initEEnum(repeatEEnum, Repeat.class, "Repeat");
		addEEnumLiteral(repeatEEnum, Repeat.NO_REPEAT);
		addEEnumLiteral(repeatEEnum, Repeat.REPEAT);
		addEEnumLiteral(repeatEEnum, Repeat.REPEAT_X);
		addEEnumLiteral(repeatEEnum, Repeat.REPEAT_Y);
		addEEnumLiteral(repeatEEnum, Repeat.INITIAL);
		addEEnumLiteral(repeatEEnum, Repeat.INHERIT);

		// Create resource
		createResource(eNS_URI);
	}

} //RevealPackageImpl
