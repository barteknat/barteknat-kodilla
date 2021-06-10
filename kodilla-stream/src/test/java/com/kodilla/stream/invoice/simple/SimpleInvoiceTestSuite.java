package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleInvoiceTestSuite {

    @Test
    public void testGetValueToPay() {
        //Given
        SimpleInvoice simpleInvoice = new SimpleInvoice();

        //When
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product 3", 6.49), 5.0));

        //Then
        Assertions.assertEquals(108.975, simpleInvoice.getValueToPay(), 0.0000000000001);
    }
}
