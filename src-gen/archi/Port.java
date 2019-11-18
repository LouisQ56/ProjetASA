/**
 */
package archi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link archi.Port#getOutport <em>Outport</em>}</li>
 *   <li>{@link archi.Port#getInport <em>Inport</em>}</li>
 *   <li>{@link archi.Port#getAttachement <em>Attachement</em>}</li>
 * </ul>
 *
 * @see archi.ArchiPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Outport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outport</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outport</em>' reference.
	 * @see #setOutport(OutPort)
	 * @see archi.ArchiPackage#getPort_Outport()
	 * @model required="true"
	 * @generated
	 */
	OutPort getOutport();

	/**
	 * Sets the value of the '{@link archi.Port#getOutport <em>Outport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outport</em>' reference.
	 * @see #getOutport()
	 * @generated
	 */
	void setOutport(OutPort value);

	/**
	 * Returns the value of the '<em><b>Inport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inport</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inport</em>' reference.
	 * @see #setInport(InPort)
	 * @see archi.ArchiPackage#getPort_Inport()
	 * @model required="true"
	 * @generated
	 */
	InPort getInport();

	/**
	 * Sets the value of the '{@link archi.Port#getInport <em>Inport</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inport</em>' reference.
	 * @see #getInport()
	 * @generated
	 */
	void setInport(InPort value);

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
	 * @see archi.ArchiPackage#getPort_Attachement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attachement> getAttachement();

} // Port
