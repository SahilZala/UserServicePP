package com.pack.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.UserDao;
import com.pack.entity.UserEntity;
import com.pack.service.UserService;
import com.pack.util.AppUtility;

@Service
public class UserDaoImpl implements UserDao{

	@Autowired
	UserService userService;
	
	@Override
	public UserEntity createUser(UserEntity user) {
		user.setId(AppUtility.getRandomeId());
		return userService.createUser(user);
	}

	@Override
	public List<UserEntity> getAllUser() {
		return userService.getAllUser();
	}
}
