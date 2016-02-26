/**
 */
package com.cohesionforce.reveal.provider;


import com.cohesionforce.reveal.Presentation;
import com.cohesionforce.reveal.RevealFactory;
import com.cohesionforce.reveal.RevealPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.cohesionforce.reveal.Presentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addControlsPropertyDescriptor(object);
			addProgressPropertyDescriptor(object);
			addSlideNumberPropertyDescriptor(object);
			addHistoryPropertyDescriptor(object);
			addKeyboardPropertyDescriptor(object);
			addCenterPropertyDescriptor(object);
			addTouchPropertyDescriptor(object);
			addLoopPropertyDescriptor(object);
			addRtlPropertyDescriptor(object);
			addFragmentsPropertyDescriptor(object);
			addEmbeddedPropertyDescriptor(object);
			addHelpPropertyDescriptor(object);
			addShowNotesPropertyDescriptor(object);
			addAutoSlidePropertyDescriptor(object);
			addAutoSlideStoppablePropertyDescriptor(object);
			addMouseWheelPropertyDescriptor(object);
			addHideAddressBarPropertyDescriptor(object);
			addPreviewLinksPropertyDescriptor(object);
			addTransitionPropertyDescriptor(object);
			addTransitionSpeedPropertyDescriptor(object);
			addBackgroundTransitionPropertyDescriptor(object);
			addViewDistancePropertyDescriptor(object);
			addParallaxBackgroundImagePropertyDescriptor(object);
			addParallaxBackgroundSizePropertyDescriptor(object);
			addParallaxBackgroundHorizontalPropertyDescriptor(object);
			addParallaxBackgroundVerticalPropertyDescriptor(object);
			addThemePropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addMarginPropertyDescriptor(object);
			addMinScalePropertyDescriptor(object);
			addMaxScalePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Controls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_controls_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_controls_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__CONTROLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Progress feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_progress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_progress_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__PROGRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Slide Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlideNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_slideNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_slideNumber_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__SLIDE_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the History feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHistoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_history_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_history_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__HISTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Keyboard feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyboardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_keyboard_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_keyboard_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__KEYBOARD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Center feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCenterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_center_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_center_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__CENTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Touch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTouchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_touch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_touch_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__TOUCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Loop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_loop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_loop_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__LOOP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rtl feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRtlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_rtl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_rtl_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__RTL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fragments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFragmentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_fragments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_fragments_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__FRAGMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Embedded feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmbeddedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_embedded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_embedded_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__EMBEDDED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Help feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHelpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_help_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_help_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__HELP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_showNotes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_showNotes_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__SHOW_NOTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Slide feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoSlidePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_autoSlide_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_autoSlide_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__AUTO_SLIDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Slide Stoppable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoSlideStoppablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_autoSlideStoppable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_autoSlideStoppable_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__AUTO_SLIDE_STOPPABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mouse Wheel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMouseWheelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_mouseWheel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_mouseWheel_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__MOUSE_WHEEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hide Address Bar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHideAddressBarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_hideAddressBar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_hideAddressBar_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__HIDE_ADDRESS_BAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Preview Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreviewLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_previewLinks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_previewLinks_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__PREVIEW_LINKS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_transition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_transition_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__TRANSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transition Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransitionSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_transitionSpeed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_transitionSpeed_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__TRANSITION_SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Transition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundTransitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_backgroundTransition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_backgroundTransition_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__BACKGROUND_TRANSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the View Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_viewDistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_viewDistance_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__VIEW_DISTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parallax Background Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParallaxBackgroundImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_parallaxBackgroundImage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_parallaxBackgroundImage_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__PARALLAX_BACKGROUND_IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parallax Background Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParallaxBackgroundSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_parallaxBackgroundSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_parallaxBackgroundSize_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__PARALLAX_BACKGROUND_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parallax Background Horizontal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParallaxBackgroundHorizontalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_parallaxBackgroundHorizontal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_parallaxBackgroundHorizontal_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__PARALLAX_BACKGROUND_HORIZONTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parallax Background Vertical feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParallaxBackgroundVerticalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_parallaxBackgroundVertical_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_parallaxBackgroundVertical_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__PARALLAX_BACKGROUND_VERTICAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Theme feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThemePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_theme_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_theme_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__THEME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_width_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_height_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Margin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarginPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_margin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_margin_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__MARGIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_minScale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_minScale_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__MIN_SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Presentation_maxScale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Presentation_maxScale_feature", "_UI_Presentation_type"),
				 RevealPackage.Literals.PRESENTATION__MAX_SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RevealPackage.Literals.PRESENTATION__SLIDES);
			childrenFeatures.add(RevealPackage.Literals.PRESENTATION__BACKGROUNDS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Presentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Presentation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Presentation presentation = (Presentation)object;
		return getString("_UI_Presentation_type") + " " + presentation.isControls();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Presentation.class)) {
			case RevealPackage.PRESENTATION__CONTROLS:
			case RevealPackage.PRESENTATION__PROGRESS:
			case RevealPackage.PRESENTATION__SLIDE_NUMBER:
			case RevealPackage.PRESENTATION__HISTORY:
			case RevealPackage.PRESENTATION__KEYBOARD:
			case RevealPackage.PRESENTATION__CENTER:
			case RevealPackage.PRESENTATION__TOUCH:
			case RevealPackage.PRESENTATION__LOOP:
			case RevealPackage.PRESENTATION__RTL:
			case RevealPackage.PRESENTATION__FRAGMENTS:
			case RevealPackage.PRESENTATION__EMBEDDED:
			case RevealPackage.PRESENTATION__HELP:
			case RevealPackage.PRESENTATION__SHOW_NOTES:
			case RevealPackage.PRESENTATION__AUTO_SLIDE:
			case RevealPackage.PRESENTATION__AUTO_SLIDE_STOPPABLE:
			case RevealPackage.PRESENTATION__MOUSE_WHEEL:
			case RevealPackage.PRESENTATION__HIDE_ADDRESS_BAR:
			case RevealPackage.PRESENTATION__PREVIEW_LINKS:
			case RevealPackage.PRESENTATION__TRANSITION:
			case RevealPackage.PRESENTATION__TRANSITION_SPEED:
			case RevealPackage.PRESENTATION__BACKGROUND_TRANSITION:
			case RevealPackage.PRESENTATION__VIEW_DISTANCE:
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_IMAGE:
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_SIZE:
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_HORIZONTAL:
			case RevealPackage.PRESENTATION__PARALLAX_BACKGROUND_VERTICAL:
			case RevealPackage.PRESENTATION__THEME:
			case RevealPackage.PRESENTATION__WIDTH:
			case RevealPackage.PRESENTATION__HEIGHT:
			case RevealPackage.PRESENTATION__MARGIN:
			case RevealPackage.PRESENTATION__MIN_SCALE:
			case RevealPackage.PRESENTATION__MAX_SCALE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RevealPackage.PRESENTATION__SLIDES:
			case RevealPackage.PRESENTATION__BACKGROUNDS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RevealPackage.Literals.PRESENTATION__SLIDES,
				 RevealFactory.eINSTANCE.createSlide()));

		newChildDescriptors.add
			(createChildParameter
				(RevealPackage.Literals.PRESENTATION__BACKGROUNDS,
				 RevealFactory.eINSTANCE.createBackground()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RevealEditPlugin.INSTANCE;
	}

}
