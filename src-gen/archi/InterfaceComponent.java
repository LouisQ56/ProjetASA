/**
 */
package archi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link archi.InterfaceComponent#getService <em>Service</em>}</li>
 *   <li>{@link archi.InterfaceComponent#getPort <em>Port</em>}</li>
 *   <li>{@link archi.InterfaceComponent#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see archi.ArchiPackage#getInterfaceComponent()
 * @model
 * @generated
 */
public interface InterfaceComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference list.
	 * The list contents are of type {@link archi.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference list.
	 * @see archi.ArchiPackage#getInterfaceComponent_Service()
	 * @model
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link archi.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see archi.ArchiPackage#getInterfaceComponent_Port()
	 * @model
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see archi.ArchiPackage#getInterfaceComponent_Interface()
	 * @model
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link archi.InterfaceComponent#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // InterfaceComponent
