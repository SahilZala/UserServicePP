package com.pack.dao;

import java.util.List;

import com.pack.entity.UserEntity;

public interface UserDao {
	
	public UserEntity createUser(UserEntity user);
	public List<UserEntity> getAllUser();
	public UserEntity getUserByEmailId(String emailId);
}
