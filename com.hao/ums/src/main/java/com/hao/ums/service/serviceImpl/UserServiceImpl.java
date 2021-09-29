package com.hao.ums.service.serviceImpl;
//Service层业务实现类编写，注意要注解@Service，注入DAO：
import com.hao.ums.bean.UserBean;
import com.hao.ums.mapper.UserMapper;
import com.hao.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}