/**
 */
package archi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link archi.Role#getAttachement <em>Attachement</em>}</li>
 *   <li>{@link archi.Role#getInrole <em>Inrole</em>}</li>
 *   <li>{@link archi.Role#getOutrole <em>Outrole</em>}</li>
 * </ul>
 *
 * @see archi.ArchiPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Attachement</b></em>' containment reference list.
	 * The list contents are of type {@link archi.Attachement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachement</em>' containment reference list.
	 * @see archi.ArchiPackage#getRole_Attachement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachement> getAttachement();

	/**
	 * Returns the value of the '<em><b>Inrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inrole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inrole</em>' reference.
	 * @see #setInrole(InRole)
	 * @see archi.ArchiPackage#getRole_Inrole()
	 * @model required="true"
	 * @generated
	 */
	InRole getInrole();

	/**
	 * Sets the value of the '{@link archi.Role#getInrole <em>Inrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inrole</em>' reference.
	 * @see #getInrole()
	 * @generated
	 */
	void setInrole(InRole value);

	/**
	 * Returns the value of the '<em><b>Outrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outrole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outrole</em>' reference.
	 * @see #setOutrole(OutRole)
	 * @see archi.ArchiPackage#getRole_Outrole()
	 * @model required="true"
	 * @generated
	 */
	OutRole getOutrole();

	/**
	 * Sets the value of the '{@link archi.Role#getOutrole <em>Outrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outrole</em>' reference.
	 * @see #getOutrole()
	 * @generated
	 */
	void setOutrole(OutRole value);

} // Role
