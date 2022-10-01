package com.balabasciuc.events_with_spring_and_jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long bookId;

    private String bookTitle;
    private double bookPrice;
    private int bookQuantity;

    protected Book() {}

    public Book(String bookTitle, double bookPrice, int bookQuantity) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.bookQuantity = bookQuantity;
    }

    public Long getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }
}
