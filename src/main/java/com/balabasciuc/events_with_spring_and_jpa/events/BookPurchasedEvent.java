package com.balabasciuc.events_with_spring_and_jpa.events;

import org.springframework.context.ApplicationEvent;

//not needed to extend anymore
public class BookPurchasedEvent{ // extends ApplicationEvent {

    private String bookMessage;

    public BookPurchasedEvent(String bookMessage) {
        this.bookMessage = bookMessage;
    }

    public String getBookMessage() {
        return bookMessage;
    }
}
