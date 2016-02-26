/**
 */
package com.cohesionforce.reveal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isControls <em>Controls</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isProgress <em>Progress</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isSlideNumber <em>Slide Number</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isHistory <em>History</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isKeyboard <em>Keyboard</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isCenter <em>Center</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isTouch <em>Touch</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isLoop <em>Loop</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isRtl <em>Rtl</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isFragments <em>Fragments</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isHelp <em>Help</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isShowNotes <em>Show Notes</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getAutoSlide <em>Auto Slide</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isAutoSlideStoppable <em>Auto Slide Stoppable</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isMouseWheel <em>Mouse Wheel</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isHideAddressBar <em>Hide Address Bar</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#isPreviewLinks <em>Preview Links</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getTransition <em>Transition</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getTransitionSpeed <em>Transition Speed</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getBackgroundTransition <em>Background Transition</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getViewDistance <em>View Distance</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundImage <em>Parallax Background Image</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundSize <em>Parallax Background Size</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundHorizontal <em>Parallax Background Horizontal</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundVertical <em>Parallax Background Vertical</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getSlides <em>Slides</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getBackgrounds <em>Backgrounds</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getTheme <em>Theme</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getWidth <em>Width</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getHeight <em>Height</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getMargin <em>Margin</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getMinScale <em>Min Scale</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Presentation#getMaxScale <em>Max Scale</em>}</li>
 * </ul>
 *
 * @see com.cohesionforce.reveal.RevealPackage#getPresentation()
 * @model
 * @generated
 */
