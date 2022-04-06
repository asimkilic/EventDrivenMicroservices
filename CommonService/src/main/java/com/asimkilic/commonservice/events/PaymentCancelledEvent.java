package com.asimkilic.commonservice.events;

import lombok.Data;

@Data
public class PaymentCalcelledEvent {
    private String paymentId;
    private String orderId;
    private String paymentStatus ;
}
