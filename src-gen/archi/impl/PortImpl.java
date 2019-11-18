/**
 */
package archi.impl;

import archi.ArchiPackage;
import archi.Attachement;
import archi.InPort;
import archi.OutPort;
import archi.Port;

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
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link archi.impl.PortImpl#getOutport <em>Outport</em>}</li>
 *   <li>{@link archi.impl.PortImpl#getInport <em>Inport</em>}</li>
 *   <li>{@link archi.impl.PortImpl#getAttachement <em>Attachement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends MinimalEObjectImpl.Container implements Port {
	/**
	 * The cached value of the '{@link #getOutport() <em>Outport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutport()
	 * @generated
	 * @ordered
	 */
	protected OutPort outport;

	/**
	 * The cached value of the '{@link #getInport() <em>Inport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInport()
	 * @generated
	 * @ordered
	 */
	protected InPort inport;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchiPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort getOutport() {
		if (outport != null && outport.eIsProxy()) {
			InternalEObject oldOutport = (InternalEObject) outport;
			outport = (OutPort) eResolveProxy(oldOutport);
			if (outport != oldOutport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchiPackage.PORT__OUTPORT, oldOutport,
							outport));
			}
		}
		return outport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort basicGetOutport() {
		return outport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutport(OutPort newOutport) {
		OutPort oldOutport = outport;
		outport = newOutport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchiPackage.PORT__OUTPORT, oldOutport, outport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort getInport() {
		if (inport != null && inport.eIsProxy()) {
			InternalEObject oldInport = (InternalEObject) inport;
			inport = (InPort) eResolveProxy(oldInport);
			if (inport != oldInport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchiPackage.PORT__INPORT, oldInport,
							inport));
			}
		}
		return inport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort basicGetInport() {
		return inport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInport(InPort newInport) {
		InPort oldInport = inport;
		inport = newInport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchiPackage.PORT__INPORT, oldInport, inport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachement> getAttachement() {
		if (attachement == null) {
			attachement = new EObjectContainmentEList<Attachement>(Attachement.class, this,
					ArchiPackage.PORT__ATTACHEMENT);
		}
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchiPackage.PORT__ATTACHEMENT:
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
		case ArchiPackage.PORT__OUTPORT:
			if (resolve)
				return getOutport();
			return basicGetOutport();
		case ArchiPackage.PORT__INPORT:
			if (resolve)
				return getInport();
			return basicGetInport();
		case ArchiPackage.PORT__ATTACHEMENT:
			return getAttachement();
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
		case ArchiPackage.PORT__OUTPORT:
			setOutport((OutPort) newValue);
			return;
		case ArchiPackage.PORT__INPORT:
			setInport((InPort) newValue);
			return;
		case ArchiPackage.PORT__ATTACHEMENT:
			getAttachement().clear();
			getAttachement().addAll((Collection<? extends Attachement>) newValue);
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
		case ArchiPackage.PORT__OUTPORT:
			setOutport((OutPort) null);
			return;
		case ArchiPackage.PORT__INPORT:
			setInport((InPort) null);
			return;
		case ArchiPackage.PORT__ATTACHEMENT:
			getAttachement().clear();
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
		case ArchiPackage.PORT__OUTPORT:
			return outport != null;
		case ArchiPackage.PORT__INPORT:
			return inport != null;
		case ArchiPackage.PORT__ATTACHEMENT:
			return attachement != null && !attachement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortImpl
