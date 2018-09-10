package com.rodrigopereira.workshopmongo.services;


import com.rodrigopereira.workshopmongo.domain.User;
import com.rodrigopereira.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findALl(){
        return repo.findAll();
    }
}
