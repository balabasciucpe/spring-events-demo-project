package com.balabasciuc.events_with_spring_and_jpa.service;

import com.balabasciuc.events_with_spring_and_jpa.events.BookCreatedEvent;
import com.balabasciuc.events_with_spring_and_jpa.events.BookOutOfStockEvent;
import com.balabasciuc.events_with_spring_and_jpa.events.BookPurchasedEvent;
import com.balabasciuc.events_with_spring_and_jpa.model.Book;
import com.balabasciuc.events_with_spring_and_jpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private ApplicationEventPublisher bookApplicationEventPublisher;
    private BookRepository bookRepository;

    @Autowired
    public BookService(ApplicationEventPublisher bookApplicationEventPublisher, BookRepository bookRepository) {
        this.bookApplicationEventPublisher = bookApplicationEventPublisher;
        this.bookRepository = bookRepository;
    }

    public void saveBook(Book book)
    {
        bookApplicationEventPublisher.publishEvent(new BookCreatedEvent("Book: " + book.getBookTitle() + " was added recently with the price of: " + book.getBookPrice()));
        bookRepository.save(book);
    }

    public void buyBook(String bookTitle, int numOfBooks)
    {
        bookApplicationEventPublisher.publishEvent(new BookPurchasedEvent(bookTitle + " great choose!"));
        Book book = bookRepository.findBookByBookTitle(bookTitle);
        System.out.println(book.getBookTitle());
        if(!checkStock(book.getBookQuantity())) {
            book.setBookQuantity(book.getBookQuantity() - numOfBooks);
        }
        bookRepository.save(book);
    }


    private boolean checkStock(int numOfBooks)
    {
        if(numOfBooks < 1)
        {
            bookApplicationEventPublisher.publishEvent(new BookOutOfStockEvent("we need more of these books ASAP"));
            return true;
        }
        return false;
    }
}
