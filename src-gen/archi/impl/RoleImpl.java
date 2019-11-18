/**
 */
package archi.impl;

import archi.ArchiPackage;
import archi.Attachement;
import archi.InRole;
import archi.OutRole;
import archi.Role;

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
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link archi.impl.RoleImpl#getAttachement <em>Attachement</em>}</li>
 *   <li>{@link archi.impl.RoleImpl#getInrole <em>Inrole</em>}</li>
 *   <li>{@link archi.impl.RoleImpl#getOutrole <em>Outrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends MinimalEObjectImpl.Container implements Role {
	/**
	 * The cached value of the '{@link #getAttachement() <em>Attachement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachement()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachement> attachement;

	/**
	 * The cached value of the '{@link #getInrole() <em>Inrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInrole()
	 * @generated
	 * @ordered
	 */
	protected InRole inrole;

	/**
	 * The cached value of the '{@link #getOutrole() <em>Outrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutrole()
	 * @generated
	 * @ordered
	 */
	protected OutRole outrole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchiPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachement> getAttachement() {
		if (attachement == null) {
			attachement = new EObjectContainmentEList<Attachement>(Attachement.class, this,
					ArchiPackage.ROLE__ATTACHEMENT);
		}
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InRole getInrole() {
		if (inrole != null && inrole.eIsProxy()) {
			InternalEObject oldInrole = (InternalEObject) inrole;
			inrole = (InRole) eResolveProxy(oldInrole);
			if (inrole != oldInrole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchiPackage.ROLE__INROLE, oldInrole,
							inrole));
			}
		}
		return inrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InRole basicGetInrole() {
		return inrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInrole(InRole newInrole) {
		InRole oldInrole = inrole;
		inrole = newInrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchiPackage.ROLE__INROLE, oldInrole, inrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutRole getOutrole() {
		if (outrole != null && outrole.eIsProxy()) {
			InternalEObject oldOutrole = (InternalEObject) outrole;
			outrole = (OutRole) eResolveProxy(oldOutrole);
			if (outrole != oldOutrole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchiPackage.ROLE__OUTROLE, oldOutrole,
							outrole));
			}
		}
		return outrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutRole basicGetOutrole() {
		return outrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutrole(OutRole newOutrole) {
		OutRole oldOutrole = outrole;
		outrole = newOutrole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchiPackage.ROLE__OUTROLE, oldOutrole, outrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchiPackage.ROLE__ATTACHEMENT:
			return ((InternalEList<?>) getAttachement()).basicRemove(otherEnd, msgs);
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
		case ArchiPackage.ROLE__ATTACHEMENT:
			return getAttachement();
		case ArchiPackage.ROLE__INROLE:
			if (resolve)
				return getInrole();
			return basicGetInrole();
		case ArchiPackage.ROLE__OUTROLE:
			if (resolve)
				return getOutrole();
			return basicGetOutrole();
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
		case ArchiPackage.ROLE__ATTACHEMENT:
			getAttachement().clear();
			getAttachement().addAll((Collection<? extends Attachement>) newValue);
			return;
		case ArchiPackage.ROLE__INROLE:
			setInrole((InRole) newValue);
			return;
		case ArchiPackage.ROLE__OUTROLE:
			setOutrole((OutRole) newValue);
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
		case ArchiPackage.ROLE__ATTACHEMENT:
			getAttachement().clear();
			return;
		case ArchiPackage.ROLE__INROLE:
			setInrole((InRole) null);
			return;
		case ArchiPackage.ROLE__OUTROLE:
			setOutrole((OutRole) null);
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
		case ArchiPackage.ROLE__ATTACHEMENT:
			return attachement != null && !attachement.isEmpty();
		case ArchiPackage.ROLE__INROLE:
			return inrole != null;
		case ArchiPackage.ROLE__OUTROLE:
			return outrole != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
