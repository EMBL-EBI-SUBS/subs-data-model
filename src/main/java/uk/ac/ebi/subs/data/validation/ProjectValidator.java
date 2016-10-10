package uk.ac.ebi.subs.data.validation;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import uk.ac.ebi.subs.data.submittable.Project;

@Component
public class ProjectValidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return Project.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Project project = (Project) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"releaseDate","field.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"archive","field.required");
    }
}
