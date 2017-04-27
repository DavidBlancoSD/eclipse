/**
 */
package cbml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see cbml.CbmlFactory
 * @model kind="package"
 * @generated
 */
public interface CbmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cbml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/cbml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cbml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CbmlPackage eINSTANCE = cbml.impl.CbmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link cbml.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbml.impl.ScenarioImpl
	 * @see cbml.impl.CbmlPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Tittle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TITTLE = 0;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CAST = 1;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONTAINS = 2;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ACTUATORS = 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbml.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbml.impl.ActorImpl
	 * @see cbml.impl.CbmlPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__COMMAND = 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbml.impl.IntentImpl <em>Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbml.impl.IntentImpl
	 * @see cbml.impl.CbmlPackageImpl#getIntent()
	 * @generated
	 */
	int INTENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__DATE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__PERFORMED_BY = 3;

	/**
	 * The number of structural features of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbml.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbml.impl.ObjectImpl
	 * @see cbml.impl.CbmlPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cbml.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbml.impl.OrderImpl
	 * @see cbml.impl.CbmlPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = INTENT__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DATE = INTENT__DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DESCRIPTION = INTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PERFORMED_BY = INTENT__PERFORMED_BY;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER = INTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = INTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = INTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbml.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbml.impl.ReportImpl
	 * @see cbml.impl.CbmlPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__ID = INTENT__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__DATE = INTENT__DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__DESCRIPTION = INTENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__PERFORMED_BY = INTENT__PERFORMED_BY;

	/**
	 * The feature id for the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__INFO = INTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = INTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_OPERATION_COUNT = INTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cbml.RoleType <em>Role Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbml.RoleType
	 * @see cbml.impl.CbmlPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 6;

	/**
	 * The meta object id for the '{@link cbml.InfoType <em>Info Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbml.InfoType
	 * @see cbml.impl.CbmlPackageImpl#getInfoType()
	 * @generated
	 */
	int INFO_TYPE = 7;

	/**
	 * The meta object id for the '{@link cbml.OrderType <em>Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbml.OrderType
	 * @see cbml.impl.CbmlPackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 8;

	/**
	 * The meta object id for the '{@link cbml.ObjectType <em>Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cbml.ObjectType
	 * @see cbml.impl.CbmlPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link cbml.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see cbml.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link cbml.Scenario#getTittle <em>Tittle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tittle</em>'.
	 * @see cbml.Scenario#getTittle()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Tittle();

	/**
	 * Returns the meta object for the containment reference list '{@link cbml.Scenario#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cast</em>'.
	 * @see cbml.Scenario#getCast()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Cast();

	/**
	 * Returns the meta object for the containment reference list '{@link cbml.Scenario#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see cbml.Scenario#getContains()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link cbml.Scenario#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuators</em>'.
	 * @see cbml.Scenario#getActuators()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Actuators();

	/**
	 * Returns the meta object for class '{@link cbml.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see cbml.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link cbml.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cbml.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for the attribute '{@link cbml.Actor#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see cbml.Actor#getRole()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Role();

	/**
	 * Returns the meta object for the reference list '{@link cbml.Actor#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Command</em>'.
	 * @see cbml.Actor#getCommand()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Command();

	/**
	 * Returns the meta object for class '{@link cbml.Intent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent</em>'.
	 * @see cbml.Intent
	 * @generated
	 */
	EClass getIntent();

	/**
	 * Returns the meta object for the attribute '{@link cbml.Intent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cbml.Intent#getId()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Id();

	/**
	 * Returns the meta object for the attribute '{@link cbml.Intent#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see cbml.Intent#getDate()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Date();

	/**
	 * Returns the meta object for the attribute '{@link cbml.Intent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cbml.Intent#getDescription()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Description();

	/**
	 * Returns the meta object for the reference '{@link cbml.Intent#getPerformedBy <em>Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Performed By</em>'.
	 * @see cbml.Intent#getPerformedBy()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_PerformedBy();

	/**
	 * Returns the meta object for class '{@link cbml.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see cbml.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link cbml.Object#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cbml.Object#getId()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link cbml.Object#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see cbml.Object#getObject()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Object();

	/**
	 * Returns the meta object for class '{@link cbml.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see cbml.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link cbml.Order#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see cbml.Order#getOrder()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Order();

	/**
	 * Returns the meta object for class '{@link cbml.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see cbml.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for the attribute '{@link cbml.Report#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info</em>'.
	 * @see cbml.Report#getInfo()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_Info();

	/**
	 * Returns the meta object for enum '{@link cbml.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role Type</em>'.
	 * @see cbml.RoleType
	 * @generated
	 */
	EEnum getRoleType();

	/**
	 * Returns the meta object for enum '{@link cbml.InfoType <em>Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Info Type</em>'.
	 * @see cbml.InfoType
	 * @generated
	 */
	EEnum getInfoType();

	/**
	 * Returns the meta object for enum '{@link cbml.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Type</em>'.
	 * @see cbml.OrderType
	 * @generated
	 */
	EEnum getOrderType();

	/**
	 * Returns the meta object for enum '{@link cbml.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Type</em>'.
	 * @see cbml.ObjectType
	 * @generated
	 */
	EEnum getObjectType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CbmlFactory getCbmlFactory();

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
		 * The meta object literal for the '{@link cbml.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbml.impl.ScenarioImpl
		 * @see cbml.impl.CbmlPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Tittle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__TITTLE = eINSTANCE.getScenario_Tittle();

		/**
		 * The meta object literal for the '<em><b>Cast</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CAST = eINSTANCE.getScenario_Cast();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__CONTAINS = eINSTANCE.getScenario_Contains();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ACTUATORS = eINSTANCE.getScenario_Actuators();

		/**
		 * The meta object literal for the '{@link cbml.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbml.impl.ActorImpl
		 * @see cbml.impl.CbmlPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ROLE = eINSTANCE.getActor_Role();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__COMMAND = eINSTANCE.getActor_Command();

		/**
		 * The meta object literal for the '{@link cbml.impl.IntentImpl <em>Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbml.impl.IntentImpl
		 * @see cbml.impl.CbmlPackageImpl#getIntent()
		 * @generated
		 */
		EClass INTENT = eINSTANCE.getIntent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__ID = eINSTANCE.getIntent_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__DATE = eINSTANCE.getIntent_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__DESCRIPTION = eINSTANCE.getIntent_Description();

		/**
		 * The meta object literal for the '<em><b>Performed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__PERFORMED_BY = eINSTANCE.getIntent_PerformedBy();

		/**
		 * The meta object literal for the '{@link cbml.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbml.impl.ObjectImpl
		 * @see cbml.impl.CbmlPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__ID = eINSTANCE.getObject_Id();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__OBJECT = eINSTANCE.getObject_Object();

		/**
		 * The meta object literal for the '{@link cbml.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbml.impl.OrderImpl
		 * @see cbml.impl.CbmlPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER = eINSTANCE.getOrder_Order();

		/**
		 * The meta object literal for the '{@link cbml.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbml.impl.ReportImpl
		 * @see cbml.impl.CbmlPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__INFO = eINSTANCE.getReport_Info();

		/**
		 * The meta object literal for the '{@link cbml.RoleType <em>Role Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbml.RoleType
		 * @see cbml.impl.CbmlPackageImpl#getRoleType()
		 * @generated
		 */
		EEnum ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '{@link cbml.InfoType <em>Info Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbml.InfoType
		 * @see cbml.impl.CbmlPackageImpl#getInfoType()
		 * @generated
		 */
		EEnum INFO_TYPE = eINSTANCE.getInfoType();

		/**
		 * The meta object literal for the '{@link cbml.OrderType <em>Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbml.OrderType
		 * @see cbml.impl.CbmlPackageImpl#getOrderType()
		 * @generated
		 */
		EEnum ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '{@link cbml.ObjectType <em>Object Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cbml.ObjectType
		 * @see cbml.impl.CbmlPackageImpl#getObjectType()
		 * @generated
		 */
		EEnum OBJECT_TYPE = eINSTANCE.getObjectType();

	}

} //CbmlPackage
