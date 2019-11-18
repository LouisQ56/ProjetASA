/**
 */
package archi.impl;

import archi.ArchiPackage;
import archi.Service;
import archi.inService;
import archi.outService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link archi.impl.ServiceImpl#getInservice <em>Inservice</em>}</li>
 *   <li>{@link archi.impl.ServiceImpl#getOutservice <em>Outservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The cached value of the '{@link #getInservice() <em>Inservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInservice()
	 * @generated
	 * @ordered
	 */
	protected inService inservice;

	/**
	 * The cached value of the '{@link #getOutservice() <em>Outservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutservice()
	 * @generated
	 * @ordered
	 */
	protected outService outservice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchiPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public inService getInservice() {
		if (inservice != null && inservice.eIsProxy()) {
			InternalEObject oldInservice = (InternalEObject) inservice;
			inservice = (inService) eResolveProxy(oldInservice);
			if (inservice != oldInservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchiPackage.SERVICE__INSERVICE,
							oldInservice, inservice));
			}
		}
		return inservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public inService basicGetInservice() {
		return inservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInservice(inService newInservice) {
		inService oldInservice = inservice;
		inservice = newInservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchiPackage.SERVICE__INSERVICE, oldInservice,
					inservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outService getOutservice() {
		if (outservice != null && outservice.eIsProxy()) {
			InternalEObject oldOutservice = (InternalEObject) outservice;
			outservice = (outService) eResolveProxy(oldOutservice);
			if (outservice != oldOutservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchiPackage.SERVICE__OUTSERVICE,
							oldOutservice, outservice));
			}
		}
		return outservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outService basicGetOutservice() {
		return outservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutservice(outService newOutservice) {
		outService oldOutservice = outservice;
		outservice = newOutservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchiPackage.SERVICE__OUTSERVICE, oldOutservice,
					outservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchiPackage.SERVICE__INSERVICE:
			if (resolve)
				return getInservice();
			return basicGetInservice();
		case ArchiPackage.SERVICE__OUTSERVICE:
			if (resolve)
				return getOutservice();
			return basicGetOutservice();
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
		case ArchiPackage.SERVICE__INSERVICE:
			setInservice((inService) newValue);
			return;
		case ArchiPackage.SERVICE__OUTSERVICE:
			setOutservice((outService) newValue);
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
		case ArchiPackage.SERVICE__INSERVICE:
			setInservice((inService) null);
			return;
		case ArchiPackage.SERVICE__OUTSERVICE:
			setOutservice((outService) null);
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
		case ArchiPackage.SERVICE__INSERVICE:
			return inservice != null;
		case ArchiPackage.SERVICE__OUTSERVICE:
			return outservice != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl
