/**
 * generated by Xtext 2.18.0.M3
 */
package no.hal.bdd.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class BddDslLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public BddDslLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
