/**
 */
package com.cohesionforce.reveal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.reveal.Background#getSrc <em>Src</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Background#getSize <em>Size</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.Background#getRepeat <em>Repeat</em>}</li>
 * </ul>
 *
 * @see com.cohesionforce.reveal.RevealPackage#getBackground()
 * @model
 * @generated
 */
public interface Background extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see com.cohesionforce.reveal.RevealPackage#getBackground_Src()
	 * @model
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Background#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see com.cohesionforce.reveal.RevealPackage#getBackground_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Background#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * The literals are from the enumeration {@link com.cohesionforce.reveal.Repeat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see com.cohesionforce.reveal.Repeat
	 * @see #setRepeat(Repeat)
	 * @see com.cohesionforce.reveal.RevealPackage#getBackground_Repeat()
	 * @model
	 * @generated
	 */
	Repeat getRepeat();

	/**
	 * Sets the value of the '{@link com.cohesionforce.reveal.Background#getRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see com.cohesionforce.reveal.Repeat
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(Repeat value);

} // Background
