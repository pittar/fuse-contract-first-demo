package com.redhat.fuse.boosters.rest.http.service;

import com.redhat.fuse.boosters.rest.http.model.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String> {
    
}