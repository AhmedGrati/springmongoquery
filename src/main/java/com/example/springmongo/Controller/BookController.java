package com.example.springmongo.Controller;

import com.example.springmongo.Model.Book;
import com.example.springmongo.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @GetMapping("/find")
    public Book findById(@RequestParam String id) {
        return this.bookRepo.findById(id).orElse(null);
    }

    @GetMapping("/all")
    public List<Book> findAll() {
        return this.bookRepo.findAll();
    }

    @PostMapping("/add")
    public Book saveBook(@RequestBody Book book) {
        return this.bookRepo.save(book);
    }

    @DeleteMapping("/delete")
    public void deleteBook(@RequestParam String id) {
        this.bookRepo.deleteById(id);
    }

    @GetMapping("/criteria")
    public List<Book> getBooks(@RequestParam float maxPrice) {
        return this.bookRepo.findBooksByPriceAndReviews(maxPrice);
    }

}
