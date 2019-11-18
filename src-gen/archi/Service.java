/**
 */
package archi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link archi.Service#getInservice <em>Inservice</em>}</li>
 *   <li>{@link archi.Service#getOutservice <em>Outservice</em>}</li>
 * </ul>
 *
 * @see archi.ArchiPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Inservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inservice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inservice</em>' reference.
	 * @see #setInservice(inService)
	 * @see archi.ArchiPackage#getService_Inservice()
	 * @model required="true"
	 * @generated
	 */
	inService getInservice();

	/**
	 * Sets the value of the '{@link archi.Service#getInservice <em>Inservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inservice</em>' reference.
	 * @see #getInservice()
	 * @generated
	 */
	void setInservice(inService value);

	/**
	 * Returns the value of the '<em><b>Outservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outservice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outservice</em>' reference.
	 * @see #setOutservice(outService)
	 * @see archi.ArchiPackage#getService_Outservice()
	 * @model required="true"
	 * @generated
	 */
	outService getOutservice();

	/**
	 * Sets the value of the '{@link archi.Service#getOutservice <em>Outservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outservice</em>' reference.
	 * @see #getOutservice()
	 * @generated
	 */
	void setOutservice(outService value);

} // Service
