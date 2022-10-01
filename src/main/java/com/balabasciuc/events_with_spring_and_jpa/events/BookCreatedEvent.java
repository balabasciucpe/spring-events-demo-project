package com.balabasciuc.events_with_spring_and_jpa.events;

public class BookCreatedEvent {

    private String bookCreatedMessage;

    public BookCreatedEvent(String bookCreatedMessage) {
        this.bookCreatedMessage = bookCreatedMessage;
    }

    public String getBookCreatedMessage() {
        return bookCreatedMessage;
    }
}
