/**
 */
package archi.impl;

import archi.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchiFactoryImpl extends EFactoryImpl implements ArchiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArchiFactory init() {
		try {
			ArchiFactory theArchiFactory = (ArchiFactory) EPackage.Registry.INSTANCE.getEFactory(ArchiPackage.eNS_URI);
			if (theArchiFactory != null) {
				return theArchiFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ArchiPackage.CONFIGURATION:
			return createConfiguration();
		case ArchiPackage.CONNECTOR:
			return createConnector();
		case ArchiPackage.INTERFACE:
			return createInterface();
		case ArchiPackage.ROLE:
			return createRole();
		case ArchiPackage.PORT:
			return createPort();
		case ArchiPackage.SERVICE:
			return createService();
		case ArchiPackage.COMPONENT:
			return createComponent();
		case ArchiPackage.GLUE:
			return createGlue();
		case ArchiPackage.BINDING:
			return createBinding();
		case ArchiPackage.ATTACHEMENT:
			return createAttachement();
		case ArchiPackage.IN_PORT:
			return createInPort();
		case ArchiPackage.OUT_PORT:
			return createOutPort();
		case ArchiPackage.INTERFACE_CONNECTOR:
			return createInterfaceConnector();
		case ArchiPackage.INTERFACE_COMPONENT:
			return createInterfaceComponent();
		case ArchiPackage.IN_ROLE:
			return createInRole();
		case ArchiPackage.OUT_ROLE:
			return createOutRole();
		case ArchiPackage.IN_SERVICE:
			return createinService();
		case ArchiPackage.OUT_SERVICE:
			return createoutService();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachement createAttachement() {
		AttachementImpl attachement = new AttachementImpl();
		return attachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort createInPort() {
		InPortImpl inPort = new InPortImpl();
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort createOutPort() {
		OutPortImpl outPort = new OutPortImpl();
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnector createInterfaceConnector() {
		InterfaceConnectorImpl interfaceConnector = new InterfaceConnectorImpl();
		return interfaceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceComponent createInterfaceComponent() {
		InterfaceComponentImpl interfaceComponent = new InterfaceComponentImpl();
		return interfaceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InRole createInRole() {
		InRoleImpl inRole = new InRoleImpl();
		return inRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutRole createOutRole() {
		OutRoleImpl outRole = new OutRoleImpl();
		return outRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public inService createinService() {
		inServiceImpl inService = new inServiceImpl();
		return inService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outService createoutService() {
		outServiceImpl outService = new outServiceImpl();
		return outService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiPackage getArchiPackage() {
		return (ArchiPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArchiPackage getPackage() {
		return ArchiPackage.eINSTANCE;
	}

} //ArchiFactoryImpl
