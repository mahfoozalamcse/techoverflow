package com.mahfooz.blog.services;

import com.mahfooz.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}