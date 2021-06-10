package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class LibraryDbController {

    public void saveData() {
        System.out.println("Saving data to the database");
    }

    public void loadData() {
        System.out.println("Loading data from the database");
    }

}
