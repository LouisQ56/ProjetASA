/**
 */
package archi;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see archi.ArchiFactory
 * @model kind="package"
 * @generated
 */
public interface ArchiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "archi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/archi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "archi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchiPackage eINSTANCE = archi.impl.ArchiPackageImpl.init();

	/**
	 * The meta object id for the '{@link archi.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.ConfigurationImpl
	 * @see archi.impl.ArchiPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTOR = 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.ConnectorImpl
	 * @see archi.impl.ArchiPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__GLUE = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BINDING = 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.InterfaceImpl
	 * @see archi.impl.ArchiPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.RoleImpl
	 * @see archi.impl.ArchiPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Attachement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ATTACHEMENT = 0;

	/**
	 * The feature id for the '<em><b>Inrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INROLE = 1;

	/**
	 * The feature id for the '<em><b>Outrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OUTROLE = 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.PortImpl
	 * @see archi.impl.ArchiPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Outport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OUTPORT = 0;

	/**
	 * The feature id for the '<em><b>Inport</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INPORT = 1;

	/**
	 * The feature id for the '<em><b>Attachement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ATTACHEMENT = 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.ServiceImpl
	 * @see archi.impl.ArchiPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Inservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INSERVICE = 0;

	/**
	 * The feature id for the '<em><b>Outservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OUTSERVICE = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.ComponentImpl
	 * @see archi.impl.ArchiPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 6;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.GlueImpl
	 * @see archi.impl.ArchiPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 7;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.BindingImpl
	 * @see archi.impl.ArchiPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 8;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.AttachementImpl <em>Attachement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.AttachementImpl
	 * @see archi.impl.ArchiPackageImpl#getAttachement()
	 * @generated
	 */
	int ATTACHEMENT = 9;

	/**
	 * The number of structural features of the '<em>Attachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attachement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.InPortImpl <em>In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.InPortImpl
	 * @see archi.impl.ArchiPackageImpl#getInPort()
	 * @generated
	 */
	int IN_PORT = 10;

	/**
	 * The number of structural features of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.OutPortImpl <em>Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.OutPortImpl
	 * @see archi.impl.ArchiPackageImpl#getOutPort()
	 * @generated
	 */
	int OUT_PORT = 11;

	/**
	 * The number of structural features of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.InterfaceConnectorImpl <em>Interface Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.InterfaceConnectorImpl
	 * @see archi.impl.ArchiPackageImpl#getInterfaceConnector()
	 * @generated
	 */
	int INTERFACE_CONNECTOR = 12;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR__INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>Interface Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interface Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.InterfaceComponentImpl <em>Interface Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.InterfaceComponentImpl
	 * @see archi.impl.ArchiPackageImpl#getInterfaceComponent()
	 * @generated
	 */
	int INTERFACE_COMPONENT = 13;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT__PORT = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT__INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>Interface Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Interface Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.InRoleImpl <em>In Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.InRoleImpl
	 * @see archi.impl.ArchiPackageImpl#getInRole()
	 * @generated
	 */
	int IN_ROLE = 14;

	/**
	 * The number of structural features of the '<em>In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>In Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.OutRoleImpl <em>Out Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.OutRoleImpl
	 * @see archi.impl.ArchiPackageImpl#getOutRole()
	 * @generated
	 */
	int OUT_ROLE = 15;

	/**
	 * The number of structural features of the '<em>Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Out Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.inServiceImpl <em>in Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.inServiceImpl
	 * @see archi.impl.ArchiPackageImpl#getinService()
	 * @generated
	 */
	int IN_SERVICE = 16;

	/**
	 * The number of structural features of the '<em>in Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>in Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link archi.impl.outServiceImpl <em>out Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see archi.impl.outServiceImpl
	 * @see archi.impl.ArchiPackageImpl#getoutService()
	 * @generated
	 */
	int OUT_SERVICE = 17;

	/**
	 * The number of structural features of the '<em>out Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_SERVICE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>out Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_SERVICE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link archi.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see archi.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link archi.Configuration#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see archi.Configuration#getInterface()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link archi.Configuration#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see archi.Configuration#getComponent()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link archi.Configuration#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see archi.Configuration#getConnector()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connector();

	/**
	 * Returns the meta object for class '{@link archi.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see archi.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference '{@link archi.Connector#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glue</em>'.
	 * @see archi.Connector#getGlue()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Glue();

	/**
	 * Returns the meta object for the reference '{@link archi.Connector#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see archi.Connector#getBinding()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Binding();

	/**
	 * Returns the meta object for class '{@link archi.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see archi.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link archi.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see archi.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the containment reference list '{@link archi.Role#getAttachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachement</em>'.
	 * @see archi.Role#getAttachement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Attachement();

	/**
	 * Returns the meta object for the reference '{@link archi.Role#getInrole <em>Inrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inrole</em>'.
	 * @see archi.Role#getInrole()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Inrole();

	/**
	 * Returns the meta object for the reference '{@link archi.Role#getOutrole <em>Outrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outrole</em>'.
	 * @see archi.Role#getOutrole()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Outrole();

	/**
	 * Returns the meta object for class '{@link archi.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see archi.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link archi.Port#getOutport <em>Outport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outport</em>'.
	 * @see archi.Port#getOutport()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Outport();

	/**
	 * Returns the meta object for the reference '{@link archi.Port#getInport <em>Inport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inport</em>'.
	 * @see archi.Port#getInport()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Inport();

	/**
	 * Returns the meta object for the containment reference list '{@link archi.Port#getAttachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachement</em>'.
	 * @see archi.Port#getAttachement()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Attachement();

	/**
	 * Returns the meta object for class '{@link archi.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see archi.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link archi.Service#getInservice <em>Inservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inservice</em>'.
	 * @see archi.Service#getInservice()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Inservice();

	/**
	 * Returns the meta object for the reference '{@link archi.Service#getOutservice <em>Outservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outservice</em>'.
	 * @see archi.Service#getOutservice()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Outservice();

	/**
	 * Returns the meta object for class '{@link archi.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see archi.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link archi.Component#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see archi.Component#getInterface()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Interface();

	/**
	 * Returns the meta object for the containment reference list '{@link archi.Component#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see archi.Component#getComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Component();

	/**
	 * Returns the meta object for class '{@link archi.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see archi.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for class '{@link archi.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see archi.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for class '{@link archi.Attachement <em>Attachement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachement</em>'.
	 * @see archi.Attachement
	 * @generated
	 */
	EClass getAttachement();

	/**
	 * Returns the meta object for class '{@link archi.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port</em>'.
	 * @see archi.InPort
	 * @generated
	 */
	EClass getInPort();

	/**
	 * Returns the meta object for class '{@link archi.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port</em>'.
	 * @see archi.OutPort
	 * @generated
	 */
	EClass getOutPort();

	/**
	 * Returns the meta object for class '{@link archi.InterfaceConnector <em>Interface Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Connector</em>'.
	 * @see archi.InterfaceConnector
	 * @generated
	 */
	EClass getInterfaceConnector();

	/**
	 * Returns the meta object for the reference '{@link archi.InterfaceConnector#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see archi.InterfaceConnector#getConnector()
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	EReference getInterfaceConnector_Connector();

	/**
	 * Returns the meta object for the reference list '{@link archi.InterfaceConnector#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see archi.InterfaceConnector#getRole()
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	EReference getInterfaceConnector_Role();

	/**
	 * Returns the meta object for the reference '{@link archi.InterfaceConnector#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see archi.InterfaceConnector#getInterface()
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	EReference getInterfaceConnector_Interface();

	/**
	 * Returns the meta object for class '{@link archi.InterfaceComponent <em>Interface Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Component</em>'.
	 * @see archi.InterfaceComponent
	 * @generated
	 */
	EClass getInterfaceComponent();

	/**
	 * Returns the meta object for the reference list '{@link archi.InterfaceComponent#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service</em>'.
	 * @see archi.InterfaceComponent#getService()
	 * @see #getInterfaceComponent()
	 * @generated
	 */
	EReference getInterfaceComponent_Service();

	/**
	 * Returns the meta object for the reference list '{@link archi.InterfaceComponent#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see archi.InterfaceComponent#getPort()
	 * @see #getInterfaceComponent()
	 * @generated
	 */
	EReference getInterfaceComponent_Port();

	/**
	 * Returns the meta object for the reference '{@link archi.InterfaceComponent#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see archi.InterfaceComponent#getInterface()
	 * @see #getInterfaceComponent()
	 * @generated
	 */
	EReference getInterfaceComponent_Interface();

	/**
	 * Returns the meta object for class '{@link archi.InRole <em>In Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Role</em>'.
	 * @see archi.InRole
	 * @generated
	 */
	EClass getInRole();

	/**
	 * Returns the meta object for class '{@link archi.OutRole <em>Out Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Role</em>'.
	 * @see archi.OutRole
	 * @generated
	 */
	EClass getOutRole();

	/**
	 * Returns the meta object for class '{@link archi.inService <em>in Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>in Service</em>'.
	 * @see archi.inService
	 * @generated
	 */
	EClass getinService();

	/**
	 * Returns the meta object for class '{@link archi.outService <em>out Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>out Service</em>'.
	 * @see archi.outService
	 * @generated
	 */
	EClass getoutService();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchiFactory getArchiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link archi.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.ConfigurationImpl
		 * @see archi.impl.ArchiPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__INTERFACE = eINSTANCE.getConfiguration_Interface();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPONENT = eINSTANCE.getConfiguration_Component();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTOR = eINSTANCE.getConfiguration_Connector();

		/**
		 * The meta object literal for the '{@link archi.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.ConnectorImpl
		 * @see archi.impl.ArchiPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__GLUE = eINSTANCE.getConnector_Glue();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__BINDING = eINSTANCE.getConnector_Binding();

		/**
		 * The meta object literal for the '{@link archi.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.InterfaceImpl
		 * @see archi.impl.ArchiPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link archi.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.RoleImpl
		 * @see archi.impl.ArchiPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Attachement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ATTACHEMENT = eINSTANCE.getRole_Attachement();

		/**
		 * The meta object literal for the '<em><b>Inrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INROLE = eINSTANCE.getRole_Inrole();

		/**
		 * The meta object literal for the '<em><b>Outrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__OUTROLE = eINSTANCE.getRole_Outrole();

		/**
		 * The meta object literal for the '{@link archi.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.PortImpl
		 * @see archi.impl.ArchiPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Outport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__OUTPORT = eINSTANCE.getPort_Outport();

		/**
		 * The meta object literal for the '<em><b>Inport</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__INPORT = eINSTANCE.getPort_Inport();

		/**
		 * The meta object literal for the '<em><b>Attachement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ATTACHEMENT = eINSTANCE.getPort_Attachement();

		/**
		 * The meta object literal for the '{@link archi.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.ServiceImpl
		 * @see archi.impl.ArchiPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Inservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INSERVICE = eINSTANCE.getService_Inservice();

		/**
		 * The meta object literal for the '<em><b>Outservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OUTSERVICE = eINSTANCE.getService_Outservice();

		/**
		 * The meta object literal for the '{@link archi.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.ComponentImpl
		 * @see archi.impl.ArchiPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INTERFACE = eINSTANCE.getComponent_Interface();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENT = eINSTANCE.getComponent_Component();

		/**
		 * The meta object literal for the '{@link archi.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.GlueImpl
		 * @see archi.impl.ArchiPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '{@link archi.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.BindingImpl
		 * @see archi.impl.ArchiPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '{@link archi.impl.AttachementImpl <em>Attachement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.AttachementImpl
		 * @see archi.impl.ArchiPackageImpl#getAttachement()
		 * @generated
		 */
		EClass ATTACHEMENT = eINSTANCE.getAttachement();

		/**
		 * The meta object literal for the '{@link archi.impl.InPortImpl <em>In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.InPortImpl
		 * @see archi.impl.ArchiPackageImpl#getInPort()
		 * @generated
		 */
		EClass IN_PORT = eINSTANCE.getInPort();

		/**
		 * The meta object literal for the '{@link archi.impl.OutPortImpl <em>Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.OutPortImpl
		 * @see archi.impl.ArchiPackageImpl#getOutPort()
		 * @generated
		 */
		EClass OUT_PORT = eINSTANCE.getOutPort();

		/**
		 * The meta object literal for the '{@link archi.impl.InterfaceConnectorImpl <em>Interface Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.InterfaceConnectorImpl
		 * @see archi.impl.ArchiPackageImpl#getInterfaceConnector()
		 * @generated
		 */
		EClass INTERFACE_CONNECTOR = eINSTANCE.getInterfaceConnector();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTOR__CONNECTOR = eINSTANCE.getInterfaceConnector_Connector();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTOR__ROLE = eINSTANCE.getInterfaceConnector_Role();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CONNECTOR__INTERFACE = eINSTANCE.getInterfaceConnector_Interface();

		/**
		 * The meta object literal for the '{@link archi.impl.InterfaceComponentImpl <em>Interface Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.InterfaceComponentImpl
		 * @see archi.impl.ArchiPackageImpl#getInterfaceComponent()
		 * @generated
		 */
		EClass INTERFACE_COMPONENT = eINSTANCE.getInterfaceComponent();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPONENT__SERVICE = eINSTANCE.getInterfaceComponent_Service();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPONENT__PORT = eINSTANCE.getInterfaceComponent_Port();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_COMPONENT__INTERFACE = eINSTANCE.getInterfaceComponent_Interface();

		/**
		 * The meta object literal for the '{@link archi.impl.InRoleImpl <em>In Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.InRoleImpl
		 * @see archi.impl.ArchiPackageImpl#getInRole()
		 * @generated
		 */
		EClass IN_ROLE = eINSTANCE.getInRole();

		/**
		 * The meta object literal for the '{@link archi.impl.OutRoleImpl <em>Out Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.OutRoleImpl
		 * @see archi.impl.ArchiPackageImpl#getOutRole()
		 * @generated
		 */
		EClass OUT_ROLE = eINSTANCE.getOutRole();

		/**
		 * The meta object literal for the '{@link archi.impl.inServiceImpl <em>in Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.inServiceImpl
		 * @see archi.impl.ArchiPackageImpl#getinService()
		 * @generated
		 */
		EClass IN_SERVICE = eINSTANCE.getinService();

		/**
		 * The meta object literal for the '{@link archi.impl.outServiceImpl <em>out Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see archi.impl.outServiceImpl
		 * @see archi.impl.ArchiPackageImpl#getoutService()
		 * @generated
		 */
		EClass OUT_SERVICE = eINSTANCE.getoutService();

	}

} //ArchiPackage
