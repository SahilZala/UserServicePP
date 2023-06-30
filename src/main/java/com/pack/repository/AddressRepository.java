package com.pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.entity.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, String>{
	
}
