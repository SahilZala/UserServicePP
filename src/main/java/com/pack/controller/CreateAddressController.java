package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pack.dao.AddressDao;
import com.pack.entity.AddressEntity;
import com.pack.util.APIPaths;

@RestController
public class CreateAddressController {
	
	@Autowired
	private AddressDao addressDao;
	
	@PostMapping(APIPaths.CREATE_ADDRESS)
	public ResponseEntity<AddressEntity> createAddress(@RequestBody AddressEntity address)
	{
		return new ResponseEntity<AddressEntity>(addressDao.createAddress(address),HttpStatus.OK);
	}
}
