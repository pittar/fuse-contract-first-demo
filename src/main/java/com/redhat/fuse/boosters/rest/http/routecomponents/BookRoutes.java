package com.redhat.fuse.boosters.rest.http.routecomponents;


import com.redhat.fuse.boosters.rest.http.service.BookService;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public final class BookRoutes extends RouteBuilder {
    /**
     * Defines Apache Camel routes using REST DSL fluent API.
     */
    public void configure() {

        from("direct:get_books")
            .description("Greetings REST service implementation route")
            .log("Hello world")
            .bean(BookService.class, "findAllBooks()"); 

        from("direct:get_book_by_isbn")
            .description("Greetings REST service implementation route")
            .log("Find a single book by ISBN.")
            .bean(BookService.class, "findBookByISBN(${header.isbn})"); 
    }
}