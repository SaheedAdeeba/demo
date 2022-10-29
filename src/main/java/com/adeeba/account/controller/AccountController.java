package com.adeeba.account.controller;

import com.adeeba.account.model.Account;
import com.adeeba.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    // List Of Accounts
    @GetMapping(path = "/accounts")
    public List<Account> getAll(){

        return accountService.getAllAccount();
    }

    // Get specific account
    @GetMapping(path = "accounts/{id}")
    public Account getAccountById(@PathVariable(name = "id") Long id){

        return accountService.getAccountById(id);
    }

    //Delete Account
    @DeleteMapping(path = "accounts/{id}")
    public void deleteAccount(@PathVariable(value = "id") Long id){
        accountService.deleteAccountById(id);
    }

    //Add new Account
    @PostMapping(path = "accounts")
    public void addAccount(@RequestBody Account account){
        accountService.addAccount(account);
    }

    @PutMapping(path = "accounts/{id}")
    public void updateAccount(@RequestBody Account account,@PathVariable(value ="id") Long id){
        Account accountById = accountService.getAccountById(id);
        accountById.setName(account.getName());
        accountById.setPhone(account.getPhone());
        accountById.setPanNumber(account.getPanNumber());
        accountById.setAddress(account.getAddress());

        accountService.addAccount(accountById);
    }
}
