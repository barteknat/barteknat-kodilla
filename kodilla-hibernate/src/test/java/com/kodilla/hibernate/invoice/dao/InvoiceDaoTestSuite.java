package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(1000), 1);
        Item item2 = new Item(new BigDecimal(2000), 1);
        Product product = new Product("COFFEE MACHINE");
        product.getItems().add(item1);
        product.getItems().add(item2);
        item1.setProduct(product);
        item2.setProduct(product);
        Invoice invoice = new Invoice("IV 2020/10/20");
        invoice.getItemList().add(item1);
        invoice.getItemList().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
    }
}
