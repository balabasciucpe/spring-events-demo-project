package com.balabasciuc.events_with_spring_and_jpa.repository;

import com.balabasciuc.events_with_spring_and_jpa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findBookByBookTitle(String bookTitle);
}
