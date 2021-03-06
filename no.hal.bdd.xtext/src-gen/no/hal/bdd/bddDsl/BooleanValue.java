/**
 * generated by Xtext 2.19.0
 */
package no.hal.bdd.bddDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.bdd.bddDsl.BooleanValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see no.hal.bdd.bddDsl.BddDslPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends SimpleValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see no.hal.bdd.bddDsl.BddDslPackage#getBooleanValue_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link no.hal.bdd.bddDsl.BooleanValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // BooleanValue
