package com.balabasciuc.events_with_spring_and_jpa.listeners;

import com.balabasciuc.events_with_spring_and_jpa.events.BookCreatedEvent;
import com.balabasciuc.events_with_spring_and_jpa.events.BookOutOfStockEvent;
import com.balabasciuc.events_with_spring_and_jpa.events.BookPurchasedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BookListeners {

    @EventListener(BookPurchasedEvent.class)
    public void goes(BookPurchasedEvent bookPurchasedEvent)
    {
        System.out.println("Book was purchased!");
    }


    @EventListener
    public void bookCreatedEvent(BookCreatedEvent bookCreatedEvent)
    {
        System.out.println("A book was created just now!");
    }

    @EventListener
    public void bookOutOfStock(BookOutOfStockEvent evt)
    {
        System.out.println(evt.getBookOufOfStockEventMessage());
        System.out.println("Book is out of stock, please come another time!");
    }
}
