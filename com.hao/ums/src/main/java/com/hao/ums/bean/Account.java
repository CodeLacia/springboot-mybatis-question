package com.hao.ums.bean;

import com.hao.ums.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@ToString(callSuper = true)
@TableName("ums_account")
public class Account extends BaseEntity<Account> {

    private static final long serialVersionUID = 1L;

    private String username;

    private String realname;

    private String nickname;

    private String password;

    private String email;

    private String phone;

    private String header;

    private String sex;

    private String position;

    private Integer type;

    private String companyId;

    private String departmentId;

    private String jobNumber;

    private Integer status;

    @TableField(exist = false)
    private String label;

    @TableField(exist = false)
    private String value;

}
