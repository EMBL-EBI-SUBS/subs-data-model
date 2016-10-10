package uk.ac.ebi.subs.data.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import uk.ac.ebi.subs.data.component.Domain;

@Component
public class DomainValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Domain.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Domain domain = (Domain)target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","field.required");
    }
}
