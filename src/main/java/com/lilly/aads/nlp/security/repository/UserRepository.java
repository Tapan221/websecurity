package com.lilly.aads.nlp.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lilly.aads.nlp.security.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
