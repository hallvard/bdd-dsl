/*
 * generated by Xtext 2.18.0.M3
 */
package no.hal.bdd.serializer;

import com.google.inject.Inject;
import java.util.Set;
import no.hal.bdd.bddDsl.ActionDef;
import no.hal.bdd.bddDsl.ActionRef;
import no.hal.bdd.bddDsl.BddDslPackage;
import no.hal.bdd.bddDsl.EntityDef;
import no.hal.bdd.bddDsl.EntityPropertyStatePhrase;
import no.hal.bdd.bddDsl.EntityRef;
import no.hal.bdd.bddDsl.EntityStatePhrase;
import no.hal.bdd.bddDsl.IntValue;
import no.hal.bdd.bddDsl.Model;
import no.hal.bdd.bddDsl.ModelRef;
import no.hal.bdd.bddDsl.PropertyDef;
import no.hal.bdd.bddDsl.Scenario;
import no.hal.bdd.bddDsl.ScenarioAction;
import no.hal.bdd.bddDsl.ScenarioRef;
import no.hal.bdd.bddDsl.ScenarioState;
import no.hal.bdd.bddDsl.StateDef;
import no.hal.bdd.bddDsl.StateName;
import no.hal.bdd.bddDsl.StringValue;
import no.hal.bdd.bddDsl.VerbAction;
import no.hal.bdd.bddDsl.VerifyAction;
import no.hal.bdd.services.BddDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BddDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BddDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BddDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BddDslPackage.ACTION_DEF:
				sequence_ActionDef(context, (ActionDef) semanticObject); 
				return; 
			case BddDslPackage.ACTION_REF:
				sequence_ActionRef(context, (ActionRef) semanticObject); 
				return; 
			case BddDslPackage.ENTITY_DEF:
				sequence_EntityDef(context, (EntityDef) semanticObject); 
				return; 
			case BddDslPackage.ENTITY_PROPERTY_STATE_PHRASE:
				sequence_EntityPropertyStatePhrase(context, (EntityPropertyStatePhrase) semanticObject); 
				return; 
			case BddDslPackage.ENTITY_REF:
				sequence_EntityRef(context, (EntityRef) semanticObject); 
				return; 
			case BddDslPackage.ENTITY_STATE_PHRASE:
				sequence_EntityStatePhrase(context, (EntityStatePhrase) semanticObject); 
				return; 
			case BddDslPackage.INT_VALUE:
				sequence_IntValue(context, (IntValue) semanticObject); 
				return; 
			case BddDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case BddDslPackage.MODEL_REF:
				sequence_ModelRef(context, (ModelRef) semanticObject); 
				return; 
			case BddDslPackage.PROPERTY_DEF:
				sequence_PropertyDef(context, (PropertyDef) semanticObject); 
				return; 
			case BddDslPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case BddDslPackage.SCENARIO_ACTION:
				sequence_ScenarioAction(context, (ScenarioAction) semanticObject); 
				return; 
			case BddDslPackage.SCENARIO_REF:
				sequence_ScenarioRef(context, (ScenarioRef) semanticObject); 
				return; 
			case BddDslPackage.SCENARIO_STATE:
				sequence_ScenarioState(context, (ScenarioState) semanticObject); 
				return; 
			case BddDslPackage.STATE_DEF:
				sequence_StateDef(context, (StateDef) semanticObject); 
				return; 
			case BddDslPackage.STATE_NAME:
				sequence_StateName(context, (StateName) semanticObject); 
				return; 
			case BddDslPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			case BddDslPackage.VERB_ACTION:
				sequence_VerbAction(context, (VerbAction) semanticObject); 
				return; 
			case BddDslPackage.VERIFY_ACTION:
				sequence_VerifyAction(context, (VerifyAction) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionDef returns ActionDef
	 *
	 * Constraint:
	 *     (name=WORD argument=WORD? (preposition=PREP | (optionalPref?='[' preposition=PREP))?)
	 */
	protected void sequence_ActionDef(ISerializationContext context, ActionDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActionRef returns ActionRef
	 *
	 * Constraint:
	 *     (verb=[ActionDef|WORD] argument=PropertyValue? preposition=PREP?)
	 */
	protected void sequence_ActionRef(ISerializationContext context, ActionRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityDef returns EntityDef
	 *
	 * Constraint:
	 *     (
	 *         (name=ID | name=STRING) 
	 *         (superEntities+=[EntityDef|ID] superEntities+=[EntityDef|ID]*)? 
	 *         (actions+=ActionDef actions+=ActionDef*)? 
	 *         (states+=StateDef states+=StateDef*)? 
	 *         (properties+=PropertyDef properties+=PropertyDef*)?
	 *     )
	 */
	protected void sequence_EntityDef(ISerializationContext context, EntityDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StatePhrase returns EntityPropertyStatePhrase
	 *     EntityPropertyStatePhrase returns EntityPropertyStatePhrase
	 *
	 * Constraint:
	 *     (property=[PropertyDef|WORD] entity=EntityRef (value=PropertyValue | (values+=PropertyValue values+=PropertyValue*)))
	 */
	protected void sequence_EntityPropertyStatePhrase(ISerializationContext context, EntityPropertyStatePhrase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityRef returns EntityRef
	 *
	 * Constraint:
	 *     ((entity=[EntityDef|WORD] name=ENTITY_IDENTITY) | name=ENTITY_IDENTITY)
	 */
	protected void sequence_EntityRef(ISerializationContext context, EntityRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StatePhrase returns EntityStatePhrase
	 *     EntityStatePhrase returns EntityStatePhrase
	 *
	 * Constraint:
	 *     (entity=EntityRef state=[StateName|WORD])
	 */
	protected void sequence_EntityStatePhrase(ISerializationContext context, EntityStatePhrase semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.ENTITY_STATE_PHRASE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.ENTITY_STATE_PHRASE__ENTITY));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.ENTITY_STATE_PHRASE__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.ENTITY_STATE_PHRASE__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityStatePhraseAccess().getEntityEntityRefParserRuleCall_0_0(), semanticObject.getEntity());
		feeder.accept(grammarAccess.getEntityStatePhraseAccess().getStateStateNameWORDParserRuleCall_2_0_1(), semanticObject.eGet(BddDslPackage.Literals.ENTITY_STATE_PHRASE__STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValue returns IntValue
	 *     IntValue returns IntValue
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntValue(ISerializationContext context, IntValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.INT_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ModelRef returns ModelRef
	 *
	 * Constraint:
	 *     modelRef=[Model|ID]
	 */
	protected void sequence_ModelRef(ISerializationContext context, ModelRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.MODEL_REF__MODEL_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.MODEL_REF__MODEL_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelRefAccess().getModelRefModelIDTerminalRuleCall_1_0_1(), semanticObject.eGet(BddDslPackage.Literals.MODEL_REF__MODEL_REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID (modelRefs+=ModelRef | entityDefs+=EntityDef | scenarios+=Scenario)*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PropertyDef returns PropertyDef
	 *
	 * Constraint:
	 *     (name=WORD plural?='*'?)
	 */
	protected void sequence_PropertyDef(ISerializationContext context, PropertyDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ScenarioAction returns ScenarioAction
	 *
	 * Constraint:
	 *     (actions+=ActionPhrase actions+=ActionPhrase*)
	 */
	protected void sequence_ScenarioAction(ISerializationContext context, ScenarioAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StatePhrase returns ScenarioRef
	 *     ScenarioRef returns ScenarioRef
	 *
	 * Constraint:
	 *     scenarioRef=[Scenario|ID_OR_STRING]
	 */
	protected void sequence_ScenarioRef(ISerializationContext context, ScenarioRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.SCENARIO_REF__SCENARIO_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.SCENARIO_REF__SCENARIO_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScenarioRefAccess().getScenarioRefScenarioID_OR_STRINGParserRuleCall_0_1(), semanticObject.eGet(BddDslPackage.Literals.SCENARIO_REF__SCENARIO_REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ScenarioState returns ScenarioState
	 *
	 * Constraint:
	 *     (states+=StatePhrase states+=StatePhrase*)
	 */
	protected void sequence_ScenarioState(ISerializationContext context, ScenarioState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (name=ID_OR_STRING preState=ScenarioState action=ScenarioAction postState=ScenarioState)
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.SCENARIO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.SCENARIO__NAME));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.SCENARIO__PRE_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.SCENARIO__PRE_STATE));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.SCENARIO__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.SCENARIO__ACTION));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.SCENARIO__POST_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.SCENARIO__POST_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScenarioAccess().getNameID_OR_STRINGParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getScenarioAccess().getPreStateScenarioStateParserRuleCall_3_0(), semanticObject.getPreState());
		feeder.accept(grammarAccess.getScenarioAccess().getActionScenarioActionParserRuleCall_6_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getScenarioAccess().getPostStateScenarioStateParserRuleCall_8_0(), semanticObject.getPostState());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StateDef returns StateDef
	 *
	 * Constraint:
	 *     (postive=StateName negative=StateName?)
	 */
	protected void sequence_StateDef(ISerializationContext context, StateDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateName returns StateName
	 *
	 * Constraint:
	 *     name=WORD
	 */
	protected void sequence_StateName(ISerializationContext context, StateName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.STATE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.STATE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateNameAccess().getNameWORDParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertyValue returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.STRING_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ActionPhrase returns VerbAction
	 *     VerbAction returns VerbAction
	 *
	 * Constraint:
	 *     (action=ActionRef entity=EntityRef)
	 */
	protected void sequence_VerbAction(ISerializationContext context, VerbAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.VERB_ACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.VERB_ACTION__ACTION));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.VERB_ACTION__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.VERB_ACTION__ENTITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVerbActionAccess().getActionActionRefParserRuleCall_0_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getVerbActionAccess().getEntityEntityRefParserRuleCall_1_0(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ActionPhrase returns VerifyAction
	 *     VerifyAction returns VerifyAction
	 *
	 * Constraint:
	 *     state=StatePhrase
	 */
	protected void sequence_VerifyAction(ISerializationContext context, VerifyAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.VERIFY_ACTION__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.VERIFY_ACTION__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVerifyActionAccess().getStateStatePhraseParserRuleCall_1_0(), semanticObject.getState());
		feeder.finish();
	}
	
	
}
