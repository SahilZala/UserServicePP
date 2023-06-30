package com.pack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.entity.UserEntity;
import com.pack.repository.UserRepository;
import com.pack.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserEntity createUser(UserEntity user) {
		return userRepo.save(user);
	}

	@Override
	public List<UserEntity> getAllUser() {
		
		return userRepo.findAll();
	}	
}
