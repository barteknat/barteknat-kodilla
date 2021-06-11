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

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(3000), 5);
        Item item2 = new Item(new BigDecimal(10000), 2);
        Item item3 = new Item(new BigDecimal(5000), 20);

        Product product1 = new Product("COFFEE MACHINE");
        Product product2 = new Product("TV");
        productDao.save(product1);
        productDao.save(product2);
        int product1Id = product1.getId();
        int product2Id = product2.getId();
        product1.getItemList().add(item1);
        product2.getItemList().add(item2);
        product2.getItemList().add(item3);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product2);

        Invoice invoice1 = new Invoice("IV 2020/10/20");
        invoice1.getItemList().add(item1);
        invoice1.getItemList().add(item2);
        invoice1.getItemList().add(item3);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();

        //Then
        assertNotEquals(0, invoice1Id);

        //CleanUp
        invoiceDao.deleteById(invoice1Id);
        productDao.deleteById(product1Id);
        productDao.deleteById(product2Id);
    }
}
