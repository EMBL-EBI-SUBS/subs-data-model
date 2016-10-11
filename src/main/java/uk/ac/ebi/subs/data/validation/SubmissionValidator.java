package uk.ac.ebi.subs.data.validation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import uk.ac.ebi.subs.data.Submission;

@Component
public class SubmissionValidator implements Validator {

    @Autowired DomainValidator domainValidator;
    @Autowired SubmitterValidator submitterValidator;
    @Autowired SampleValidator sampleValidator;
    @Autowired ProjectValidator projectValidator;
    @Autowired StudyValidator studyValidator;

    @Override
    public void validate(Object target, Errors errors) {

        Submission submission = (Submission) target;

        try {
            errors.pushNestedPath("domain");
            ValidationUtils.invokeValidator(this.domainValidator, submission.getDomain(), errors);
        } finally {
            errors.popNestedPath();
        }

        try {
            errors.pushNestedPath("submitter");
            ValidationUtils.invokeValidator(this.submitterValidator, submission.getSubmitter(), errors);
        } finally {
            errors.popNestedPath();
        }

        ListValidationUtils.invokeValidatorOnList(
                "projects",
                this.projectValidator,
                submission.getProjects(),
                errors
        );

        ListValidationUtils.invokeValidatorOnList(
                "studies",
                this.studyValidator,
                submission.getStudies(),
                errors
        );

        ListValidationUtils.invokeValidatorOnList(
                "samples",
                this.sampleValidator,
                submission.getSamples(),
                errors
        );



    }


    @Override
    public boolean supports(Class<?> clazz) {
        return Submission.class.isAssignableFrom(clazz);
    }
}
