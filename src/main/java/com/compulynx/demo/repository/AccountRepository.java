package com.compulynx.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compulynx.demo.dto.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByCustomerId(String customerId);
}
