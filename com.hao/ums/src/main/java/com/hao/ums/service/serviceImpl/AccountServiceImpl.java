package com.hao.ums.service.serviceImpl;

import com.hao.ums.bean.Account;
import com.hao.ums.mapper.AccountMapper;
import com.hao.ums.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> getAll() {
        return accountMapper.getAll();
    }

    @Override
    public Account getOne() {
        return accountMapper.getOne();
    }
}
