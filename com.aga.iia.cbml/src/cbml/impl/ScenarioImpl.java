/**
 */
package cbml.impl;

import cbml.Actor;
import cbml.CbmlPackage;
import cbml.Intent;
import cbml.Scenario;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cbml.impl.ScenarioImpl#getTittle <em>Tittle</em>}</li>
 *   <li>{@link cbml.impl.ScenarioImpl#getCast <em>Cast</em>}</li>
 *   <li>{@link cbml.impl.ScenarioImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link cbml.impl.ScenarioImpl#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The default value of the '{@link #getTittle() <em>Tittle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTittle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITTLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTittle() <em>Tittle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTittle()
	 * @generated
	 * @ordered
	 */
	protected String tittle = TITTLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCast() <em>Cast</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCast()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> cast;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Intent> contains;

	/**
	 * The cached value of the '{@link #getActuators() <em>Actuators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuators()
	 * @generated
	 * @ordered
	 */
	protected EList<cbml.Object> actuators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CbmlPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTittle() {
		return tittle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTittle(String newTittle) {
		String oldTittle = tittle;
		tittle = newTittle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CbmlPackage.SCENARIO__TITTLE, oldTittle, tittle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getCast() {
		if (cast == null) {
			cast = new EObjectContainmentEList<Actor>(Actor.class, this, CbmlPackage.SCENARIO__CAST);
		}
		return cast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intent> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Intent>(Intent.class, this, CbmlPackage.SCENARIO__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<cbml.Object> getActuators() {
		if (actuators == null) {
			actuators = new EObjectContainmentEList<cbml.Object>(cbml.Object.class, this, CbmlPackage.SCENARIO__ACTUATORS);
		}
		return actuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CbmlPackage.SCENARIO__CAST:
				return ((InternalEList<?>)getCast()).basicRemove(otherEnd, msgs);
			case CbmlPackage.SCENARIO__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case CbmlPackage.SCENARIO__ACTUATORS:
				return ((InternalEList<?>)getActuators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CbmlPackage.SCENARIO__TITTLE:
				return getTittle();
			case CbmlPackage.SCENARIO__CAST:
				return getCast();
			case CbmlPackage.SCENARIO__CONTAINS:
				return getContains();
			case CbmlPackage.SCENARIO__ACTUATORS:
				return getActuators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CbmlPackage.SCENARIO__TITTLE:
				setTittle((String)newValue);
				return;
			case CbmlPackage.SCENARIO__CAST:
				getCast().clear();
				getCast().addAll((Collection<? extends Actor>)newValue);
				return;
			case CbmlPackage.SCENARIO__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Intent>)newValue);
				return;
			case CbmlPackage.SCENARIO__ACTUATORS:
				getActuators().clear();
				getActuators().addAll((Collection<? extends cbml.Object>)newValue);
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
			case CbmlPackage.SCENARIO__TITTLE:
				setTittle(TITTLE_EDEFAULT);
				return;
			case CbmlPackage.SCENARIO__CAST:
				getCast().clear();
				return;
			case CbmlPackage.SCENARIO__CONTAINS:
				getContains().clear();
				return;
			case CbmlPackage.SCENARIO__ACTUATORS:
				getActuators().clear();
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
			case CbmlPackage.SCENARIO__TITTLE:
				return TITTLE_EDEFAULT == null ? tittle != null : !TITTLE_EDEFAULT.equals(tittle);
			case CbmlPackage.SCENARIO__CAST:
				return cast != null && !cast.isEmpty();
			case CbmlPackage.SCENARIO__CONTAINS:
				return contains != null && !contains.isEmpty();
			case CbmlPackage.SCENARIO__ACTUATORS:
				return actuators != null && !actuators.isEmpty();
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
		result.append(" (tittle: ");
		result.append(tittle);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
