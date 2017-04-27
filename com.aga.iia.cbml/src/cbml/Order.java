/**
 */
package cbml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cbml.Order#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see cbml.CbmlPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends Intent {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link cbml.OrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see cbml.OrderType
	 * @see #setOrder(OrderType)
	 * @see cbml.CbmlPackage#getOrder_Order()
	 * @model
	 * @generated
	 */
	OrderType getOrder();

	/**
	 * Sets the value of the '{@link cbml.Order#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see cbml.OrderType
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderType value);

} // Order
