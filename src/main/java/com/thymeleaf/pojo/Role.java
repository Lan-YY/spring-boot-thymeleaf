package com.thymeleaf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;


@Data
@TableName("sys_role")
public class Role implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long roleId;
    private String roleName;
    private String roleDesc;
    private Integer roleFlag;

//    @OneToMany(targetEntity = User.class,fetch = FetchType.EAGER,cascade=CascadeType.PERSIST,mappedBy = "role")
//    private Set<User> users =new HashSet<User>();


    public Role(String roleName, String roleDesc, Integer roleFlag) {
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.roleFlag = roleFlag;
    }

    public Role() {
    }
}
