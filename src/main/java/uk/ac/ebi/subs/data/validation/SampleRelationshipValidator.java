package uk.ac.ebi.subs.data.validation;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import uk.ac.ebi.subs.data.component.SampleRelationship;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class SampleRelationshipValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return SampleRelationship.class.isAssignableFrom(clazz);
    }

    Set<String> validRelationshipNatures = new HashSet<>(Arrays.asList("Derived from","Child of","Same as"));


    @Override
    public void validate(Object target, Errors errors) {
        SampleRelationship sampleRelationship = (SampleRelationship)target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"relationshipNature","field.required");

        if (!errors.hasFieldErrors("relationshipNature") && !validRelationshipNatures.contains(sampleRelationship.getRelationshipNature())){
            errors.rejectValue("relationshipNature","field.invalidValue");
        }
    }
}
