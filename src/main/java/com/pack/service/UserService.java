package com.pack.service;

import java.util.List;

import com.pack.entity.UserEntity;
import com.pack.exception.UserNotFouneException;

public interface UserService {
	public UserEntity createUser(UserEntity user);
	public List<UserEntity> getAllUser();
	public UserEntity getUserByEmailId(String emailId) throws UserNotFouneException;
}
