/**
 */
package cbml.impl;

import cbml.CbmlPackage;
import cbml.Intent;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cbml.impl.IntentImpl#getId <em>Id</em>}</li>
 *   <li>{@link cbml.impl.IntentImpl#getDate <em>Date</em>}</li>
 *   <li>{@link cbml.impl.IntentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link cbml.impl.IntentImpl#getPerformedBy <em>Performed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IntentImpl extends MinimalEObjectImpl.Container implements Intent {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerformedBy() <em>Performed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedBy()
	 * @generated
	 * @ordered
	 */
	protected cbml.Object performedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbmlPackage.Literals.INTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmlPackage.INTENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmlPackage.INTENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmlPackage.INTENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cbml.Object getPerformedBy() {
		if (performedBy != null && performedBy.eIsProxy()) {
			InternalEObject oldPerformedBy = (InternalEObject)performedBy;
			performedBy = (cbml.Object)eResolveProxy(oldPerformedBy);
			if (performedBy != oldPerformedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CbmlPackage.INTENT__PERFORMED_BY, oldPerformedBy, performedBy));
			}
		}
		return performedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cbml.Object basicGetPerformedBy() {
		return performedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformedBy(cbml.Object newPerformedBy) {
		cbml.Object oldPerformedBy = performedBy;
		performedBy = newPerformedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmlPackage.INTENT__PERFORMED_BY, oldPerformedBy, performedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbmlPackage.INTENT__ID:
				return getId();
			case CbmlPackage.INTENT__DATE:
				return getDate();
			case CbmlPackage.INTENT__DESCRIPTION:
				return getDescription();
			case CbmlPackage.INTENT__PERFORMED_BY:
				if (resolve) return getPerformedBy();
				return basicGetPerformedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CbmlPackage.INTENT__ID:
				setId((String)newValue);
				return;
			case CbmlPackage.INTENT__DATE:
				setDate((Date)newValue);
				return;
			case CbmlPackage.INTENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CbmlPackage.INTENT__PERFORMED_BY:
				setPerformedBy((cbml.Object)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CbmlPackage.INTENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CbmlPackage.INTENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case CbmlPackage.INTENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CbmlPackage.INTENT__PERFORMED_BY:
				setPerformedBy((cbml.Object)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CbmlPackage.INTENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CbmlPackage.INTENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case CbmlPackage.INTENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CbmlPackage.INTENT__PERFORMED_BY:
				return performedBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", date: ");
		result.append(date);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //IntentImpl
