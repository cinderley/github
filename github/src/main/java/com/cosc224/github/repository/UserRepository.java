package com.cosc224.github.repository;

import com.cosc224.github.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
