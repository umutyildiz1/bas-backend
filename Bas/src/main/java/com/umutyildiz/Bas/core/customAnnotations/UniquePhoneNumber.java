package com.umutyildiz.Bas.core.customAnnotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.*;

@Target({ ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(
        validatedBy = {UniquePhoneNumberValidator.class}
)
public @interface UniquePhoneNumber {
    String message() default "Phone Number exists!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
