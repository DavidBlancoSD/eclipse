/**
 */
package cbml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Role Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cbml.CbmlPackage#getRoleType()
 * @model extendedMetaData="pattern=''"
 * @generated
 */
public enum RoleType implements Enumerator {
	/**
	 * The '<em><b>CO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_VALUE
	 * @generated
	 * @ordered
	 */
	CO(0, "CO", "CO"),

	/**
	 * The '<em><b>TAO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAO_VALUE
	 * @generated
	 * @ordered
	 */
	TAO(1, "TAO", "TAO"),

	/**
	 * The '<em><b>CSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSC_VALUE
	 * @generated
	 * @ordered
	 */
	CSC(2, "CSC", "CSC"),

	/**
	 * The '<em><b>TIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIC_VALUE
	 * @generated
	 * @ordered
	 */
	TIC(3, "TIC", "TIC");

	/**
	 * The '<em><b>CO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CO_VALUE = 0;

	/**
	 * The '<em><b>TAO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TAO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TAO_VALUE = 1;

	/**
	 * The '<em><b>CSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CSC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CSC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CSC_VALUE = 2;

	/**
	 * The '<em><b>TIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIC_VALUE = 3;

	/**
	 * An array of all the '<em><b>Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RoleType[] VALUES_ARRAY =
		new RoleType[] {
			CO,
			TAO,
			CSC,
			TIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Role Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RoleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Role Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RoleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Role Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RoleType get(int value) {
		switch (value) {
			case CO_VALUE: return CO;
			case TAO_VALUE: return TAO;
			case CSC_VALUE: return CSC;
			case TIC_VALUE: return TIC;
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
	private RoleType(int value, String name, String literal) {
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
	
} //RoleType
