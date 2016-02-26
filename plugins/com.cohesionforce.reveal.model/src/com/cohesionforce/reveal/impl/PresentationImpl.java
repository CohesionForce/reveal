/**
 */
package com.cohesionforce.reveal.impl;

import com.cohesionforce.reveal.Background;
import com.cohesionforce.reveal.Presentation;
import com.cohesionforce.reveal.RevealPackage;
import com.cohesionforce.reveal.Slide;
import com.cohesionforce.reveal.Theme;
import com.cohesionforce.reveal.TransitionSpeed;
import com.cohesionforce.reveal.TransitionStyle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isControls <em>Controls</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isProgress <em>Progress</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isSlideNumber <em>Slide Number</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isHistory <em>History</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isKeyboard <em>Keyboard</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isCenter <em>Center</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isTouch <em>Touch</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isLoop <em>Loop</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isRtl <em>Rtl</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isFragments <em>Fragments</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isHelp <em>Help</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isShowNotes <em>Show Notes</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getAutoSlide <em>Auto Slide</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isAutoSlideStoppable <em>Auto Slide Stoppable</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isMouseWheel <em>Mouse Wheel</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isHideAddressBar <em>Hide Address Bar</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#isPreviewLinks <em>Preview Links</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getTransitionSpeed <em>Transition Speed</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getBackgroundTransition <em>Background Transition</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getViewDistance <em>View Distance</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getParallaxBackgroundImage <em>Parallax Background Image</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getParallaxBackgroundSize <em>Parallax Background Size</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getParallaxBackgroundHorizontal <em>Parallax Background Horizontal</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getParallaxBackgroundVertical <em>Parallax Background Vertical</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getSlides <em>Slides</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getBackgrounds <em>Backgrounds</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getTheme <em>Theme</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getMinScale <em>Min Scale</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.PresentationImpl#getMaxScale <em>Max Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationImpl extends MinimalEObjectImpl.Container implements Presentation {
	/**
	 * The default value of the '{@link #isControls() <em>Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControls()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTROLS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isControls() <em>Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isControls()
	 * @generated
	 * @ordered
	 */
	protected boolean controls = CONTROLS_EDEFAULT;

	/**
	 * The default value of the '{@link #isProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProgress()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROGRESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProgress()
	 * @generated
	 * @ordered
	 */
	protected boolean progress = PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isSlideNumber() <em>Slide Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSlideNumber()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SLIDE_NUMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSlideNumber() <em>Slide Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSlideNumber()
	 * @generated
	 * @ordered
	 */
	protected boolean slideNumber = SLIDE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HISTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHistory()
	 * @generated
	 * @ordered
	 */
	protected boolean history = HISTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isKeyboard() <em>Keyboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeyboard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEYBOARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKeyboard() <em>Keyboard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeyboard()
	 * @generated
	 * @ordered
	 */
	protected boolean keyboard = KEYBOARD_EDEFAULT;

	/**
	 * The default value of the '{@link #isCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCenter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CENTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCenter()
	 * @generated
	 * @ordered
	 */
	protected boolean center = CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isTouch() <em>Touch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTouch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TOUCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTouch() <em>Touch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTouch()
	 * @generated
	 * @ordered
	 */
	protected boolean touch = TOUCH_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoop()
	 * @generated
	 * @ordered
	 */
	protected boolean loop = LOOP_EDEFAULT;

	/**
	 * The default value of the '{@link #isRtl() <em>Rtl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRtl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RTL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRtl() <em>Rtl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRtl()
	 * @generated
	 * @ordered
	 */
	protected boolean rtl = RTL_EDEFAULT;

	/**
	 * The default value of the '{@link #isFragments() <em>Fragments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFragments()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRAGMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFragments() <em>Fragments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFragments()
	 * @generated
	 * @ordered
	 */
	protected boolean fragments = FRAGMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedded()
	 * @generated
	 * @ordered
	 */
	protected boolean embedded = EMBEDDED_EDEFAULT;

	/**
	 * The default value of the '{@link #isHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHelp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HELP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHelp() <em>Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHelp()
	 * @generated
	 * @ordered
	 */
	protected boolean help = HELP_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowNotes() <em>Show Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowNotes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_NOTES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowNotes() <em>Show Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowNotes()
	 * @generated
	 * @ordered
	 */
	protected boolean showNotes = SHOW_NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoSlide() <em>Auto Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSlide()
	 * @generated
	 * @ordered
	 */
	protected static final int AUTO_SLIDE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAutoSlide() <em>Auto Slide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSlide()
	 * @generated
	 * @ordered
	 */
	protected int autoSlide = AUTO_SLIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoSlideStoppable() <em>Auto Slide Stoppable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoSlideStoppable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_SLIDE_STOPPABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoSlideStoppable() <em>Auto Slide Stoppable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoSlideStoppable()
	 * @generated
	 * @ordered
	 */
	protected boolean autoSlideStoppable = AUTO_SLIDE_STOPPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMouseWheel() <em>Mouse Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMouseWheel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOUSE_WHEEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMouseWheel() <em>Mouse Wheel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMouseWheel()
	 * @generated
	 * @ordered
	 */
	protected boolean mouseWheel = MOUSE_WHEEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideAddressBar() <em>Hide Address Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideAddressBar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_ADDRESS_BAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideAddressBar() <em>Hide Address Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideAddressBar()
	 * @generated
	 * @ordered
	 */
	protected boolean hideAddressBar = HIDE_ADDRESS_BAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isPreviewLinks() <em>Preview Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreviewLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREVIEW_LINKS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreviewLinks() <em>Preview Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreviewLinks()
	 * @generated
	 * @ordered
	 */
	protected boolean previewLinks = PREVIEW_LINKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionStyle TRANSITION_EDEFAULT = TransitionStyle.DEFAULT;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected TransitionStyle transition = TRANSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitionSpeed() <em>Transition Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionSpeed TRANSITION_SPEED_EDEFAULT = TransitionSpeed.DEFAULT;

	/**
	 * The cached value of the '{@link #getTransitionSpeed() <em>Transition Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionSpeed()
	 * @generated
	 * @ordered
	 */
	protected TransitionSpeed transitionSpeed = TRANSITION_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundTransition() <em>Background Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundTransition()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionStyle BACKGROUND_TRANSITION_EDEFAULT = TransitionStyle.DEFAULT;

	/**
	 * The cached value of the '{@link #getBackgroundTransition() <em>Background Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundTransition()
	 * @generated
	 * @ordered
	 */
	protected TransitionStyle backgroundTransition = BACKGROUND_TRANSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewDistance() <em>View Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int VIEW_DISTANCE_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getViewDistance() <em>View Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewDistance()
	 * @generated
	 * @ordered
	 */
	protected int viewDistance = VIEW_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallaxBackgroundImage() <em>Parallax Background Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallaxBackgroundImage()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLAX_BACKGROUND_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallaxBackgroundImage() <em>Parallax Background Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallaxBackgroundImage()
	 * @generated
	 * @ordered
	 */
	protected String parallaxBackgroundImage = PARALLAX_BACKGROUND_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallaxBackgroundSize() <em>Parallax Background Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallaxBackgroundSize()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLAX_BACKGROUND_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallaxBackgroundSize() <em>Parallax Background Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallaxBackgroundSize()
	 * @generated
	 * @ordered
	 */
	protected String parallaxBackgroundSize = PARALLAX_BACKGROUND_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallaxBackgroundHorizontal() <em>Parallax Background Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallaxBackgroundHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLAX_BACKGROUND_HORIZONTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallaxBackgroundHorizontal() <em>Parallax Background Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallaxBackgroundHorizontal()
	 * @generated
	 * @ordered
	 */
	protected String parallaxBackgroundHorizontal = PARALLAX_BACKGROUND_HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallaxBackgroundVertical() <em>Parallax Background Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallaxBackgroundVertical()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLAX_BACKGROUND_VERTICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallaxBackgroundVertical() <em>Parallax Background Vertical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallaxBackgroundVertical()
	 * @generated
	 * @ordered
	 */
	protected String parallaxBackgroundVertical = PARALLAX_BACKGROUND_VERTICAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSlides() <em>Slides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlides()
	 * @generated
	 * @ordered
	 */
	protected EList<Slide> slides;

	/**
	 * The cached value of the '{@link #getBackgrounds() <em>Backgrounds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgrounds()
	 * @generated
	 * @ordered
	 */
	protected EList<Background> backgrounds;

	/**
	 * The default value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected static final Theme THEME_EDEFAULT = Theme.BLACK;

	/**
	 * The cached value of the '{@link #getTheme() <em>Theme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheme()
	 * @generated
	 * @ordered
	 */
	protected Theme theme = THEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 960;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 700;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected static final float MARGIN_EDEFAULT = 0.1F;

	/**
	 * The cached value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected float margin = MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinScale() <em>Min Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinScale()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_SCALE_EDEFAULT = 0.2F;

	/**
	 * The cached value of the '{@link #getMinScale() <em>Min Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinScale()
	 * @generated
	 * @ordered
	 */
	protected float minScale = MIN_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxScale() <em>Max Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScale()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_SCALE_EDEFAULT = 1.5F;

	/**
	 * The cached value of the '{@link #getMaxScale() <em>Max Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScale()
	 * @generated
	 * @ordered
	 */
	protected float maxScale = MAX_SCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RevealPackage.Literals.PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControls() {
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControls(boolean newControls) {
		boolean oldControls = controls;
		controls = newControls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__CONTROLS, oldControls, controls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProgress() {
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(boolean newProgress) {
		boolean oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSlideNumber() {
		return slideNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlideNumber(boolean newSlideNumber) {
		boolean oldSlideNumber = slideNumber;
		slideNumber = newSlideNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__SLIDE_NUMBER, oldSlideNumber, slideNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistory(boolean newHistory) {
		boolean oldHistory = history;
		history = newHistory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__HISTORY, oldHistory, history));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKeyboard() {
		return keyboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyboard(boolean newKeyboard) {
		boolean oldKeyboard = keyboard;
		keyboard = newKeyboard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__KEYBOARD, oldKeyboard, keyboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(boolean newCenter) {
		boolean oldCenter = center;
		center = newCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__CENTER, oldCenter, center));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTouch() {
		return touch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTouch(boolean newTouch) {
		boolean oldTouch = touch;
		touch = newTouch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__TOUCH, oldTouch, touch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoop() {
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoop(boolean newLoop) {
		boolean oldLoop = loop;
		loop = newLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__LOOP, oldLoop, loop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRtl() {
		return rtl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtl(boolean newRtl) {
		boolean oldRtl = rtl;
		rtl = newRtl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__RTL, oldRtl, rtl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFragments() {
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFragments(boolean newFragments) {
		boolean oldFragments = fragments;
		fragments = newFragments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__FRAGMENTS, oldFragments, fragments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmbedded() {
		return embedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedded(boolean newEmbedded) {
		boolean oldEmbedded = embedded;
		embedded = newEmbedded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__EMBEDDED, oldEmbedded, embedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHelp() {
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelp(boolean newHelp) {
		boolean oldHelp = help;
		help = newHelp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__HELP, oldHelp, help));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowNotes() {
		return showNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowNotes(boolean newShowNotes) {
		boolean oldShowNotes = showNotes;
		showNotes = newShowNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__SHOW_NOTES, oldShowNotes, showNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAutoSlide() {
		return autoSlide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoSlide(int newAutoSlide) {
		int oldAutoSlide = autoSlide;
		autoSlide = newAutoSlide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__AUTO_SLIDE, oldAutoSlide, autoSlide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoSlideStoppable() {
		return autoSlideStoppable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoSlideStoppable(boolean newAutoSlideStoppable) {
		boolean oldAutoSlideStoppable = autoSlideStoppable;
		autoSlideStoppable = newAutoSlideStoppable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__AUTO_SLIDE_STOPPABLE, oldAutoSlideStoppable, autoSlideStoppable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMouseWheel() {
		return mouseWheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMouseWheel(boolean newMouseWheel) {
		boolean oldMouseWheel = mouseWheel;
		mouseWheel = newMouseWheel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__MOUSE_WHEEL, oldMouseWheel, mouseWheel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideAddressBar() {
		return hideAddressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideAddressBar(boolean newHideAddressBar) {
		boolean oldHideAddressBar = hideAddressBar;
		hideAddressBar = newHideAddressBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__HIDE_ADDRESS_BAR, oldHideAddressBar, hideAddressBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreviewLinks() {
		return previewLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviewLinks(boolean newPreviewLinks) {
		boolean oldPreviewLinks = previewLinks;
		previewLinks = newPreviewLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__PREVIEW_LINKS, oldPreviewLinks, previewLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionStyle getTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(TransitionStyle newTransition) {
		TransitionStyle oldTransition = transition;
		transition = newTransition == null ? TRANSITION_EDEFAULT : newTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__TRANSITION, oldTransition, transition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionSpeed getTransitionSpeed() {
		return transitionSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionSpeed(TransitionSpeed newTransitionSpeed) {
		TransitionSpeed oldTransitionSpeed = transitionSpeed;
		transitionSpeed = newTransitionSpeed == null ? TRANSITION_SPEED_EDEFAULT : newTransitionSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__TRANSITION_SPEED, oldTransitionSpeed, transitionSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionStyle getBackgroundTransition() {
		return backgroundTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundTransition(TransitionStyle newBackgroundTransition) {
		TransitionStyle oldBackgroundTransition = backgroundTransition;
		backgroundTransition = newBackgroundTransition == null ? BACKGROUND_TRANSITION_EDEFAULT : newBackgroundTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__BACKGROUND_TRANSITION, oldBackgroundTransition, backgroundTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getViewDistance() {
		return viewDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewDistance(int newViewDistance) {
		int oldViewDistance = viewDistance;
		viewDistance = newViewDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__VIEW_DISTANCE, oldViewDistance, viewDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParallaxBackgroundImage() {
		return parallaxBackgroundImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallaxBackgroundImage(String newParallaxBackgroundImage) {
		String oldParallaxBackgroundImage = parallaxBackgroundImage;
		parallaxBackgroundImage = newParallaxBackgroundImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_IMAGE, oldParallaxBackgroundImage, parallaxBackgroundImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParallaxBackgroundSize() {
		return parallaxBackgroundSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallaxBackgroundSize(String newParallaxBackgroundSize) {
		String oldParallaxBackgroundSize = parallaxBackgroundSize;
		parallaxBackgroundSize = newParallaxBackgroundSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_SIZE, oldParallaxBackgroundSize, parallaxBackgroundSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParallaxBackgroundHorizontal() {
		return parallaxBackgroundHorizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallaxBackgroundHorizontal(String newParallaxBackgroundHorizontal) {
		String oldParallaxBackgroundHorizontal = parallaxBackgroundHorizontal;
		parallaxBackgroundHorizontal = newParallaxBackgroundHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_HORIZONTAL, oldParallaxBackgroundHorizontal, parallaxBackgroundHorizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParallaxBackgroundVertical() {
		return parallaxBackgroundVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallaxBackgroundVertical(String newParallaxBackgroundVertical) {
		String oldParallaxBackgroundVertical = parallaxBackgroundVertical;
		parallaxBackgroundVertical = newParallaxBackgroundVertical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_VERTICAL, oldParallaxBackgroundVertical, parallaxBackgroundVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slide> getSlides() {
		if (slides == null) {
			slides = new EObjectContainmentEList<Slide>(Slide.class, this, RevealPackage.PRESENTATION__SLIDES);
		}
		return slides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Background> getBackgrounds() {
		if (backgrounds == null) {
			backgrounds = new EObjectContainmentEList<Background>(Background.class, this, RevealPackage.PRESENTATION__BACKGROUNDS);
		}
		return backgrounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme getTheme() {
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheme(Theme newTheme) {
		Theme oldTheme = theme;
		theme = newTheme == null ? THEME_EDEFAULT : newTheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__THEME, oldTheme, theme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(float newMargin) {
		float oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinScale() {
		return minScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinScale(float newMinScale) {
		float oldMinScale = minScale;
		minScale = newMinScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__MIN_SCALE, oldMinScale, minScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxScale() {
		return maxScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxScale(float newMaxScale) {
		float oldMaxScale = maxScale;
		maxScale = newMaxScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.PRESENTATION__MAX_SCALE, oldMaxScale, maxScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RevealPackage.PRESENTATION__SLIDES:
				return ((InternalEList<?>)getSlides()).basicRemove(otherEnd, msgs);
			case RevealPackage.PRESENTATION__BACKGROUNDS:
				return ((InternalEList<?>)getBackgrounds()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RevealPackage.PRESENTATION__CONTROLS:
				return isControls();
			case RevealPackage.PRESENTATION__PROGRESS:
				return isProgress();
			case RevealPackage.PRESENTATION__SLIDE_NUMBER:
				return isSlideNumber();
			case RevealPackage.PRESENTATION__HISTORY:
				return isHistory();
			case RevealPackage.PRESENTATION__KEYBOARD:
				return isKeyboard();
			case RevealPackage.PRESENTATION__CENTER:
				return isCenter();
			case RevealPackage.PRESENTATION__TOUCH:
				return isTouch();
			case RevealPackage.PRESENTATION__LOOP:
				return isLoop();
			case RevealPackage.PRESENTATION__RTL:
				return isRtl();
			case RevealPackage.PRESENTATION__FRAGMENTS:
				return isFragments();
			case RevealPackage.PRESENTATION__EMBEDDED:
				return isEmbedded();
			case RevealPackage.PRESENTATION__HELP:
				return isHelp();
			case RevealPackage.PRESENTATION__SHOW_NOTES:
				return isShowNotes();
			case RevealPackage.PRESENTATION__AUTO_SLIDE:
				return getAutoSlide();
			case RevealPackage.PRESENTATION__AUTO_SLIDE_STOPPABLE:
				return isAutoSlideStoppable();
			case RevealPackage.PRESENTATION__MOUSE_WHEEL:
				return isMouseWheel();
			case RevealPackage.PRESENTATION__HIDE_ADDRESS_BAR:
				return isHideAddressBar();
			case RevealPackage.PRESENTATION__PREVIEW_LINKS:
				return isPreviewLinks();
			case RevealPackage.PRESENTATION__TRANSITION:
				return getTransition();
			case RevealPackage.PRESENTATION__TRANSITION_SPEED:
				return getTransitionSpeed();
			case RevealPackage.PRESENTATION__BACKGROUND_TRANSITION:
				return getBackgroundTransition();
			case RevealPackage.PRESENTATION__VIEW_DISTANCE:
				return getViewDistance();
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_IMAGE:
				return getParallaxBackgroundImage();
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_SIZE:
				return getParallaxBackgroundSize();
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_HORIZONTAL:
				return getParallaxBackgroundHorizontal();
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_VERTICAL:
				return getParallaxBackgroundVertical();
			case RevealPackage.PRESENTATION__SLIDES:
				return getSlides();
			case RevealPackage.PRESENTATION__BACKGROUNDS:
				return getBackgrounds();
			case RevealPackage.PRESENTATION__THEME:
				return getTheme();
			case RevealPackage.PRESENTATION__WIDTH:
				return getWidth();
			case RevealPackage.PRESENTATION__HEIGHT:
				return getHeight();
			case RevealPackage.PRESENTATION__MARGIN:
				return getMargin();
			case RevealPackage.PRESENTATION__MIN_SCALE:
				return getMinScale();
			case RevealPackage.PRESENTATION__MAX_SCALE:
				return getMaxScale();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RevealPackage.PRESENTATION__CONTROLS:
				setControls((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__PROGRESS:
				setProgress((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__SLIDE_NUMBER:
				setSlideNumber((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__HISTORY:
				setHistory((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__KEYBOARD:
				setKeyboard((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__CENTER:
				setCenter((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__TOUCH:
				setTouch((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__LOOP:
				setLoop((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__RTL:
				setRtl((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__FRAGMENTS:
				setFragments((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__EMBEDDED:
				setEmbedded((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__HELP:
				setHelp((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__SHOW_NOTES:
				setShowNotes((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__AUTO_SLIDE:
				setAutoSlide((Integer)newValue);
				return;
			case RevealPackage.PRESENTATION__AUTO_SLIDE_STOPPABLE:
				setAutoSlideStoppable((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__MOUSE_WHEEL:
				setMouseWheel((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__HIDE_ADDRESS_BAR:
				setHideAddressBar((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__PREVIEW_LINKS:
				setPreviewLinks((Boolean)newValue);
				return;
			case RevealPackage.PRESENTATION__TRANSITION:
				setTransition((TransitionStyle)newValue);
				return;
			case RevealPackage.PRESENTATION__TRANSITION_SPEED:
				setTransitionSpeed((TransitionSpeed)newValue);
				return;
			case RevealPackage.PRESENTATION__BACKGROUND_TRANSITION:
				setBackgroundTransition((TransitionStyle)newValue);
				return;
			case RevealPackage.PRESENTATION__VIEW_DISTANCE:
				setViewDistance((Integer)newValue);
				return;
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_IMAGE:
				setParallaxBackgroundImage((String)newValue);
				return;
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_SIZE:
				setParallaxBackgroundSize((String)newValue);
				return;
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_HORIZONTAL:
				setParallaxBackgroundHorizontal((String)newValue);
				return;
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_VERTICAL:
				setParallaxBackgroundVertical((String)newValue);
				return;
			case RevealPackage.PRESENTATION__SLIDES:
				getSlides().clear();
				getSlides().addAll((Collection<? extends Slide>)newValue);
				return;
			case RevealPackage.PRESENTATION__BACKGROUNDS:
				getBackgrounds().clear();
				getBackgrounds().addAll((Collection<? extends Background>)newValue);
				return;
			case RevealPackage.PRESENTATION__THEME:
				setTheme((Theme)newValue);
				return;
			case RevealPackage.PRESENTATION__WIDTH:
				setWidth((Integer)newValue);
				return;
			case RevealPackage.PRESENTATION__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case RevealPackage.PRESENTATION__MARGIN:
				setMargin((Float)newValue);
				return;
			case RevealPackage.PRESENTATION__MIN_SCALE:
				setMinScale((Float)newValue);
				return;
			case RevealPackage.PRESENTATION__MAX_SCALE:
				setMaxScale((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RevealPackage.PRESENTATION__CONTROLS:
				setControls(CONTROLS_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__SLIDE_NUMBER:
				setSlideNumber(SLIDE_NUMBER_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__HISTORY:
				setHistory(HISTORY_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__KEYBOARD:
				setKeyboard(KEYBOARD_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__CENTER:
				setCenter(CENTER_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__TOUCH:
				setTouch(TOUCH_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__LOOP:
				setLoop(LOOP_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__RTL:
				setRtl(RTL_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__FRAGMENTS:
				setFragments(FRAGMENTS_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__EMBEDDED:
				setEmbedded(EMBEDDED_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__HELP:
				setHelp(HELP_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__SHOW_NOTES:
				setShowNotes(SHOW_NOTES_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__AUTO_SLIDE:
				setAutoSlide(AUTO_SLIDE_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__AUTO_SLIDE_STOPPABLE:
				setAutoSlideStoppable(AUTO_SLIDE_STOPPABLE_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__MOUSE_WHEEL:
				setMouseWheel(MOUSE_WHEEL_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__HIDE_ADDRESS_BAR:
				setHideAddressBar(HIDE_ADDRESS_BAR_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__PREVIEW_LINKS:
				setPreviewLinks(PREVIEW_LINKS_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__TRANSITION:
				setTransition(TRANSITION_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__TRANSITION_SPEED:
				setTransitionSpeed(TRANSITION_SPEED_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__BACKGROUND_TRANSITION:
				setBackgroundTransition(BACKGROUND_TRANSITION_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__VIEW_DISTANCE:
				setViewDistance(VIEW_DISTANCE_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_IMAGE:
				setParallaxBackgroundImage(PARALLAX_BACKGROUND_IMAGE_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_SIZE:
				setParallaxBackgroundSize(PARALLAX_BACKGROUND_SIZE_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_HORIZONTAL:
				setParallaxBackgroundHorizontal(PARALLAX_BACKGROUND_HORIZONTAL_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_VERTICAL:
				setParallaxBackgroundVertical(PARALLAX_BACKGROUND_VERTICAL_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__SLIDES:
				getSlides().clear();
				return;
			case RevealPackage.PRESENTATION__BACKGROUNDS:
				getBackgrounds().clear();
				return;
			case RevealPackage.PRESENTATION__THEME:
				setTheme(THEME_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__MIN_SCALE:
				setMinScale(MIN_SCALE_EDEFAULT);
				return;
			case RevealPackage.PRESENTATION__MAX_SCALE:
				setMaxScale(MAX_SCALE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RevealPackage.PRESENTATION__CONTROLS:
				return controls != CONTROLS_EDEFAULT;
			case RevealPackage.PRESENTATION__PROGRESS:
				return progress != PROGRESS_EDEFAULT;
			case RevealPackage.PRESENTATION__SLIDE_NUMBER:
				return slideNumber != SLIDE_NUMBER_EDEFAULT;
			case RevealPackage.PRESENTATION__HISTORY:
				return history != HISTORY_EDEFAULT;
			case RevealPackage.PRESENTATION__KEYBOARD:
				return keyboard != KEYBOARD_EDEFAULT;
			case RevealPackage.PRESENTATION__CENTER:
				return center != CENTER_EDEFAULT;
			case RevealPackage.PRESENTATION__TOUCH:
				return touch != TOUCH_EDEFAULT;
			case RevealPackage.PRESENTATION__LOOP:
				return loop != LOOP_EDEFAULT;
			case RevealPackage.PRESENTATION__RTL:
				return rtl != RTL_EDEFAULT;
			case RevealPackage.PRESENTATION__FRAGMENTS:
				return fragments != FRAGMENTS_EDEFAULT;
			case RevealPackage.PRESENTATION__EMBEDDED:
				return embedded != EMBEDDED_EDEFAULT;
			case RevealPackage.PRESENTATION__HELP:
				return help != HELP_EDEFAULT;
			case RevealPackage.PRESENTATION__SHOW_NOTES:
				return showNotes != SHOW_NOTES_EDEFAULT;
			case RevealPackage.PRESENTATION__AUTO_SLIDE:
				return autoSlide != AUTO_SLIDE_EDEFAULT;
			case RevealPackage.PRESENTATION__AUTO_SLIDE_STOPPABLE:
				return autoSlideStoppable != AUTO_SLIDE_STOPPABLE_EDEFAULT;
			case RevealPackage.PRESENTATION__MOUSE_WHEEL:
				return mouseWheel != MOUSE_WHEEL_EDEFAULT;
			case RevealPackage.PRESENTATION__HIDE_ADDRESS_BAR:
				return hideAddressBar != HIDE_ADDRESS_BAR_EDEFAULT;
			case RevealPackage.PRESENTATION__PREVIEW_LINKS:
				return previewLinks != PREVIEW_LINKS_EDEFAULT;
			case RevealPackage.PRESENTATION__TRANSITION:
				return transition != TRANSITION_EDEFAULT;
			case RevealPackage.PRESENTATION__TRANSITION_SPEED:
				return transitionSpeed != TRANSITION_SPEED_EDEFAULT;
			case RevealPackage.PRESENTATION__BACKGROUND_TRANSITION:
				return backgroundTransition != BACKGROUND_TRANSITION_EDEFAULT;
			case RevealPackage.PRESENTATION__VIEW_DISTANCE:
				return viewDistance != VIEW_DISTANCE_EDEFAULT;
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_IMAGE:
				return PARALLAX_BACKGROUND_IMAGE_EDEFAULT == null ? parallaxBackgroundImage != null : !PARALLAX_BACKGROUND_IMAGE_EDEFAULT.equals(parallaxBackgroundImage);
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_SIZE:
				return PARALLAX_BACKGROUND_SIZE_EDEFAULT == null ? parallaxBackgroundSize != null : !PARALLAX_BACKGROUND_SIZE_EDEFAULT.equals(parallaxBackgroundSize);
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_HORIZONTAL:
				return PARALLAX_BACKGROUND_HORIZONTAL_EDEFAULT == null ? parallaxBackgroundHorizontal != null : !PARALLAX_BACKGROUND_HORIZONTAL_EDEFAULT.equals(parallaxBackgroundHorizontal);
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_VERTICAL:
				return PARALLAX_BACKGROUND_VERTICAL_EDEFAULT == null ? parallaxBackgroundVertical != null : !PARALLAX_BACKGROUND_VERTICAL_EDEFAULT.equals(parallaxBackgroundVertical);
			case RevealPackage.PRESENTATION__SLIDES:
				return slides != null && !slides.isEmpty();
			case RevealPackage.PRESENTATION__BACKGROUNDS:
				return backgrounds != null && !backgrounds.isEmpty();
			case RevealPackage.PRESENTATION__THEME:
				return theme != THEME_EDEFAULT;
			case RevealPackage.PRESENTATION__WIDTH:
				return width != WIDTH_EDEFAULT;
			case RevealPackage.PRESENTATION__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case RevealPackage.PRESENTATION__MARGIN:
				return margin != MARGIN_EDEFAULT;
			case RevealPackage.PRESENTATION__MIN_SCALE:
				return minScale != MIN_SCALE_EDEFAULT;
			case RevealPackage.PRESENTATION__MAX_SCALE:
				return maxScale != MAX_SCALE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (controls: ");
		result.append(controls);
		result.append(", progress: ");
		result.append(progress);
		result.append(", slideNumber: ");
		result.append(slideNumber);
		result.append(", history: ");
		result.append(history);
		result.append(", keyboard: ");
		result.append(keyboard);
		result.append(", center: ");
		result.append(center);
		result.append(", touch: ");
		result.append(touch);
		result.append(", loop: ");
		result.append(loop);
		result.append(", rtl: ");
		result.append(rtl);
		result.append(", fragments: ");
		result.append(fragments);
		result.append(", embedded: ");
		result.append(embedded);
		result.append(", help: ");
		result.append(help);
		result.append(", showNotes: ");
		result.append(showNotes);
		result.append(", autoSlide: ");
		result.append(autoSlide);
		result.append(", autoSlideStoppable: ");
		result.append(autoSlideStoppable);
		result.append(", mouseWheel: ");
		result.append(mouseWheel);
		result.append(", hideAddressBar: ");
		result.append(hideAddressBar);
		result.append(", previewLinks: ");
		result.append(previewLinks);
		result.append(", transition: ");
		result.append(transition);
		result.append(", transitionSpeed: ");
		result.append(transitionSpeed);
		result.append(", backgroundTransition: ");
		result.append(backgroundTransition);
		result.append(", viewDistance: ");
		result.append(viewDistance);
		result.append(", parallaxBackgroundImage: ");
		result.append(parallaxBackgroundImage);
		result.append(", parallaxBackgroundSize: ");
		result.append(parallaxBackgroundSize);
		result.append(", parallaxBackgroundHorizontal: ");
		result.append(parallaxBackgroundHorizontal);
		result.append(", parallaxBackgroundVertical: ");
		result.append(parallaxBackgroundVertical);
		result.append(", theme: ");
		result.append(theme);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", margin: ");
		result.append(margin);
		result.append(", minScale: ");
		result.append(minScale);
		result.append(", maxScale: ");
		result.append(maxScale);
		result.append(')');
		return result.toString();
	}

} //PresentationImpl
