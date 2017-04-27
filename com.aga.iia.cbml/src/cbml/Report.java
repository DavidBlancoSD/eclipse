/**
 */
package cbml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cbml.Report#getInfo <em>Info</em>}</li>
 * </ul>
 *
 * @see cbml.CbmlPackage#getReport()
 * @model
 * @generated
 */
public interface Report extends Intent {
	/**
	 * Returns the value of the '<em><b>Info</b></em>' attribute.
	 * The literals are from the enumeration {@link cbml.InfoType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' attribute.
	 * @see cbml.InfoType
	 * @see #setInfo(InfoType)
	 * @see cbml.CbmlPackage#getReport_Info()
	 * @model
	 * @generated
	 */
	InfoType getInfo();

	/**
	 * Sets the value of the '{@link cbml.Report#getInfo <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' attribute.
	 * @see cbml.InfoType
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(InfoType value);

} // Report
