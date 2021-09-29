package com.hao.ums.service;

import com.hao.ums.bean.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAll();

    Account getOne();
}
