package com.asimkilic.commonservice.events;

import lombok.Data;

@Data
public class OrderCancelledEvent {
    private String orderId;
    private String orderStatus;
}
