package com.redhat.fuse.boosters.rest.http.service;

import com.redhat.fuse.boosters.rest.http.model.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductService extends CrudRepository<Product, Integer> {
    
}