/**
 */
package com.cohesionforce.reveal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.reveal.Slide#getBackground <em>Background</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Slide#isMarkdown <em>Markdown</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Slide#getText <em>Text</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Slide#getTransition <em>Transition</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Slide#getTransitionSpeed <em>Transition Speed</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Slide#getSlides <em>Slides</em>}</li>
 * </ul>
 *
 * @see com.cohesionforce.reveal.RevealPackage#getSlide()
 * @model
 * @generated
 */
public interface Slide extends EObject {
	/**
	 * Returns the value of the '<em><b>Background</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' reference.
	 * @see #setBackground(Background)
	 * @see com.cohesionforce.reveal.RevealPackage#getSlide_Background()
	 * @model
	 * @generated
	 */
	Background getBackground();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Slide#getBackground <em>Background</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' reference.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Background value);

	/**
	 * Returns the value of the '<em><b>Markdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markdown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markdown</em>' attribute.
	 * @see #setMarkdown(boolean)
	 * @see com.cohesionforce.reveal.RevealPackage#getSlide_Markdown()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isMarkdown();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Slide#isMarkdown <em>Markdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markdown</em>' attribute.
	 * @see #isMarkdown()
	 * @generated
	 */
	void setMarkdown(boolean value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see com.cohesionforce.reveal.RevealPackage#getSlide_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Slide#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

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
	 * @see com.cohesionforce.reveal.RevealPackage#getSlide_Transition()
	 * @model
	 * @generated
	 */
	TransitionStyle getTransition();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Slide#getTransition <em>Transition</em>}' attribute.
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
	 * @see com.cohesionforce.reveal.RevealPackage#getSlide_TransitionSpeed()
	 * @model
	 * @generated
	 */
	TransitionSpeed getTransitionSpeed();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Slide#getTransitionSpeed <em>Transition Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Speed</em>' attribute.
	 * @see com.cohesionforce.reveal.TransitionSpeed
	 * @see #getTransitionSpeed()
	 * @generated
	 */
	void setTransitionSpeed(TransitionSpeed value);

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
	 * @see com.cohesionforce.reveal.RevealPackage#getSlide_Slides()
	 * @model containment="true"
	 * @generated
	 */
	EList<Slide> getSlides();

} // Slide
