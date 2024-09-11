package com.example.demo.api.controller;

import com.example.demo.api.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController

public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/book")
    public Book getBook(@RequestParam Integer id){
        Optional book = bookService.getBook(id);
        if(book.isPresent()){
            return (Book) book.get();
        }
        return null;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        List<Book> books2 = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            Optional book = bookService.getBook(i);
            if (book.isPresent()) {
                books2.add((Book) book.get());
            }
        }
        return books2;
    }
}
