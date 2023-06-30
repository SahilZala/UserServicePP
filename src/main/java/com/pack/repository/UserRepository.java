package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}
