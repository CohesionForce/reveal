/**
 */
package com.cohesionforce.reveal.impl;

import com.cohesionforce.reveal.Background;
import com.cohesionforce.reveal.Repeat;
import com.cohesionforce.reveal.RevealPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Background</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.cohesionforce.reveal.impl.BackgroundImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.BackgroundImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.cohesionforce.reveal.impl.BackgroundImpl#getRepeat <em>Repeat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackgroundImpl extends MinimalEObjectImpl.Container implements Background {
	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected String src = SRC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final Repeat REPEAT_EDEFAULT = Repeat.NO_REPEAT;

	/**
	 * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected Repeat repeat = REPEAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackgroundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RevealPackage.Literals.BACKGROUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		String oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.BACKGROUND__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.BACKGROUND__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat getRepeat() {
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat(Repeat newRepeat) {
		Repeat oldRepeat = repeat;
		repeat = newRepeat == null ? REPEAT_EDEFAULT : newRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevealPackage.BACKGROUND__REPEAT, oldRepeat, repeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RevealPackage.BACKGROUND__SRC:
				return getSrc();
			case RevealPackage.BACKGROUND__SIZE:
				return getSize();
			case RevealPackage.BACKGROUND__REPEAT:
				return getRepeat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RevealPackage.BACKGROUND__SRC:
				setSrc((String)newValue);
				return;
			case RevealPackage.BACKGROUND__SIZE:
				setSize((Integer)newValue);
				return;
			case RevealPackage.BACKGROUND__REPEAT:
				setRepeat((Repeat)newValue);
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
			case RevealPackage.BACKGROUND__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case RevealPackage.BACKGROUND__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case RevealPackage.BACKGROUND__REPEAT:
				setRepeat(REPEAT_EDEFAULT);
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
			case RevealPackage.BACKGROUND__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case RevealPackage.BACKGROUND__SIZE:
				return size != SIZE_EDEFAULT;
			case RevealPackage.BACKGROUND__REPEAT:
				return repeat != REPEAT_EDEFAULT;
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
		result.append(" (src: ");
		result.append(src);
		result.append(", size: ");
		result.append(size);
		result.append(", repeat: ");
		result.append(repeat);
		result.append(')');
		return result.toString();
	}

} //BackgroundImpl
