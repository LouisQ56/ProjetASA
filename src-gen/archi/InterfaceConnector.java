/**
 */
package archi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link archi.InterfaceConnector#getConnector <em>Connector</em>}</li>
 *   <li>{@link archi.InterfaceConnector#getRole <em>Role</em>}</li>
 *   <li>{@link archi.InterfaceConnector#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see archi.ArchiPackage#getInterfaceConnector()
 * @model
 * @generated
 */
public interface InterfaceConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see archi.ArchiPackage#getInterfaceConnector_Connector()
	 * @model
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link archi.InterfaceConnector#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link archi.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see archi.ArchiPackage#getInterfaceConnector_Role()
	 * @model
	 * @generated
	 */
	EList<Role> getRole();

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
	 * @see archi.ArchiPackage#getInterfaceConnector_Interface()
	 * @model
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link archi.InterfaceConnector#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // InterfaceConnector
