package com.pack.service;

import java.util.List;

import com.pack.entity.UserEntity;

public interface UserService {
	public UserEntity createUser(UserEntity user);
	public List<UserEntity> getAllUser();
}
