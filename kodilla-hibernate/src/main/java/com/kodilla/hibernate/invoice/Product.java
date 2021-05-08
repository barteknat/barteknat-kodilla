package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @SequenceGenerator(name = "hibernate_sequence", sequenceName="hibernate_sequence", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "hibernate_sequence")
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
