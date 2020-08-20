package ru.pranch.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pranch.springbootapp.model.Book;
import ru.pranch.springbootapp.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book findById(Long id) {
        return bookRepository.getOne(id);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
