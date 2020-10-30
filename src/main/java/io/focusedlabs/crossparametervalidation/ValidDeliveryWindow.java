package io.focusedlabs.crossparametervalidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = OrderDeliveryWindowValidator.class)
public @interface ValidDeliveryWindow {
    String message() default "Delivery Window Start Time must precede End Time";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
