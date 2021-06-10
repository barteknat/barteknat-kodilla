package com.kodilla.spring.reader;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class ReaderTestSuite {

    @Test
    void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);

        //When
        reader.read();

        //Then

    }

    @Test
    void testBeanList() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
    }

    @Test
    void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        //When
        boolean book2Exists = context.containsBean("book2");
        //Then
        System.out.println("Bean of book2 was found in the container: " + book2Exists);
    }


}
