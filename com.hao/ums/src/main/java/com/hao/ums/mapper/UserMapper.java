//DAO层访问数据库接口文件：
package com.hao.ums.mapper;

import com.hao.ums.bean.UserBean;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    UserBean getInfo(@Param("name") String name, @Param("password") String password);

}