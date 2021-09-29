//Service层业务接口类编写：
package com.hao.ums.service;

import com.hao.ums.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);
}

