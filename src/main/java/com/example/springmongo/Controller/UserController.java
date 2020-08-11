package com.example.springmongo.Controller;

import com.example.springmongo.Model.Review;
import com.example.springmongo.Model.User;
import com.example.springmongo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/find")
    public User findById(@RequestParam String id) {
        return this.userRepo.findById(id).orElse(null);
    }

    @GetMapping("/all")
    public List<User> findAll() {
        return this.userRepo.findAll();
    }

    @PostMapping("/add")
    public User saveBook(@RequestBody User user) {
        return this.userRepo.save(user);
    }

    @DeleteMapping("/delete")
    public void deleteBook(@RequestParam String id) {
        this.userRepo.deleteById(id);
    }
}
