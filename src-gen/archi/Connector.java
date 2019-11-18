/**
 */
package archi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link archi.Connector#getGlue <em>Glue</em>}</li>
 *   <li>{@link archi.Connector#getBinding <em>Binding</em>}</li>
 * </ul>
 *
 * @see archi.ArchiPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference.
	 * @see #setGlue(Glue)
	 * @see archi.ArchiPackage#getConnector_Glue()
	 * @model containment="true"
	 * @generated
	 */
	Glue getGlue();

	/**
	 * Sets the value of the '{@link archi.Connector#getGlue <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' containment reference.
	 * @see #getGlue()
	 * @generated
	 */
	void setGlue(Glue value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(Binding)
	 * @see archi.ArchiPackage#getConnector_Binding()
	 * @model
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link archi.Connector#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

} // Connector
