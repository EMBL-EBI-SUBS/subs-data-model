package uk.ac.ebi.subs.data.validation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import uk.ac.ebi.subs.data.submittable.Sample;

@Component
public class SampleValidator implements Validator{

    @Autowired
    SampleRelationshipValidator sampleRelationshipValidator;

    @Override
    public boolean supports(Class<?> clazz) {
        return Sample.class.isAssignableFrom(clazz);

    }

    @Override
    public void validate(Object target, Errors errors) {
        Sample sample = (Sample)target;

        ListValidationUtils.invokeValidatorOnList(
                "sampleRelationships",
                this.sampleRelationshipValidator,
                sample.getSampleRelationships(),
                errors
        );

    }
}
