package com.kodilla.good.patterns.challenge2.service;

import com.kodilla.good.patterns.challenge2.model.OrderNumber;
import com.kodilla.good.patterns.challenge2.model.Product;
import com.kodilla.good.patterns.challenge2.model.User;

public class SmsInformationService implements InformationService {

    @Override
    public void inform(OrderNumber orderNumber, Product product, User user) {
        InformationService.printInformation(orderNumber, product, user);
    }
}

