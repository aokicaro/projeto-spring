package com.aoki.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aoki.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}
