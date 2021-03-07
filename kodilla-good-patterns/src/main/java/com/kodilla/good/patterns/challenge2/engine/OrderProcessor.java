package com.kodilla.good.patterns.challenge2.engine;

import com.kodilla.good.patterns.challenge2.model.OrderDto;
import com.kodilla.good.patterns.challenge2.model.Order;
import com.kodilla.good.patterns.challenge2.repository.OrderRepository;
import com.kodilla.good.patterns.challenge2.service.InformationService;
import com.kodilla.good.patterns.challenge2.service.OrderService;
import com.kodilla.good.patterns.challenge2.service.PaymentService;

public class OrderProcessor {

    private final OrderService orderService;
    private final PaymentService paymentService;
    private final OrderRepository orderRepository;
    private final InformationService informationService;

    public OrderProcessor(OrderService orderService,
                          PaymentService paymentService,
                          OrderRepository orderRepository,
                          InformationService informationService) {
        this.orderService = orderService;
        this.paymentService = paymentService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }

    public OrderDto process(final Order order) {
        if (order.getUser() != null) {
            boolean ordered = orderService.orderProduct(order.getUser(), order.getProduct(), order.getAddToCart());
            boolean paid = paymentService.paid(order.getUser(), order.getProduct(), order.getPayment());
            if (ordered) {
                orderService.printOrderProduct(order.getUser(), order.getProduct(), order.getOrderDate(), order.getOrderNumber());
                if (paid) {
                    paymentService.printPaymentConfirmed(order.getOrderNumber());
                    orderRepository.createOrder(order.getOrderNumber().getNumber(), order);
                    informationService.inform(order.getOrderNumber(), order.getProduct(), order.getUser());
                    return new OrderDto(order.getUser(), true);
                }
                paymentService.printNoPayment(order.getOrderNumber());
                orderService.printOrderDisabled(order.getOrderNumber());
            }
            return new OrderDto(order.getUser(), false);
        }
        return new OrderDto(order.getUser(), false);
    }
}

