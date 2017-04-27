/**
 */
package cbml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cbml.CbmlPackage#getObjectType()
 * @model
 * @generated
 */
public enum ObjectType implements Enumerator {
	/**
	 * The '<em><b>Aircraft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIRCRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	AIRCRAFT(0, "Aircraft", "Aircraft"),

	/**
	 * The '<em><b>Ship</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIP_VALUE
	 * @generated
	 * @ordered
	 */
	SHIP(1, "Ship", "Ship"),

	/**
	 * The '<em><b>Tank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TANK_VALUE
	 * @generated
	 * @ordered
	 */
	TANK(2, "Tank", "Tank");

	/**
	 * The '<em><b>Aircraft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aircraft</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AIRCRAFT
	 * @model name="Aircraft"
	 * @generated
	 * @ordered
	 */
	public static final int AIRCRAFT_VALUE = 0;

	/**
	 * The '<em><b>Ship</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ship</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHIP
	 * @model name="Ship"
	 * @generated
	 * @ordered
	 */
	public static final int SHIP_VALUE = 1;

	/**
	 * The '<em><b>Tank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TANK
	 * @model name="Tank"
	 * @generated
	 * @ordered
	 */
	public static final int TANK_VALUE = 2;

	/**
	 * An array of all the '<em><b>Object Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectType[] VALUES_ARRAY =
		new ObjectType[] {
			AIRCRAFT,
			SHIP,
			TANK,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectType get(int value) {
		switch (value) {
			case AIRCRAFT_VALUE: return AIRCRAFT;
			case SHIP_VALUE: return SHIP;
			case TANK_VALUE: return TANK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ObjectType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ObjectType
