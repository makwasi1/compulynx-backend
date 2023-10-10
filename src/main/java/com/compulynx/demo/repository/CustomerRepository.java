package com.compulynx.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compulynx.demo.dto.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
