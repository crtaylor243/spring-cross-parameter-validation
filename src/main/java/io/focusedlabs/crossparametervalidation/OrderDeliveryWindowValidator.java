package io.focusedlabs.crossparametervalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OrderDeliveryWindowValidator implements ConstraintValidator<ValidDeliveryWindow, FlowerDeliveryOrder> {

    public void initialize(ValidDeliveryWindow constraintAnnotation) {
    }

    public boolean isValid(FlowerDeliveryOrder order, ConstraintValidatorContext constraintContext) {
        return order.getDeliveryStart().isBefore(order.getDeliveryEnd());
    }
}