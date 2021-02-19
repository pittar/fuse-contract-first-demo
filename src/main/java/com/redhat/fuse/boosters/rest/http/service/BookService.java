package com.redhat.fuse.boosters.rest.http.service;

import com.redhat.fuse.boosters.rest.http.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookService {
   
    @Autowired
    private BookRepository bookRepository;

    public Book findBookByISBN(String isbn) {
        return bookRepository.findById(isbn).get();
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

}