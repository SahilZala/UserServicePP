package com.pack.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.dao.AddressDao;
import com.pack.entity.AddressEntity;
import com.pack.service.AddressService;
import com.pack.util.AppUtility;

@Service
public class AddressDaoImpl implements AddressDao {

	@Autowired
	AddressService addressService;
	
	@Override
	public AddressEntity createAddress(AddressEntity address) {
		
		address.setId(AppUtility.getRandomeId());
		return addressService.createAddressService(address);
	}
	
	
}
