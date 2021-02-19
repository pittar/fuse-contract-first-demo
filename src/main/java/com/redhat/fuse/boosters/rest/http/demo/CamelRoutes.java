package com.redhat.fuse.boosters.rest.http.demo;

import javax.annotation.Generated;

import com.redhat.fuse.boosters.rest.http.model.Book;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

/**
 * Generated from OpenApi specification by Camel REST DSL generator.
 */
@Generated("org.apache.camel.generator.openapi.PathGenerator")
@Component
public final class CamelRoutes extends RouteBuilder {
    /**
     * Defines Apache Camel routes using REST DSL fluent API.
     */
    public void configure() {

        //restConfiguration().component("servlet").contextPath("/");

        rest()
            .get("/books")
                .id("get_books")
                .description("Get all books.")
                .outType(Iterable.class)
                .to("direct:get_books")
            .get("/books/{isbn}")
                .id("get_book_by_isbn")
                .description("Get book info based on ISBN.")
                .outType(Book.class)
                .param()
                    .name("isbn")
                    .type(RestParamType.path)
                    .dataType("string")
                    .required(true)
                    .description("ISBN number.")
                .endParam()
                .to("direct:get_book_by_isbn")
            .get("/orders")
                .id("get_orders")
                .description("Get all orders.")
                .to("direct:get_orders")
            .post("/orders")
                .id("new_order")
                .description("Create a new order.")
                .consumes("application/json")
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("New order details.")
                .endParam()
                .to("direct:new_order")
            .get("/orders/{id}")
                .id("get_order_by_id")
                .description("Get an order by order id.")
                .param()
                    .name("id")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("Order ID.")
                .endParam()
                .to("direct:get_order_by_id")
            .put("/orders/{id}")
                .id("update_order")
                .description("Update an order by ID.")
                .consumes("application/json")
                .param()
                    .name("id")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("Order ID.")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(true)
                    .description("Updated order.")
                .endParam()
                .to("direct:update_order");
    }
}
