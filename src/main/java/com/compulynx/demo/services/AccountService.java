package com.compulynx.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compulynx.demo.dto.Account;
import com.compulynx.demo.dto.ResponseMessage;
import com.compulynx.demo.repository.AccountRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public ResponseMessage createAccount(Account account) {
        try {
            // Create the account record
            accountRepository.save(account);
            return new ResponseMessage("Account created successfully", 200);
        } catch (Exception e) {
            log.error("Exception: {}", e);
            return new ResponseMessage("Failed to create Account", 500);
        }
    }

    public ResponseMessage updateAccount(Account account) {
        try {
            // Update the account record
            accountRepository.save(account);
            return new ResponseMessage("Account updated successfully", 200);
        } catch (Exception e) {
            log.error("Exception: {}", e);
            return new ResponseMessage("Failed to update Account", 500);
        }
    }
    
}
