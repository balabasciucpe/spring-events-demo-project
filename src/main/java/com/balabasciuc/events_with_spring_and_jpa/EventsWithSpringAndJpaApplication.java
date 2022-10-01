package com.balabasciuc.events_with_spring_and_jpa;

import com.balabasciuc.events_with_spring_and_jpa.configuration.AppConfiguration;
import com.balabasciuc.events_with_spring_and_jpa.model.Book;
import com.balabasciuc.events_with_spring_and_jpa.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EventsWithSpringAndJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventsWithSpringAndJpaApplication.class, args);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);


        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        bookService.saveBook(new Book("Lord of the Rings", 30.29, 2));


        bookService.buyBook("Lord of the Rings", 1);
        bookService.buyBook("Lord of the Rings", 1);
        bookService.buyBook("Lord of the Rings", 1);
    }




}
