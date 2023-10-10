package com.compulynx.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compulynx.demo.dto.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
    
}
