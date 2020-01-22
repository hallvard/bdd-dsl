/**
 * generated by Xtext 2.18.0.M3
 */
package no.hal.bdd.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import no.hal.bdd.bddDsl.ActionDef;
import no.hal.bdd.bddDsl.BddDslPackage;
import no.hal.bdd.bddDsl.EntityDef;
import no.hal.bdd.bddDsl.EntityRef;
import no.hal.bdd.bddDsl.Model;
import no.hal.bdd.bddDsl.PropertyDef;
import no.hal.bdd.bddDsl.StateName;
import no.hal.bdd.scoping.AbstractBddDslScopeProvider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class BddDslScopeProvider extends AbstractBddDslScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xifexpression = null;
    EClassifier _eType = reference.getEType();
    EClass _stateName = BddDslPackage.eINSTANCE.getStateName();
    boolean _equals = Objects.equal(_eType, _stateName);
    if (_equals) {
      _xifexpression = this.<StateName>scopeForWidgetModelElements(context, StateName.class);
    } else {
      IScope _xifexpression_1 = null;
      EClassifier _eType_1 = reference.getEType();
      EClass _actionDef = BddDslPackage.eINSTANCE.getActionDef();
      boolean _equals_1 = Objects.equal(_eType_1, _actionDef);
      if (_equals_1) {
        _xifexpression_1 = this.<ActionDef>scopeForWidgetModelElements(context, ActionDef.class);
      } else {
        IScope _xifexpression_2 = null;
        EClassifier _eType_2 = reference.getEType();
        EClass _propertyDef = BddDslPackage.eINSTANCE.getPropertyDef();
        boolean _equals_2 = Objects.equal(_eType_2, _propertyDef);
        if (_equals_2) {
          _xifexpression_2 = this.<PropertyDef>scopeForWidgetModelElements(context, PropertyDef.class);
        } else {
          _xifexpression_2 = super.getScope(context, reference);
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public <T extends EObject> IScope scopeForWidgetModelElements(final EObject context, final Class<T> clazz) {
    IScope _xblockexpression = null;
    {
      final EntityDef widgetDef = this.findWEntityDef(context);
      Iterable<? extends EObject> _xifexpression = null;
      if ((widgetDef != null)) {
        _xifexpression = this.getAllInheritedContentsOfType(widgetDef, clazz);
      } else {
        EObject _elvis = null;
        if (widgetDef != null) {
          _elvis = widgetDef;
        } else {
          Model _findAncestorOfType = this.<Model>findAncestorOfType(context, Model.class);
          _elvis = _findAncestorOfType;
        }
        _xifexpression = EcoreUtil2.<T>getAllContentsOfType(_elvis, clazz);
      }
      Iterable<? extends EObject> all = _xifexpression;
      _xblockexpression = Scopes.scopeFor(all);
    }
    return _xblockexpression;
  }
  
  public Iterable<? extends EObject> getAllInheritedContentsOfType(final EntityDef widgetDef, final Class<? extends EObject> clazz) {
    Iterable<EObject> _xblockexpression = null;
    {
      final Collection<EObject> all = CollectionLiterals.<EObject>newArrayList();
      List<? extends EObject> _allContentsOfType = EcoreUtil2.getAllContentsOfType(widgetDef, clazz);
      Iterables.<EObject>addAll(all, _allContentsOfType);
      final Consumer<EntityDef> _function = (EntityDef it) -> {
        Iterable<? extends EObject> _allInheritedContentsOfType = this.getAllInheritedContentsOfType(it, clazz);
        Iterables.<EObject>addAll(all, _allInheritedContentsOfType);
      };
      widgetDef.getSuperEntities().forEach(_function);
      final Function1<EObject, Boolean> _function_1 = (EObject it) -> {
        return Boolean.valueOf(clazz.isInstance(it));
      };
      _xblockexpression = IterableExtensions.<EObject>filter(all, _function_1);
    }
    return _xblockexpression;
  }
  
  public <T extends Object> T findAncestorOfType(final EObject context, final Class<T> clazz) {
    EObject parent = context;
    while ((parent != null)) {
      {
        boolean _isInstance = clazz.isInstance(parent);
        if (_isInstance) {
          return ((T) parent);
        }
        parent = parent.eContainer();
      }
    }
    return null;
  }
  
  public EntityDef findWEntityDef(final EObject context) {
    EntityDef _xblockexpression = null;
    {
      final Function1<EStructuralFeature, Boolean> _function = (EStructuralFeature it) -> {
        EClassifier _eType = it.getEType();
        EClass _entityRef = BddDslPackage.eINSTANCE.getEntityRef();
        return Boolean.valueOf(Objects.equal(_eType, _entityRef));
      };
      final EStructuralFeature feature = IterableExtensions.<EStructuralFeature>findFirst(context.eClass().getEAllStructuralFeatures(), _function);
      EntityDef _xifexpression = null;
      if ((feature != null)) {
        Object _eGet = context.eGet(feature);
        EntityDef _entity = null;
        if (((EntityRef) _eGet)!=null) {
          _entity=((EntityRef) _eGet).getEntity();
        }
        _xifexpression = _entity;
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
