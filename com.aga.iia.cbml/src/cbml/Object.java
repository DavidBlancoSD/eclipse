/**
 */
package cbml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cbml.Object#getId <em>Id</em>}</li>
 *   <li>{@link cbml.Object#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see cbml.CbmlPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see cbml.CbmlPackage#getObject_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link cbml.Object#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * The literals are from the enumeration {@link cbml.ObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see cbml.ObjectType
	 * @see #setObject(ObjectType)
	 * @see cbml.CbmlPackage#getObject_Object()
	 * @model
	 * @generated
	 */
	ObjectType getObject();

	/**
	 * Sets the value of the '{@link cbml.Object#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see cbml.ObjectType
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectType value);

} // Object
