package com.pratiti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratiti.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
