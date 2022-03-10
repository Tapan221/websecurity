package com.lilly.aads.nlp.security.service;

import java.util.List;

import com.lilly.aads.nlp.security.domain.User;
import com.lilly.aads.nlp.security.exception.domain.EmailExistException;
import com.lilly.aads.nlp.security.exception.domain.UserNotFoundException;
import com.lilly.aads.nlp.security.exception.domain.UsernameExistException;

public interface UserService {

    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
