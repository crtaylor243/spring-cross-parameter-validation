package io.focusedlabs.crossparametervalidation;

import java.time.ZonedDateTime;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@ValidDeliveryWindow
public class FlowerDeliveryOrder
{
    @NotNull
    private String orderId;

    @NotEmpty(message = "Recipient Name must be specified")
    private String recipientName;
    private ZonedDateTime orderPlaced;
    private ZonedDateTime deliveryStart;
    private ZonedDateTime deliveryEnd;
}