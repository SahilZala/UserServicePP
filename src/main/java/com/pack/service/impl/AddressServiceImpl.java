package com.pack.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.entity.AddressEntity;
import com.pack.repository.AddressRepository;
import com.pack.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepo;
	
	@Override
	public AddressEntity createAddressService(AddressEntity address) {
		return addressRepo.save(address);
	}
	
}
