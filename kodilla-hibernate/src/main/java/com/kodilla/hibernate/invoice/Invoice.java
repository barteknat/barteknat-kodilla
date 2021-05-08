package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Invoice {

    private int id;
    private String number;
    private List<Item> itemList = new ArrayList<>();

    public Invoice() {

    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @SequenceGenerator(name = "hibernate_sequence2", sequenceName = "hibernate_sequence2", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence2")
    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }
}
