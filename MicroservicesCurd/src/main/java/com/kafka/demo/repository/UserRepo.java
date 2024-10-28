package com.kafka.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kafka.demo.modal.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
