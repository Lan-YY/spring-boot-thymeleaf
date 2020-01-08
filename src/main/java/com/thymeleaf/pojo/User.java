package com.thymeleaf.pojo;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("sys_user")
public class User {
    @TableId(type = IdType.AUTO)
    @TableField("userId")
    private Long userid;
    @TableField("username")
    private String UserName;
    @TableField
    private String password;
//    private Long userRoleId;
    private Role role;
    @TableField("userflag")
    private Integer userFlag;

    public User(String userName, String password, Role role, Integer userFlag) {
        UserName = userName;
        this.password = password;
        this.role = role;
        this.userFlag = userFlag;
    }

    public User() {

    }
}
