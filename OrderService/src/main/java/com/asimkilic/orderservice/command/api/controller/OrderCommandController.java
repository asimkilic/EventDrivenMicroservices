package com.asimkilic.orderservice.command.api.controller;

import com.asimkilic.orderservice.command.api.command.CreateOrderCommand;
import com.asimkilic.orderservice.command.api.model.OrderRestModel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderCommandController {

    private CommandGateway commandGateway;

    public OrderCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderRestModel orderRestModel) {
        String orderId = UUID.randomUUID().toString();
        CreateOrderCommand createOrderCommand
                = CreateOrderCommand.builder()
                .orderId(orderId)
                .addressId(orderRestModel.getAddressId())
                .userId(orderRestModel.getUserId())
                .productId(orderRestModel.getProductId())
                .quantity(orderRestModel.getQuantity())
                .orderStatus("CREATED")
                .build();
        commandGateway.sendAndWait(createOrderCommand);
        return "Order Created";
    }
}
