/**
 */
package cbml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cbml.Actor#getName <em>Name</em>}</li>
 *   <li>{@link cbml.Actor#getRole <em>Role</em>}</li>
 *   <li>{@link cbml.Actor#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see cbml.CbmlPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cbml.CbmlPackage#getActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cbml.Actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link cbml.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see cbml.RoleType
	 * @see #setRole(RoleType)
	 * @see cbml.CbmlPackage#getActor_Role()
	 * @model
	 * @generated
	 */
	RoleType getRole();

	/**
	 * Sets the value of the '{@link cbml.Actor#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see cbml.RoleType
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleType value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference list.
	 * The list contents are of type {@link cbml.Intent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference list.
	 * @see cbml.CbmlPackage#getActor_Command()
	 * @model extendedMetaData="wildcards='' name=''"
	 * @generated
	 */
	EList<Intent> getCommand();

} // Actor
