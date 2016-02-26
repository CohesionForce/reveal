/**
 */
package com.cohesionforce.reveal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Repeat</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.cohesionforce.reveal.RevealPackage#getRepeat()
 * @model
 * @generated
 */
public enum Repeat implements Enumerator {
	/**
	 * The '<em><b>NO REPEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_REPEAT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_REPEAT(0, "NO_REPEAT", "no-repeat"),

	/**
	 * The '<em><b>REPEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEAT_VALUE
	 * @generated
	 * @ordered
	 */
	REPEAT(1, "REPEAT", "repeat"),

	/**
	 * The '<em><b>REPEAT X</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEAT_X_VALUE
	 * @generated
	 * @ordered
	 */
	REPEAT_X(2, "REPEAT_X", "repeat-x"),

	/**
	 * The '<em><b>REPEAT Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPEAT_Y_VALUE
	 * @generated
	 * @ordered
	 */
	REPEAT_Y(3, "REPEAT_Y", "repeat-y"),

	/**
	 * The '<em><b>INITIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIAL_VALUE
	 * @generated
	 * @ordered
	 */
	INITIAL(4, "INITIAL", "initial"),

	/**
	 * The '<em><b>INHERIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERIT_VALUE
	 * @generated
	 * @ordered
	 */
	INHERIT(5, "INHERIT", "inherit");

	/**
	 * The '<em><b>NO REPEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO REPEAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_REPEAT
	 * @model literal="no-repeat"
	 * @generated
	 * @ordered
	 */
	public static final int NO_REPEAT_VALUE = 0;

	/**
	 * The '<em><b>REPEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPEAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEAT
	 * @model literal="repeat"
	 * @generated
	 * @ordered
	 */
	public static final int REPEAT_VALUE = 1;

	/**
	 * The '<em><b>REPEAT X</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPEAT X</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEAT_X
	 * @model literal="repeat-x"
	 * @generated
	 * @ordered
	 */
	public static final int REPEAT_X_VALUE = 2;

	/**
	 * The '<em><b>REPEAT Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REPEAT Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REPEAT_Y
	 * @model literal="repeat-y"
	 * @generated
	 * @ordered
	 */
	public static final int REPEAT_Y_VALUE = 3;

	/**
	 * The '<em><b>INITIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INITIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIAL
	 * @model literal="initial"
	 * @generated
	 * @ordered
	 */
	public static final int INITIAL_VALUE = 4;

	/**
	 * The '<em><b>INHERIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INHERIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERIT
	 * @model literal="inherit"
	 * @generated
	 * @ordered
	 */
	public static final int INHERIT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Repeat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Repeat[] VALUES_ARRAY =
		new Repeat[] {
			NO_REPEAT,
			REPEAT,
			REPEAT_X,
			REPEAT_Y,
			INITIAL,
			INHERIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Repeat</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Repeat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Repeat</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Repeat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Repeat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repeat</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Repeat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Repeat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repeat</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Repeat get(int value) {
		switch (value) {
			case NO_REPEAT_VALUE: return NO_REPEAT;
			case REPEAT_VALUE: return REPEAT;
			case REPEAT_X_VALUE: return REPEAT_X;
			case REPEAT_Y_VALUE: return REPEAT_Y;
			case INITIAL_VALUE: return INITIAL;
			case INHERIT_VALUE: return INHERIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Repeat(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Repeat