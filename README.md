
# Lab: OpenAPI Spec to Camel Java DSL

Start Coding with CodeReady Workspaces: [![Start Coding!](developer-workspace.svg)](https://codeready-openshift-workspaces.apps.cluster-8811.8811.example.opentlc.com/f?url=https://github.com/pittar/fuse-contract-first-demo)

Route code.
```
SQL Insert:
insert into books (isbn, author, genre, publisher, title) values ('12345', 'Stephen King', 'Horror', 'Random House', 'It');

Configuration
        restConfiguration().component("servlet").contextPath("/").bindingMode(RestBindingMode.json);

Books outType
                .outType(Iterable.class)

Books/{isbn} outType
                .outType(Book.class)



        from("direct:get_books")
            .description("Greetings REST service implementation route")
            .log("Hello world")
            .bean(BookService.class, "findAllBooks()"); 

        from("direct:get_book_by_isbn")
            .description("Greetings REST service implementation route")
            .log("Find a single book by ISBN.")
            .bean(BookService.class, "findBookByISBN(${header.isbn})"); 
```