/**
 */
package archi.impl;

import archi.ArchiPackage;
import archi.Connector;
import archi.Interface;
import archi.InterfaceConnector;
import archi.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link archi.impl.InterfaceConnectorImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link archi.impl.InterfaceConnectorImpl#getRole <em>Role</em>}</li>
 *   <li>{@link archi.impl.InterfaceConnectorImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceConnectorImpl extends MinimalEObjectImpl.Container implements InterfaceConnector {
	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector connector;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchiPackage.Literals.INTERFACE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject) connector;
			connector = (Connector) eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ArchiPackage.INTERFACE_CONNECTOR__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchiPackage.INTERFACE_CONNECTOR__CONNECTOR,
					oldConnector, connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectResolvingEList<Role>(Role.class, this, ArchiPackage.INTERFACE_CONNECTOR__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (interface_ != null && interface_.eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject) interface_;
			interface_ = (Interface) eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ArchiPackage.INTERFACE_CONNECTOR__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		Interface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchiPackage.INTERFACE_CONNECTOR__INTERFACE,
					oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArchiPackage.INTERFACE_CONNECTOR__CONNECTOR:
			if (resolve)
				return getConnector();
			return basicGetConnector();
		case ArchiPackage.INTERFACE_CONNECTOR__ROLE:
			return getRole();
		case ArchiPackage.INTERFACE_CONNECTOR__INTERFACE:
			if (resolve)
				return getInterface();
			return basicGetInterface();
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
		case ArchiPackage.INTERFACE_CONNECTOR__CONNECTOR:
			setConnector((Connector) newValue);
			return;
		case ArchiPackage.INTERFACE_CONNECTOR__ROLE:
			getRole().clear();
			getRole().addAll((Collection<? extends Role>) newValue);
			return;
		case ArchiPackage.INTERFACE_CONNECTOR__INTERFACE:
			setInterface((Interface) newValue);
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
		case ArchiPackage.INTERFACE_CONNECTOR__CONNECTOR:
			setConnector((Connector) null);
			return;
		case ArchiPackage.INTERFACE_CONNECTOR__ROLE:
			getRole().clear();
			return;
		case ArchiPackage.INTERFACE_CONNECTOR__INTERFACE:
			setInterface((Interface) null);
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
		case ArchiPackage.INTERFACE_CONNECTOR__CONNECTOR:
			return connector != null;
		case ArchiPackage.INTERFACE_CONNECTOR__ROLE:
			return role != null && !role.isEmpty();
		case ArchiPackage.INTERFACE_CONNECTOR__INTERFACE:
			return interface_ != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceConnectorImpl
