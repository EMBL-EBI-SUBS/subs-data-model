package uk.ac.ebi.subs.data.validation;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import uk.ac.ebi.subs.data.component.Submitter;

@Component
public class SubmitterValidator implements Validator{
    @Override
    public boolean supports(Class<?> clazz) {
        return Submitter.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email","field.required");
    }
}