public interface Presentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' attribute.
	 * @see #setControls(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Controls()
	 * @model
	 * @generated
	 */
	boolean isControls();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isControls <em>Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controls</em>' attribute.
	 * @see #isControls()
	 * @generated
	 */
	void setControls(boolean value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Progress()
	 * @model
	 * @generated
	 */
	boolean isProgress();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #isProgress()
	 * @generated
	 */
	void setProgress(boolean value);

	/**
	 * Returns the value of the '<em><b>Slide Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slide Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slide Number</em>' attribute.
	 * @see #setSlideNumber(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_SlideNumber()
	 * @model
	 * @generated
	 */
	boolean isSlideNumber();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isSlideNumber <em>Slide Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slide Number</em>' attribute.
	 * @see #isSlideNumber()
	 * @generated
	 */
	void setSlideNumber(boolean value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' attribute.
	 * @see #setHistory(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_History()
	 * @model
	 * @generated
	 */
	boolean isHistory();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isHistory <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' attribute.
	 * @see #isHistory()
	 * @generated
	 */
	void setHistory(boolean value);

	/**
	 * Returns the value of the '<em><b>Keyboard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyboard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyboard</em>' attribute.
	 * @see #setKeyboard(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Keyboard()
	 * @model
	 * @generated
	 */
	boolean isKeyboard();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isKeyboard <em>Keyboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyboard</em>' attribute.
	 * @see #isKeyboard()
	 * @generated
	 */
	void setKeyboard(boolean value);

	/**
	 * Returns the value of the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' attribute.
	 * @see #setCenter(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Center()
	 * @model
	 * @generated
	 */
	boolean isCenter();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isCenter <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' attribute.
	 * @see #isCenter()
	 * @generated
	 */
	void setCenter(boolean value);

	/**
	 * Returns the value of the '<em><b>Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touch</em>' attribute.
	 * @see #setTouch(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Touch()
	 * @model
	 * @generated
	 */
	boolean isTouch();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isTouch <em>Touch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touch</em>' attribute.
	 * @see #isTouch()
	 * @generated
	 */
	void setTouch(boolean value);

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' attribute.
	 * @see #setLoop(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Loop()
	 * @model
	 * @generated
	 */
	boolean isLoop();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isLoop <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' attribute.
	 * @see #isLoop()
	 * @generated
	 */
	void setLoop(boolean value);

	/**
	 * Returns the value of the '<em><b>Rtl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rtl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rtl</em>' attribute.
	 * @see #setRtl(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Rtl()
	 * @model
	 * @generated
	 */
	boolean isRtl();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isRtl <em>Rtl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtl</em>' attribute.
	 * @see #isRtl()
	 * @generated
	 */
	void setRtl(boolean value);

	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fragments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' attribute.
	 * @see #setFragments(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Fragments()
	 * @model
	 * @generated
	 */
	boolean isFragments();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isFragments <em>Fragments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragments</em>' attribute.
	 * @see #isFragments()
	 * @generated
	 */
	void setFragments(boolean value);

	/**
	 * Returns the value of the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded</em>' attribute.
	 * @see #setEmbedded(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Embedded()
	 * @model
	 * @generated
	 */
	boolean isEmbedded();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isEmbedded <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded</em>' attribute.
	 * @see #isEmbedded()
	 * @generated
	 */
	void setEmbedded(boolean value);

	/**
	 * Returns the value of the '<em><b>Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help</em>' attribute.
	 * @see #setHelp(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Help()
	 * @model
	 * @generated
	 */
	boolean isHelp();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isHelp <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help</em>' attribute.
	 * @see #isHelp()
	 * @generated
	 */
	void setHelp(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Notes</em>' attribute.
	 * @see #setShowNotes(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_ShowNotes()
	 * @model
	 * @generated
	 */
	boolean isShowNotes();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isShowNotes <em>Show Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Notes</em>' attribute.
	 * @see #isShowNotes()
	 * @generated
	 */
	void setShowNotes(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Slide</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Slide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Slide</em>' attribute.
	 * @see #setAutoSlide(int)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_AutoSlide()
	 * @model default="0"
	 * @generated
	 */
	int getAutoSlide();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getAutoSlide <em>Auto Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Slide</em>' attribute.
	 * @see #getAutoSlide()
	 * @generated
	 */
	void setAutoSlide(int value);

	/**
	 * Returns the value of the '<em><b>Auto Slide Stoppable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Slide Stoppable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Slide Stoppable</em>' attribute.
	 * @see #setAutoSlideStoppable(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_AutoSlideStoppable()
	 * @model
	 * @generated
	 */
	boolean isAutoSlideStoppable();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isAutoSlideStoppable <em>Auto Slide Stoppable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Slide Stoppable</em>' attribute.
	 * @see #isAutoSlideStoppable()
	 * @generated
	 */
	void setAutoSlideStoppable(boolean value);

	/**
	 * Returns the value of the '<em><b>Mouse Wheel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouse Wheel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouse Wheel</em>' attribute.
	 * @see #setMouseWheel(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_MouseWheel()
	 * @model
	 * @generated
	 */
	boolean isMouseWheel();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isMouseWheel <em>Mouse Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouse Wheel</em>' attribute.
	 * @see #isMouseWheel()
	 * @generated
	 */
	void setMouseWheel(boolean value);

	/**
	 * Returns the value of the '<em><b>Hide Address Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Address Bar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Address Bar</em>' attribute.
	 * @see #setHideAddressBar(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_HideAddressBar()
	 * @model
	 * @generated
	 */
	boolean isHideAddressBar();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isHideAddressBar <em>Hide Address Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Address Bar</em>' attribute.
	 * @see #isHideAddressBar()
	 * @generated
	 */
	void setHideAddressBar(boolean value);

	/**
	 * Returns the value of the '<em><b>Preview Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preview Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preview Links</em>' attribute.
	 * @see #setPreviewLinks(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_PreviewLinks()
	 * @model
	 * @generated
	 */
	boolean isPreviewLinks();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#isPreviewLinks <em>Preview Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preview Links</em>' attribute.
	 * @see #isPreviewLinks()
	 * @generated
	 */
	void setPreviewLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' attribute.
	 * The literals are from the enumeration {@link com.cohesionforce.reveal.TransitionStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' attribute.
	 * @see com.cohesionforce.reveal.TransitionStyle
	 * @see #setTransition(TransitionStyle)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Transition()
	 * @model
	 * @generated
	 */
	TransitionStyle getTransition();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getTransition <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' attribute.
	 * @see com.cohesionforce.reveal.TransitionStyle
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(TransitionStyle value);

	/**
	 * Returns the value of the '<em><b>Transition Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link com.cohesionforce.reveal.TransitionSpeed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Speed</em>' attribute.
	 * @see com.cohesionforce.reveal.TransitionSpeed
	 * @see #setTransitionSpeed(TransitionSpeed)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_TransitionSpeed()
	 * @model
	 * @generated
	 */
	TransitionSpeed getTransitionSpeed();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getTransitionSpeed <em>Transition Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Speed</em>' attribute.
	 * @see com.cohesionforce.reveal.TransitionSpeed
	 * @see #getTransitionSpeed()
	 * @generated
	 */
	void setTransitionSpeed(TransitionSpeed value);

	/**
	 * Returns the value of the '<em><b>Background Transition</b></em>' attribute.
	 * The literals are from the enumeration {@link com.cohesionforce.reveal.TransitionStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Transition</em>' attribute.
	 * @see com.cohesionforce.reveal.TransitionStyle
	 * @see #setBackgroundTransition(TransitionStyle)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_BackgroundTransition()
	 * @model
	 * @generated
	 */
	TransitionStyle getBackgroundTransition();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getBackgroundTransition <em>Background Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Transition</em>' attribute.
	 * @see com.cohesionforce.reveal.TransitionStyle
	 * @see #getBackgroundTransition()
	 * @generated
	 */
	void setBackgroundTransition(TransitionStyle value);

	/**
	 * Returns the value of the '<em><b>View Distance</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Distance</em>' attribute.
	 * @see #setViewDistance(int)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_ViewDistance()
	 * @model default="3"
	 * @generated
	 */
	int getViewDistance();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getViewDistance <em>View Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Distance</em>' attribute.
	 * @see #getViewDistance()
	 * @generated
	 */
	void setViewDistance(int value);

	/**
	 * Returns the value of the '<em><b>Parallax Background Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallax Background Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallax Background Image</em>' attribute.
	 * @see #setParallaxBackgroundImage(String)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_ParallaxBackgroundImage()
	 * @model
	 * @generated
	 */
	String getParallaxBackgroundImage();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundImage <em>Parallax Background Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallax Background Image</em>' attribute.
	 * @see #getParallaxBackgroundImage()
	 * @generated
	 */
	void setParallaxBackgroundImage(String value);

	/**
	 * Returns the value of the '<em><b>Parallax Background Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallax Background Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallax Background Size</em>' attribute.
	 * @see #setParallaxBackgroundSize(String)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_ParallaxBackgroundSize()
	 * @model
	 * @generated
	 */
	String getParallaxBackgroundSize();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundSize <em>Parallax Background Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallax Background Size</em>' attribute.
	 * @see #getParallaxBackgroundSize()
	 * @generated
	 */
	void setParallaxBackgroundSize(String value);

	/**
	 * Returns the value of the '<em><b>Parallax Background Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallax Background Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallax Background Horizontal</em>' attribute.
	 * @see #setParallaxBackgroundHorizontal(String)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_ParallaxBackgroundHorizontal()
	 * @model
	 * @generated
	 */
	String getParallaxBackgroundHorizontal();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundHorizontal <em>Parallax Background Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallax Background Horizontal</em>' attribute.
	 * @see #getParallaxBackgroundHorizontal()
	 * @generated
	 */
	void setParallaxBackgroundHorizontal(String value);

	/**
	 * Returns the value of the '<em><b>Parallax Background Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallax Background Vertical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallax Background Vertical</em>' attribute.
	 * @see #setParallaxBackgroundVertical(String)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_ParallaxBackgroundVertical()
	 * @model
	 * @generated
	 */
	String getParallaxBackgroundVertical();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getParallaxBackgroundVertical <em>Parallax Background Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallax Background Vertical</em>' attribute.
	 * @see #getParallaxBackgroundVertical()
	 * @generated
	 */
	void setParallaxBackgroundVertical(String value);

	/**
	 * Returns the value of the '<em><b>Slides</b></em>' containment reference list.
	 * The list contents are of type {@link com.cohesionforce.reveal.Slide}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slides</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slides</em>' containment reference list.
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Slides()
	 * @model containment="true"
	 * @generated
	 */
	EList<Slide> getSlides();

	/**
	 * Returns the value of the '<em><b>Backgrounds</b></em>' containment reference list.
	 * The list contents are of type {@link com.cohesionforce.reveal.Background}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backgrounds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backgrounds</em>' containment reference list.
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Backgrounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Background> getBackgrounds();

	/**
	 * Returns the value of the '<em><b>Theme</b></em>' attribute.
	 * The literals are from the enumeration {@link com.cohesionforce.reveal.Theme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theme</em>' attribute.
	 * @see com.cohesionforce.reveal.Theme
	 * @see #setTheme(Theme)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Theme()
	 * @model
	 * @generated
	 */
	Theme getTheme();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getTheme <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theme</em>' attribute.
	 * @see com.cohesionforce.reveal.Theme
	 * @see #getTheme()
	 * @generated
	 */
	void setTheme(Theme value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"960"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Width()
	 * @model default="960"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"700"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Height()
	 * @model default="700"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Margin</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin</em>' attribute.
	 * @see #setMargin(float)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_Margin()
	 * @model default="0.1"
	 * @generated
	 */
	float getMargin();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getMargin <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin</em>' attribute.
	 * @see #getMargin()
	 * @generated
	 */
	void setMargin(float value);

	/**
	 * Returns the value of the '<em><b>Min Scale</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Scale</em>' attribute.
	 * @see #setMinScale(float)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_MinScale()
	 * @model default="0.2"
	 * @generated
	 */
	float getMinScale();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getMinScale <em>Min Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Scale</em>' attribute.
	 * @see #getMinScale()
	 * @generated
	 */
	void setMinScale(float value);

	/**
	 * Returns the value of the '<em><b>Max Scale</b></em>' attribute.
	 * The default value is <code>"1.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Scale</em>' attribute.
	 * @see #setMaxScale(float)
	 * @see com.cohesionforce.reveal.RevealPackage#getPresentation_MaxScale()
	 * @model default="1.5"
	 * @generated
	 */
	float getMaxScale();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Presentation#getMaxScale <em>Max Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Scale</em>' attribute.
	 * @see #getMaxScale()
	 * @generated
	 */
	void setMaxScale(float value);

} // Presentation
