package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(3000), 5);
        Item item2 = new Item(new BigDecimal(10000), 2);
        Item item3 = new Item(new BigDecimal(5000), 20);
        Product product1 = new Product("COFFEE MACHINE");
        Product product2 = new Product("TV");
        Product product3 = new Product("COMPUTER");
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        Invoice invoice = new Invoice("IV 2020/10/20");
        invoice.getItemList().add(item1);
        invoice.getItemList().add(item2);
        invoice.getItemList().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
        int invoiceID = invoice.getId();
        //Then
        assertNotEquals(0, invoiceID);
        //CleanUp
        invoiceDao.deleteById(invoiceID);
    }
}
