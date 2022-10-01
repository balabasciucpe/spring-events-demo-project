package com.balabasciuc.events_with_spring_and_jpa.events;

public class BookOutOfStockEvent {

    private String bookOufOfStockEventMessage;

    public BookOutOfStockEvent(String bookOufOfStockEventMessage) {
        this.bookOufOfStockEventMessage = bookOufOfStockEventMessage;
    }

    public String getBookOufOfStockEventMessage() {
        return bookOufOfStockEventMessage;
    }

    public void setBookOufOfStockEventMessage(String bookOufOfStockEventMessage) {
        this.bookOufOfStockEventMessage = bookOufOfStockEventMessage;
    }
}
