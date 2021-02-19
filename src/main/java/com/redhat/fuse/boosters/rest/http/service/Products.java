package com.redhat.fuse.boosters.rest.http.service;

import com.redhat.fuse.boosters.rest.http.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Products {
   
    @Autowired
    private ProductService productService;

    public Product newProduct() {
        Product aProduct = new Product();
        aProduct.setName("Andrew");
        aProduct.setDiscounted(10);
        aProduct.setPrice(90);
        productService.save(aProduct);
        return aProduct;
    }

}