/**
 */
package com.cohesionforce.reveal;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.cohesionforce.reveal.RevealPackage
 * @generated
 */
public interface RevealFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RevealFactory eINSTANCE = com.cohesionforce.reveal.impl.RevealFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presentation</em>'.
	 * @generated
	 */
	Presentation createPresentation();

	/**
	 * Returns a new object of class '<em>Slide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slide</em>'.
	 * @generated
	 */
	Slide createSlide();

	/**
	 * Returns a new object of class '<em>Background</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Background</em>'.
	 * @generated
	 */
	Background createBackground();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RevealPackage getRevealPackage();

} //RevealFactory
