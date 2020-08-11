package com.example.springmongo.Repo;

import com.example.springmongo.Model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookRepo extends CrudRepository<Book, String> {

    @Override
    void deleteById(String s);

    @Override
    <S extends Book> S save(S s);

    @Override
    Optional<Book> findById(String string);

    @Override
    List<Book> findAll();

    @Query("{price:{$lt:?0} , reviewList:{$ne:null}}")
    List<Book> findBooksByPriceAndReviews(float maxPrice);
}
