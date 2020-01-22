/**
 * generated by Xtext 2.18.0.M3
 */
package no.hal.bdd.bddDsl.util;

import no.hal.bdd.bddDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.bdd.bddDsl.BddDslPackage
 * @generated
 */
public class BddDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BddDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BddDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BddDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BddDslSwitch<Adapter> modelSwitch =
    new BddDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseModelRef(ModelRef object)
      {
        return createModelRefAdapter();
      }
      @Override
      public Adapter caseEntityDef(EntityDef object)
      {
        return createEntityDefAdapter();
      }
      @Override
      public Adapter caseActionDef(ActionDef object)
      {
        return createActionDefAdapter();
      }
      @Override
      public Adapter caseStateDef(StateDef object)
      {
        return createStateDefAdapter();
      }
      @Override
      public Adapter caseStateName(StateName object)
      {
        return createStateNameAdapter();
      }
      @Override
      public Adapter casePropertyDef(PropertyDef object)
      {
        return createPropertyDefAdapter();
      }
      @Override
      public Adapter caseScenario(Scenario object)
      {
        return createScenarioAdapter();
      }
      @Override
      public Adapter caseScenarioState(ScenarioState object)
      {
        return createScenarioStateAdapter();
      }
      @Override
      public Adapter caseScenarioAction(ScenarioAction object)
      {
        return createScenarioActionAdapter();
      }
      @Override
      public Adapter caseStatePhrase(StatePhrase object)
      {
        return createStatePhraseAdapter();
      }
      @Override
      public Adapter caseScenarioRef(ScenarioRef object)
      {
        return createScenarioRefAdapter();
      }
      @Override
      public Adapter caseEntityRef(EntityRef object)
      {
        return createEntityRefAdapter();
      }
      @Override
      public Adapter caseEntityStatePhrase(EntityStatePhrase object)
      {
        return createEntityStatePhraseAdapter();
      }
      @Override
      public Adapter caseEntityPropertyStatePhrase(EntityPropertyStatePhrase object)
      {
        return createEntityPropertyStatePhraseAdapter();
      }
      @Override
      public Adapter casePropertyValue(PropertyValue object)
      {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseIntValue(IntValue object)
      {
        return createIntValueAdapter();
      }
      @Override
      public Adapter caseActionPhrase(ActionPhrase object)
      {
        return createActionPhraseAdapter();
      }
      @Override
      public Adapter caseVerbAction(VerbAction object)
      {
        return createVerbActionAdapter();
      }
      @Override
      public Adapter caseActionRef(ActionRef object)
      {
        return createActionRefAdapter();
      }
      @Override
      public Adapter caseVerifyAction(VerifyAction object)
      {
        return createVerifyActionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.ModelRef <em>Model Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.ModelRef
   * @generated
   */
  public Adapter createModelRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.EntityDef <em>Entity Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.EntityDef
   * @generated
   */
  public Adapter createEntityDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.ActionDef <em>Action Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.ActionDef
   * @generated
   */
  public Adapter createActionDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.StateDef <em>State Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.StateDef
   * @generated
   */
  public Adapter createStateDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.StateName <em>State Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.StateName
   * @generated
   */
  public Adapter createStateNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.PropertyDef <em>Property Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.PropertyDef
   * @generated
   */
  public Adapter createPropertyDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.Scenario <em>Scenario</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.Scenario
   * @generated
   */
  public Adapter createScenarioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.ScenarioState <em>Scenario State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.ScenarioState
   * @generated
   */
  public Adapter createScenarioStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.ScenarioAction <em>Scenario Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.ScenarioAction
   * @generated
   */
  public Adapter createScenarioActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.StatePhrase <em>State Phrase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.StatePhrase
   * @generated
   */
  public Adapter createStatePhraseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.ScenarioRef <em>Scenario Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.ScenarioRef
   * @generated
   */
  public Adapter createScenarioRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.EntityRef <em>Entity Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.EntityRef
   * @generated
   */
  public Adapter createEntityRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.EntityStatePhrase <em>Entity State Phrase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.EntityStatePhrase
   * @generated
   */
  public Adapter createEntityStatePhraseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.EntityPropertyStatePhrase <em>Entity Property State Phrase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.EntityPropertyStatePhrase
   * @generated
   */
  public Adapter createEntityPropertyStatePhraseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.IntValue
   * @generated
   */
  public Adapter createIntValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.ActionPhrase <em>Action Phrase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.ActionPhrase
   * @generated
   */
  public Adapter createActionPhraseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.VerbAction <em>Verb Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.VerbAction
   * @generated
   */
  public Adapter createVerbActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.ActionRef <em>Action Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.ActionRef
   * @generated
   */
  public Adapter createActionRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link no.hal.bdd.bddDsl.VerifyAction <em>Verify Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see no.hal.bdd.bddDsl.VerifyAction
   * @generated
   */
  public Adapter createVerifyActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BddDslAdapterFactory
