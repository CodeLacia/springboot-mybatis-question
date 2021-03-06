package com.hao.ums.mapper;

import com.hao.ums.bean.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    List<Account> getAll();

    Account getOne();
}
