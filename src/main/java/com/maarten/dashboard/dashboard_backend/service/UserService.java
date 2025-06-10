package com.maarten.dashboard.dashboard_backend.service;

import com.maarten.dashboard.dashboard_backend.model.User;
import com.maarten.dashboard.dashboard_backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User createUser(User user) {
        return repo.save(user);
    }
}
