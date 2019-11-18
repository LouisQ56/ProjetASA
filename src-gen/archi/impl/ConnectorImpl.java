/**
 */
package archi.impl;

import archi.ArchiPackage;
import archi.Binding;
import archi.Connector;
import archi.Glue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link archi.impl.ConnectorImpl#getGlue <em>Glue</em>}</li>
 *   <li>{@link archi.impl.ConnectorImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected Glue glue;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected Binding binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchiPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlue() {
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlue(Glue newGlue, NotificationChain msgs) {
		Glue oldGlue = glue;
		glue = newGlue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchiPackage.CONNECTOR__GLUE,
					oldGlue, newGlue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlue(Glue newGlue) {
		if (newGlue != glue) {
			NotificationChain msgs = null;
			if (glue != null)
				msgs = ((InternalEObject) glue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ArchiPackage.CONNECTOR__GLUE, null, msgs);
			if (newGlue != null)
				msgs = ((InternalEObject) newGlue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ArchiPackage.CONNECTOR__GLUE, null, msgs);
			msgs = basicSetGlue(newGlue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchiPackage.CONNECTOR__GLUE, newGlue, newGlue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject) binding;
			binding = (Binding) eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchiPackage.CONNECTOR__BINDING,
							oldBinding, binding));
			}
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(Binding newBinding) {
		Binding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchiPackage.CONNECTOR__BINDING, oldBinding,
					binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArchiPackage.CONNECTOR__GLUE:
			return basicSetGlue(null, msgs);
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
		case ArchiPackage.CONNECTOR__GLUE:
			return getGlue();
		case ArchiPackage.CONNECTOR__BINDING:
			if (resolve)
				return getBinding();
			return basicGetBinding();
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
		case ArchiPackage.CONNECTOR__GLUE:
			setGlue((Glue) newValue);
			return;
		case ArchiPackage.CONNECTOR__BINDING:
			setBinding((Binding) newValue);
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
		case ArchiPackage.CONNECTOR__GLUE:
			setGlue((Glue) null);
			return;
		case ArchiPackage.CONNECTOR__BINDING:
			setBinding((Binding) null);
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
		case ArchiPackage.CONNECTOR__GLUE:
			return glue != null;
		case ArchiPackage.CONNECTOR__BINDING:
			return binding != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
