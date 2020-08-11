package com.example.springmongo.Repo;

import com.example.springmongo.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends MongoRepository<User,String> {

    @Override
    <S extends User> S save(S s);

    @Override
    List<User> findAll();

    @Override
    void deleteById(String s);

    @Override
    Optional<User> findById(String s);
}
