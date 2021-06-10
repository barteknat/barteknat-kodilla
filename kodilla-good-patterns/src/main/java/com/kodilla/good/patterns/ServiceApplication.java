package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenge2.engine.OrderProcessor;
import com.kodilla.good.patterns.challenge2.model.Order;
import com.kodilla.good.patterns.challenge2.model.OrderRetriever;
import com.kodilla.good.patterns.challenge2.repository.ProductOrderRepository;
import com.kodilla.good.patterns.challenge2.service.BankTransferPaymentService;
import com.kodilla.good.patterns.challenge2.service.ProductOrderService;
import com.kodilla.good.patterns.challenge2.service.SmsInformationService;

public class ServiceApplication {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(
                new ProductOrderService(),
                new BankTransferPaymentService(),
                new ProductOrderRepository(),
                new SmsInformationService());
        orderProcessor.process(order);
    }
}

