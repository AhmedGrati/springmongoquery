package com.example.springmongo.Controller;

import com.example.springmongo.Model.Book;
import com.example.springmongo.Model.Review;
import com.example.springmongo.Repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review")
public class ReviewController {
    @Autowired
    ReviewRepo reviewRepo;

    @GetMapping("/find")
    public Review findById(@RequestParam String id) {
        return this.reviewRepo.findById(id).orElse(null);
    }

    @GetMapping("/all")
    public List<Review> findAll() {
        return this.reviewRepo.findAll();
    }

    @PostMapping("/add")
    public Review saveBook(@RequestBody Review review) {
        return this.reviewRepo.save(review);
    }

    @DeleteMapping("/delete")
    public void deleteBook(@RequestParam String id) {
        this.reviewRepo.deleteById(id);
    }
}
