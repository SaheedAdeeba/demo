package com.adeeba.account.service;

import com.adeeba.account.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAllAccount();

    void addAccount(Account account);

    Account getAccountById(Long id);

    void updateAccount(Account account);

    void deleteAccountById(Long id);


}
