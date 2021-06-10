package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabase;

    private List<Book> generateListOfBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int i = 1; i <= booksQuantity; i++) {
            resultList.add(new Book("title" + i, "author" + i, 2000 + i));
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultListOfBooks = generateListOfBooks(4);
        when(libraryDatabase.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWitCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> listOf0Books = generateListOfBooks(0);
        List<Book> listOf15Books = generateListOfBooks(15);
        List<Book> listOf40Books = generateListOfBooks(40);
        when(libraryDatabase.listBooksWithCondition(anyString())).thenReturn(listOf15Books);
        when(libraryDatabase.listBooksWithCondition("ZeroBooks")).thenReturn(listOf0Books);
        when(libraryDatabase.listBooksWithCondition("FortyBooks")).thenReturn(listOf40Books);

        //When
        List<Book> listOfBooks0 = bookLibrary.listBooksWitCondition("ZeroBooks");
        List<Book> listOfBooks15 = bookLibrary.listBooksWitCondition("anything");
        List<Book> listOfBooks40 = bookLibrary.listBooksWitCondition("FortyBooks");

        //Then
        assertEquals(0, listOfBooks0.size());
        assertEquals(15, listOfBooks15.size());
        assertEquals(0, listOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);

        //When
        List<Book> listOfBooks10 = bookLibrary.listBooksWitCondition("An");

        //Then
        assertEquals(0, listOfBooks10.size());
        verify(libraryDatabase, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void testListBooksInHandsOfNoBooksRented() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("John", "Doe", "85020132918");
        when(libraryDatabase.listBooksInHandsOf(libraryUser)).thenReturn(new ArrayList<>());

        //When

        //Then
        assertEquals(0, bookLibrary.listBooksInHandsOf(libraryUser).size());
    }

    @Test
    void testListBooksInHandsOf1BookRented() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("John", "Doe", "85020132918");
        when(libraryDatabase.listBooksInHandsOf(libraryUser)).thenReturn(generateListOfBooks(1));

        //When

        //Then
        assertEquals(1, bookLibrary.listBooksInHandsOf(libraryUser).size());
    }

    @Test
    void testListBooksInHandsOf5BooksRented() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser libraryUser = new LibraryUser("John", "Doe", "85020132918");
        when(libraryDatabase.listBooksInHandsOf(libraryUser)).thenReturn(generateListOfBooks(5));

        //When

        //Then
        assertEquals(5, bookLibrary.listBooksInHandsOf(libraryUser).size());
    }
}
