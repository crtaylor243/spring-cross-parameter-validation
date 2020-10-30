package io.focusedlabs.crossparametervalidation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.ValidationException;
import java.time.ZonedDateTime;

@Controller
@Slf4j
@Validated
public class DeliveryOrderController {

    @PostMapping(value = "/submit")
    public ResponseEntity<FlowerDeliveryOrder> submitOrder(@Valid @RequestBody FlowerDeliveryOrder order) {
        return ResponseEntity.ok(order);
    }

    @GetMapping(value = "/example")
    public ResponseEntity<FlowerDeliveryOrder> getExample() {
        return ResponseEntity.ok(FlowerDeliveryOrder.builder()
                .orderId("1234-EXAMPLE")
                .recipientName("Joe Camel")
                .orderPlaced(ZonedDateTime.now())
                .deliveryStart(ZonedDateTime.now().plusHours(12))
                .deliveryEnd(ZonedDateTime.now().plusHours(36))
                .build());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> exceptionHandler(HttpServletRequest req, Exception ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }


}
