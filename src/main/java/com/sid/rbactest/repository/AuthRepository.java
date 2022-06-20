package com.sid.rbactest.repository;

import com.sid.rbactest.model.User;
import org.springframework.data.repository.CrudRepository;

public interface AuthRepository extends CrudRepository<User, Integer> {
}
