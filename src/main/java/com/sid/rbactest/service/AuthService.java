package com.sid.rbactest.service;

import com.sid.rbactest.model.User;
import com.sid.rbactest.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthRepository authRepository;

    public User getUserById(int id){
        return authRepository.findById(id).get();
    }

    public User upsertUser(User user){
        return authRepository.save(user);
    }
}
