package com.tp.fullstack.bookstore.controller;

import com.tp.fullstack.bookstore.dto.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDTO>> getBooks(){
        BookDTO book = BookDTO.builder()
                .title("First book title")
                .build();
        List<BookDTO> books = List.of(book);
        return ResponseEntity.ok(books);
    }
}
