package com.redhat.fuse.boosters.rest.http.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer price;

    private Integer discounted;

    public Product() {
        // Do nothing.
        this.name="Andrew";
        this.price=100;
        this.discounted=40;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscounted() {
        return discounted;
    }

    public void setDiscounted(Integer discounted) {
        this.discounted = discounted;
    }

    
    
}