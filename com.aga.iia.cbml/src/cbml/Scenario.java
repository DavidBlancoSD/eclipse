/**
 */
package cbml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cbml.Scenario#getTittle <em>Tittle</em>}</li>
 *   <li>{@link cbml.Scenario#getCast <em>Cast</em>}</li>
 *   <li>{@link cbml.Scenario#getContains <em>Contains</em>}</li>
 *   <li>{@link cbml.Scenario#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @see cbml.CbmlPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Tittle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tittle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tittle</em>' attribute.
	 * @see #setTittle(String)
	 * @see cbml.CbmlPackage#getScenario_Tittle()
	 * @model
	 * @generated
	 */
	String getTittle();

	/**
	 * Sets the value of the '{@link cbml.Scenario#getTittle <em>Tittle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tittle</em>' attribute.
	 * @see #getTittle()
	 * @generated
	 */
	void setTittle(String value);

	/**
	 * Returns the value of the '<em><b>Cast</b></em>' containment reference list.
	 * The list contents are of type {@link cbml.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cast</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cast</em>' containment reference list.
	 * @see cbml.CbmlPackage#getScenario_Cast()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getCast();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link cbml.Intent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see cbml.CbmlPackage#getScenario_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Intent> getContains();

	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link cbml.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference list.
	 * @see cbml.CbmlPackage#getScenario_Actuators()
	 * @model containment="true"
	 * @generated
	 */
	EList<cbml.Object> getActuators();

} // Scenario
