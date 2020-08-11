package com.example.springmongo.Repo;

import com.example.springmongo.Model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewRepo extends MongoRepository<Review , String> {

    @Override
    void deleteById(String s);

    @Override
    List<Review> findAll();

    @Override
    Optional<Review> findById(String s);

    @Override
    <S extends Review> S save(S s);
}
