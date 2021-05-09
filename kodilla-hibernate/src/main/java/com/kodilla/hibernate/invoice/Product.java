package com.kodilla.hibernate.invoice;

import javax.persistence.*;

@Entity
public class Product {

    private int id;
    private String name;

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
