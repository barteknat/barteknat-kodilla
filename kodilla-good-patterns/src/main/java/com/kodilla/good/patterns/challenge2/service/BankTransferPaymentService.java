package com.kodilla.good.patterns.challenge2.service;

import com.kodilla.good.patterns.challenge2.model.Payment;
import com.kodilla.good.patterns.challenge2.model.Product;
import com.kodilla.good.patterns.challenge2.model.User;

public class BankTransferPaymentService implements PaymentService {

    @Override
    public boolean paid(User user, Product product, Payment payment) {
        return payment.getPaid();
    }
}

