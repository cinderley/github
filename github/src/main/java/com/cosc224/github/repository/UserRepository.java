package com.cosc224.github.repository;

import com.cosc224.github.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    List<User> findAll();
    Optional<User> findByEmail(String email);
}
