package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public class Library {

    private LibraryDbController libraryDbController;

    public Library(LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {

    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
