package com.pack.controller.user;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.dao.UserDao;
import com.pack.entity.Response;
import com.pack.util.APIPaths;

@RestController
public class GetAllUserController {
	
	@Autowired
	UserDao userDao;
	
	@GetMapping(APIPaths.GET_ALL_USERS)
	public ResponseEntity<Response> getAllUser()
	{
		return new ResponseEntity<>(new Response(HttpStatus.OK.value(),"",userDao.getAllUser()),HttpStatus.OK);
	}
}
