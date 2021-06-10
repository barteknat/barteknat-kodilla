package com.kodilla.stream.book;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTestSuite {

    @Test
    void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        int result = 0;
        for (Book book : bookDirectory.getList()) {
            if (book.getYearOfPublication() > 2006) {
                result++;
            }
        }

        //Then
        assertEquals(5, result);
    }

    @Test
    void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        Long result = IntStream.range(0, bookDirectory.getList().size())
                .filter(n -> bookDirectory.getList().get(n).getYearOfPublication() > 2007)
                .count();

        //Then
        assertEquals(3, result);
    }
}
