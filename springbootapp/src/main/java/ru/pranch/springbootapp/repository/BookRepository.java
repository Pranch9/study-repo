package ru.pranch.springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pranch.springbootapp.model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
