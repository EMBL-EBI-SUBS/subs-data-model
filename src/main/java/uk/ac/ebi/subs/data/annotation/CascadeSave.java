package uk.ac.ebi.subs.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that indicates the annotated field is to be saved with the parent class.
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface CascadeSave {

    /**
     * The class of the referred entity to save.
     *
     */
    Class<?> classToSave();
}