package uk.ac.ebi.subs.data.validation;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.List;

public class ListValidationUtils {

    /**
     * Use a validator on a list of objects, correctly handling changes to the nestedPath
     *
     * @param path
     * @param validator
     * @param list
     * @param errors
     */
    public static void invokeValidatorOnList(String path, Validator validator, List<?> list, Errors errors){

        int i = 0;

        for (Object target : list){
            try {
                errors.pushNestedPath(path+"["+i+"]");
                ValidationUtils.invokeValidator(validator, target, errors);
            } finally {
                errors.popNestedPath();
                i++;
            }
        }
    }




}
