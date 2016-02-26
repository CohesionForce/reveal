/**
 */
package com.cohesionforce.reveal.impl;

import com.cohesionforce.reveal.Background;
import com.cohesionforce.reveal.RevealPackage;
import com.cohesionforce.reveal.Slide;
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
 * An implementation of the model object '<em><b>Slide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.reveal.impl.SlideImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.SlideImpl#isMarkdown <em>Markdown</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.SlideImpl#getText <em>Text</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.SlideImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.SlideImpl#getTransitionSpeed <em>Transition Speed</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.SlideImpl#getSlides <em>Slides</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlideImpl extends MinimalEObjectImpl.Container implements Slide {
	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected Background background;

	/**
	 * The default value of the '{@link #isMarkdown() <em>Markdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkdown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARKDOWN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMarkdown() <em>Markdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMarkdown()
	 * @generated
	 * @ordered
	 */
	protected boolean markdown = MARKDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

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
	 * The cached value of the '{@link #getSlides() <em>Slides</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlides()
	 * @generated
	 * @ordered
	 */
	protected EList<Slide> slides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RevealPackage.Literals.SLIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Background getBackground() {
		if (background != null && background.eIsProxy()) {
			InternalEObject oldBackground = (InternalEObject)background;
			background = (Background)eResolveProxy(oldBackground);
			if (background != oldBackground) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RevealPackage.SLIDE__BACKGROUND, oldBackground, background));
			}
		}
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Background basicGetBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(Background newBackground) {
		Background oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.SLIDE__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMarkdown() {
		return markdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkdown(boolean newMarkdown) {
		boolean oldMarkdown = markdown;
		markdown = newMarkdown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.SLIDE__MARKDOWN, oldMarkdown, markdown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.SLIDE__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.SLIDE__TRANSITION, oldTransition, transition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.SLIDE__TRANSITION_SPEED, oldTransitionSpeed, transitionSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slide> getSlides() {
		if (slides == null) {
			slides = new EObjectContainmentEList<Slide>(Slide.class, this, RevealPackage.SLIDE__SLIDES);
		}
		return slides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RevealPackage.SLIDE__SLIDES:
				return ((InternalEList<?>)getSlides()).basicRemove(otherEnd, msgs);
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
			case RevealPackage.SLIDE__BACKGROUND:
				if (resolve) return getBackground();
				return basicGetBackground();
			case RevealPackage.SLIDE__MARKDOWN:
				return isMarkdown();
			case RevealPackage.SLIDE__TEXT:
				return getText();
			case RevealPackage.SLIDE__TRANSITION:
				return getTransition();
			case RevealPackage.SLIDE__TRANSITION_SPEED:
				return getTransitionSpeed();
			case RevealPackage.SLIDE__SLIDES:
				return getSlides();
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
			case RevealPackage.SLIDE__BACKGROUND:
				setBackground((Background)newValue);
				return;
			case RevealPackage.SLIDE__MARKDOWN:
				setMarkdown((Boolean)newValue);
				return;
			case RevealPackage.SLIDE__TEXT:
				setText((String)newValue);
				return;
			case RevealPackage.SLIDE__TRANSITION:
				setTransition((TransitionStyle)newValue);
				return;
			case RevealPackage.SLIDE__TRANSITION_SPEED:
				setTransitionSpeed((TransitionSpeed)newValue);
				return;
			case RevealPackage.SLIDE__SLIDES:
				getSlides().clear();
				getSlides().addAll((Collection<? extends Slide>)newValue);
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
			case RevealPackage.SLIDE__BACKGROUND:
				setBackground((Background)null);
				return;
			case RevealPackage.SLIDE__MARKDOWN:
				setMarkdown(MARKDOWN_EDEFAULT);
				return;
			case RevealPackage.SLIDE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case RevealPackage.SLIDE__TRANSITION:
				setTransition(TRANSITION_EDEFAULT);
				return;
			case RevealPackage.SLIDE__TRANSITION_SPEED:
				setTransitionSpeed(TRANSITION_SPEED_EDEFAULT);
				return;
			case RevealPackage.SLIDE__SLIDES:
				getSlides().clear();
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
			case RevealPackage.SLIDE__BACKGROUND:
				return background != null;
			case RevealPackage.SLIDE__MARKDOWN:
				return markdown != MARKDOWN_EDEFAULT;
			case RevealPackage.SLIDE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case RevealPackage.SLIDE__TRANSITION:
				return transition != TRANSITION_EDEFAULT;
			case RevealPackage.SLIDE__TRANSITION_SPEED:
				return transitionSpeed != TRANSITION_SPEED_EDEFAULT;
			case RevealPackage.SLIDE__SLIDES:
				return slides != null && !slides.isEmpty();
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
		result.append(" (markdown: ");
		result.append(markdown);
		result.append(", text: ");
		result.append(text);
		result.append(", transition: ");
		result.append(transition);
		result.append(", transitionSpeed: ");
		result.append(transitionSpeed);
		result.append(')');
		return result.toString();
	}

} //SlideImpl
