package com.rodrigopereira.workshopmongo.services;


import com.rodrigopereira.workshopmongo.domain.Post;
import com.rodrigopereira.workshopmongo.domain.User;
import com.rodrigopereira.workshopmongo.dto.UserDTO;
import com.rodrigopereira.workshopmongo.exception.ObjectNotFoundException;
import com.rodrigopereira.workshopmongo.repository.PostRepository;
import com.rodrigopereira.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }


}
