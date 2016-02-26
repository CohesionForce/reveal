/**
 */
package com.cohesionforce.reveal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.cohesionforce.reveal.RevealFactory
 * @model kind="package"
 * @generated
 */
public interface RevealPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reveal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cohesionforce.com/reveal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reveal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RevealPackage eINSTANCE = com.cohesionforce.reveal.impl.RevealPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.cohesionforce.reveal.impl.PresentationImpl <em>Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cohesionforce.reveal.impl.PresentationImpl
	 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getPresentation()
	 * @generated
	 */
	int PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__CONTROLS = 0;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__PROGRESS = 1;

	/**
	 * The feature id for the '<em><b>Slide Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__SLIDE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__HISTORY = 3;

	/**
	 * The feature id for the '<em><b>Keyboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__KEYBOARD = 4;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__CENTER = 5;

	/**
	 * The feature id for the '<em><b>Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__TOUCH = 6;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__LOOP = 7;

	/**
	 * The feature id for the '<em><b>Rtl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__RTL = 8;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__FRAGMENTS = 9;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__EMBEDDED = 10;

	/**
	 * The feature id for the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__HELP = 11;

	/**
	 * The feature id for the '<em><b>Show Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__SHOW_NOTES = 12;

	/**
	 * The feature id for the '<em><b>Auto Slide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__AUTO_SLIDE = 13;

	/**
	 * The feature id for the '<em><b>Auto Slide Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__AUTO_SLIDE_STOPPABLE = 14;

	/**
	 * The feature id for the '<em><b>Mouse Wheel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__MOUSE_WHEEL = 15;

	/**
	 * The feature id for the '<em><b>Hide Address Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__HIDE_ADDRESS_BAR = 16;

	/**
	 * The feature id for the '<em><b>Preview Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__PREVIEW_LINKS = 17;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__TRANSITION = 18;

	/**
	 * The feature id for the '<em><b>Transition Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__TRANSITION_SPEED = 19;

	/**
	 * The feature id for the '<em><b>Background Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__BACKGROUND_TRANSITION = 20;

	/**
	 * The feature id for the '<em><b>View Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__VIEW_DISTANCE = 21;

	/**
	 * The feature id for the '<em><b>Parallax Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__PARALLAX_BACKGROUND_IMAGE = 22;

	/**
	 * The feature id for the '<em><b>Parallax Background Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__PARALLAX_BACKGROUND_SIZE = 23;

	/**
	 * The feature id for the '<em><b>Parallax Background Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__PARALLAX_BACKGROUND_HORIZONTAL = 24;

	/**
	 * The feature id for the '<em><b>Parallax Background Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__PARALLAX_BACKGROUND_VERTICAL = 25;

	/**
	 * The feature id for the '<em><b>Slides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__SLIDES = 26;

	/**
	 * The feature id for the '<em><b>Backgrounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__BACKGROUNDS = 27;

	/**
	 * The feature id for the '<em><b>Theme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__THEME = 28;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__WIDTH = 29;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__HEIGHT = 30;

	/**
	 * The feature id for the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__MARGIN = 31;

	/**
	 * The feature id for the '<em><b>Min Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__MIN_SCALE = 32;

	/**
	 * The feature id for the '<em><b>Max Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION__MAX_SCALE = 33;

	/**
	 * The number of structural features of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_FEATURE_COUNT = 34;

	/**
	 * The number of operations of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cohesionforce.reveal.impl.SlideImpl <em>Slide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cohesionforce.reveal.impl.SlideImpl
	 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getSlide()
	 * @generated
	 */
	int SLIDE = 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__BACKGROUND = 0;

	/**
	 * The feature id for the '<em><b>Markdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__MARKDOWN = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Transition Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__TRANSITION_SPEED = 4;

	/**
	 * The feature id for the '<em><b>Slides</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE__SLIDES = 5;

	/**
	 * The number of structural features of the '<em>Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cohesionforce.reveal.impl.BackgroundImpl <em>Background</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cohesionforce.reveal.impl.BackgroundImpl
	 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getBackground()
	 * @generated
	 */
	int BACKGROUND = 2;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__SRC = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__REPEAT = 2;

	/**
	 * The number of structural features of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cohesionforce.reveal.TransitionStyle <em>Transition Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cohesionforce.reveal.TransitionStyle
	 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getTransitionStyle()
	 * @generated
	 */
	int TRANSITION_STYLE = 3;

	/**
	 * The meta object id for the '{@link com.cohesionforce.reveal.TransitionSpeed <em>Transition Speed</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cohesionforce.reveal.TransitionSpeed
	 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getTransitionSpeed()
	 * @generated
	 */
	int TRANSITION_SPEED = 4;

	/**
	 * The meta object id for the '{@link com.cohesionforce.reveal.Theme <em>Theme</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cohesionforce.reveal.Theme
	 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getTheme()
	 * @generated
	 */
	int THEME = 5;

	/**
	 * The meta object id for the '{@link com.cohesionforce.reveal.Repeat <em>Repeat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cohesionforce.reveal.Repeat
	 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 6;


	/**
	 * Returns the meta object for class '{@link com.cohesionforce.reveal.Presentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation</em>'.
	 * @see com.cohesionforce.reveal.Presentation
	 * @generated
	 */
	EClass getPresentation();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controls</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isControls()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Controls();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isProgress()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Progress();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isSlideNumber <em>Slide Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slide Number</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isSlideNumber()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_SlideNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isHistory <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>History</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isHistory()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_History();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isKeyboard <em>Keyboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyboard</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isKeyboard()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Keyboard();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isCenter()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Center();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isTouch <em>Touch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Touch</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isTouch()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Touch();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isLoop()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Loop();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isRtl <em>Rtl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rtl</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isRtl()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Rtl();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragments</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isFragments()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Fragments();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isEmbedded()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Embedded();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isHelp <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isHelp()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Help();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isShowNotes <em>Show Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Notes</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isShowNotes()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_ShowNotes();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getAutoSlide <em>Auto Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Slide</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getAutoSlide()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_AutoSlide();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isAutoSlideStoppable <em>Auto Slide Stoppable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Slide Stoppable</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isAutoSlideStoppable()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_AutoSlideStoppable();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isMouseWheel <em>Mouse Wheel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mouse Wheel</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isMouseWheel()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_MouseWheel();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isHideAddressBar <em>Hide Address Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Address Bar</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isHideAddressBar()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_HideAddressBar();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#isPreviewLinks <em>Preview Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preview Links</em>'.
	 * @see com.cohesionforce.reveal.Presentation#isPreviewLinks()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_PreviewLinks();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getTransition()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Transition();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getTransitionSpeed <em>Transition Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Speed</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getTransitionSpeed()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_TransitionSpeed();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getBackgroundTransition <em>Background Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Transition</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getBackgroundTransition()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_BackgroundTransition();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getViewDistance <em>View Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Distance</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getViewDistance()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_ViewDistance();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundImage <em>Parallax Background Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallax Background Image</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getParallaxBackgroundImage()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_ParallaxBackgroundImage();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundSize <em>Parallax Background Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallax Background Size</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getParallaxBackgroundSize()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_ParallaxBackgroundSize();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundHorizontal <em>Parallax Background Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallax Background Horizontal</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getParallaxBackgroundHorizontal()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_ParallaxBackgroundHorizontal();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundVertical <em>Parallax Background Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallax Background Vertical</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getParallaxBackgroundVertical()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_ParallaxBackgroundVertical();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cohesionforce.reveal.Presentation#getSlides <em>Slides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slides</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getSlides()
	 * @see #getPresentation()
	 * @generated
	 */
	EReference getPresentation_Slides();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cohesionforce.reveal.Presentation#getBackgrounds <em>Backgrounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Backgrounds</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getBackgrounds()
	 * @see #getPresentation()
	 * @generated
	 */
	EReference getPresentation_Backgrounds();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getTheme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theme</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getTheme()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Theme();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getWidth()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Width();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getHeight()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Height();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getMargin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getMargin()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_Margin();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getMinScale <em>Min Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Scale</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getMinScale()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_MinScale();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Presentation#getMaxScale <em>Max Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Scale</em>'.
	 * @see com.cohesionforce.reveal.Presentation#getMaxScale()
	 * @see #getPresentation()
	 * @generated
	 */
	EAttribute getPresentation_MaxScale();

	/**
	 * Returns the meta object for class '{@link com.cohesionforce.reveal.Slide <em>Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slide</em>'.
	 * @see com.cohesionforce.reveal.Slide
	 * @generated
	 */
	EClass getSlide();

	/**
	 * Returns the meta object for the reference '{@link com.cohesionforce.reveal.Slide#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Background</em>'.
	 * @see com.cohesionforce.reveal.Slide#getBackground()
	 * @see #getSlide()
	 * @generated
	 */
	EReference getSlide_Background();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Slide#isMarkdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Markdown</em>'.
	 * @see com.cohesionforce.reveal.Slide#isMarkdown()
	 * @see #getSlide()
	 * @generated
	 */
	EAttribute getSlide_Markdown();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Slide#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.cohesionforce.reveal.Slide#getText()
	 * @see #getSlide()
	 * @generated
	 */
	EAttribute getSlide_Text();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Slide#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition</em>'.
	 * @see com.cohesionforce.reveal.Slide#getTransition()
	 * @see #getSlide()
	 * @generated
	 */
	EAttribute getSlide_Transition();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Slide#getTransitionSpeed <em>Transition Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Speed</em>'.
	 * @see com.cohesionforce.reveal.Slide#getTransitionSpeed()
	 * @see #getSlide()
	 * @generated
	 */
	EAttribute getSlide_TransitionSpeed();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cohesionforce.reveal.Slide#getSlides <em>Slides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slides</em>'.
	 * @see com.cohesionforce.reveal.Slide#getSlides()
	 * @see #getSlide()
	 * @generated
	 */
	EReference getSlide_Slides();

	/**
	 * Returns the meta object for class '{@link com.cohesionforce.reveal.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background</em>'.
	 * @see com.cohesionforce.reveal.Background
	 * @generated
	 */
	EClass getBackground();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Background#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see com.cohesionforce.reveal.Background#getSrc()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_Src();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Background#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see com.cohesionforce.reveal.Background#getSize()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.cohesionforce.reveal.Background#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see com.cohesionforce.reveal.Background#getRepeat()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_Repeat();

	/**
	 * Returns the meta object for enum '{@link com.cohesionforce.reveal.TransitionStyle <em>Transition Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Style</em>'.
	 * @see com.cohesionforce.reveal.TransitionStyle
	 * @generated
	 */
	EEnum getTransitionStyle();

	/**
	 * Returns the meta object for enum '{@link com.cohesionforce.reveal.TransitionSpeed <em>Transition Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Speed</em>'.
	 * @see com.cohesionforce.reveal.TransitionSpeed
	 * @generated
	 */
	EEnum getTransitionSpeed();

	/**
	 * Returns the meta object for enum '{@link com.cohesionforce.reveal.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Theme</em>'.
	 * @see com.cohesionforce.reveal.Theme
	 * @generated
	 */
	EEnum getTheme();

	/**
	 * Returns the meta object for enum '{@link com.cohesionforce.reveal.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repeat</em>'.
	 * @see com.cohesionforce.reveal.Repeat
	 * @generated
	 */
	EEnum getRepeat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RevealFactory getRevealFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.cohesionforce.reveal.impl.PresentationImpl <em>Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cohesionforce.reveal.impl.PresentationImpl
		 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getPresentation()
		 * @generated
		 */
		EClass PRESENTATION = eINSTANCE.getPresentation();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__CONTROLS = eINSTANCE.getPresentation_Controls();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__PROGRESS = eINSTANCE.getPresentation_Progress();

		/**
		 * The meta object literal for the '<em><b>Slide Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__SLIDE_NUMBER = eINSTANCE.getPresentation_SlideNumber();

		/**
		 * The meta object literal for the '<em><b>History</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__HISTORY = eINSTANCE.getPresentation_History();

		/**
		 * The meta object literal for the '<em><b>Keyboard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__KEYBOARD = eINSTANCE.getPresentation_Keyboard();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__CENTER = eINSTANCE.getPresentation_Center();

		/**
		 * The meta object literal for the '<em><b>Touch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__TOUCH = eINSTANCE.getPresentation_Touch();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__LOOP = eINSTANCE.getPresentation_Loop();

		/**
		 * The meta object literal for the '<em><b>Rtl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__RTL = eINSTANCE.getPresentation_Rtl();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__FRAGMENTS = eINSTANCE.getPresentation_Fragments();

		/**
		 * The meta object literal for the '<em><b>Embedded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__EMBEDDED = eINSTANCE.getPresentation_Embedded();

		/**
		 * The meta object literal for the '<em><b>Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__HELP = eINSTANCE.getPresentation_Help();

		/**
		 * The meta object literal for the '<em><b>Show Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__SHOW_NOTES = eINSTANCE.getPresentation_ShowNotes();

		/**
		 * The meta object literal for the '<em><b>Auto Slide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__AUTO_SLIDE = eINSTANCE.getPresentation_AutoSlide();

		/**
		 * The meta object literal for the '<em><b>Auto Slide Stoppable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__AUTO_SLIDE_STOPPABLE = eINSTANCE.getPresentation_AutoSlideStoppable();

		/**
		 * The meta object literal for the '<em><b>Mouse Wheel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__MOUSE_WHEEL = eINSTANCE.getPresentation_MouseWheel();

		/**
		 * The meta object literal for the '<em><b>Hide Address Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__HIDE_ADDRESS_BAR = eINSTANCE.getPresentation_HideAddressBar();

		/**
		 * The meta object literal for the '<em><b>Preview Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__PREVIEW_LINKS = eINSTANCE.getPresentation_PreviewLinks();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__TRANSITION = eINSTANCE.getPresentation_Transition();

		/**
		 * The meta object literal for the '<em><b>Transition Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__TRANSITION_SPEED = eINSTANCE.getPresentation_TransitionSpeed();

		/**
		 * The meta object literal for the '<em><b>Background Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__BACKGROUND_TRANSITION = eINSTANCE.getPresentation_BackgroundTransition();

		/**
		 * The meta object literal for the '<em><b>View Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__VIEW_DISTANCE = eINSTANCE.getPresentation_ViewDistance();

		/**
		 * The meta object literal for the '<em><b>Parallax Background Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__PARALLAX_BACKGROUND_IMAGE = eINSTANCE.getPresentation_ParallaxBackgroundImage();

		/**
		 * The meta object literal for the '<em><b>Parallax Background Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__PARALLAX_BACKGROUND_SIZE = eINSTANCE.getPresentation_ParallaxBackgroundSize();

		/**
		 * The meta object literal for the '<em><b>Parallax Background Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__PARALLAX_BACKGROUND_HORIZONTAL = eINSTANCE.getPresentation_ParallaxBackgroundHorizontal();

		/**
		 * The meta object literal for the '<em><b>Parallax Background Vertical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__PARALLAX_BACKGROUND_VERTICAL = eINSTANCE.getPresentation_ParallaxBackgroundVertical();

		/**
		 * The meta object literal for the '<em><b>Slides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION__SLIDES = eINSTANCE.getPresentation_Slides();

		/**
		 * The meta object literal for the '<em><b>Backgrounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESENTATION__BACKGROUNDS = eINSTANCE.getPresentation_Backgrounds();

		/**
		 * The meta object literal for the '<em><b>Theme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__THEME = eINSTANCE.getPresentation_Theme();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__WIDTH = eINSTANCE.getPresentation_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__HEIGHT = eINSTANCE.getPresentation_Height();

		/**
		 * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__MARGIN = eINSTANCE.getPresentation_Margin();

		/**
		 * The meta object literal for the '<em><b>Min Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__MIN_SCALE = eINSTANCE.getPresentation_MinScale();

		/**
		 * The meta object literal for the '<em><b>Max Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESENTATION__MAX_SCALE = eINSTANCE.getPresentation_MaxScale();

		/**
		 * The meta object literal for the '{@link com.cohesionforce.reveal.impl.SlideImpl <em>Slide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cohesionforce.reveal.impl.SlideImpl
		 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getSlide()
		 * @generated
		 */
		EClass SLIDE = eINSTANCE.getSlide();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLIDE__BACKGROUND = eINSTANCE.getSlide_Background();

		/**
		 * The meta object literal for the '<em><b>Markdown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDE__MARKDOWN = eINSTANCE.getSlide_Markdown();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDE__TEXT = eINSTANCE.getSlide_Text();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDE__TRANSITION = eINSTANCE.getSlide_Transition();

		/**
		 * The meta object literal for the '<em><b>Transition Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDE__TRANSITION_SPEED = eINSTANCE.getSlide_TransitionSpeed();

		/**
		 * The meta object literal for the '<em><b>Slides</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLIDE__SLIDES = eINSTANCE.getSlide_Slides();

		/**
		 * The meta object literal for the '{@link com.cohesionforce.reveal.impl.BackgroundImpl <em>Background</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cohesionforce.reveal.impl.BackgroundImpl
		 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getBackground()
		 * @generated
		 */
		EClass BACKGROUND = eINSTANCE.getBackground();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__SRC = eINSTANCE.getBackground_Src();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__SIZE = eINSTANCE.getBackground_Size();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__REPEAT = eINSTANCE.getBackground_Repeat();

		/**
		 * The meta object literal for the '{@link com.cohesionforce.reveal.TransitionStyle <em>Transition Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cohesionforce.reveal.TransitionStyle
		 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getTransitionStyle()
		 * @generated
		 */
		EEnum TRANSITION_STYLE = eINSTANCE.getTransitionStyle();

		/**
		 * The meta object literal for the '{@link com.cohesionforce.reveal.TransitionSpeed <em>Transition Speed</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cohesionforce.reveal.TransitionSpeed
		 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getTransitionSpeed()
		 * @generated
		 */
		EEnum TRANSITION_SPEED = eINSTANCE.getTransitionSpeed();

		/**
		 * The meta object literal for the '{@link com.cohesionforce.reveal.Theme <em>Theme</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cohesionforce.reveal.Theme
		 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getTheme()
		 * @generated
		 */
		EEnum THEME = eINSTANCE.getTheme();

		/**
		 * The meta object literal for the '{@link com.cohesionforce.reveal.Repeat <em>Repeat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cohesionforce.reveal.Repeat
		 * @see com.cohesionforce.reveal.impl.RevealPackageImpl#getRepeat()
		 * @generated
		 */
		EEnum REPEAT = eINSTANCE.getRepeat();

	}

} //RevealPackage
