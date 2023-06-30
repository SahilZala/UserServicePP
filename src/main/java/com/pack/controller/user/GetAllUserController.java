package com.pack.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.dao.UserDao;
import com.pack.entity.UserEntity;
import com.pack.util.APIPaths;

@RestController
public class GetAllUserController {
	
	@Autowired
	UserDao userDao;
	
	@GetMapping(APIPaths.GET_ALL_USERS)
	public ResponseEntity<List<UserEntity>> getAllUser()
	{
		return new ResponseEntity<List<UserEntity>>( userDao.getAllUser(),HttpStatus.OK);
	}
}
