package com.thymeleaf.mapper;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.thymeleaf.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Package: com.web.web.mapper
 * <p>
 * Description： TODO
 * <p>
 * Author: 作者
 * <p>
 * Date: Created in 2019/12/31 9:53
 * <p>
 * Company: 公司
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public interface UserMapper extends BaseMapper<User> {

    @Results({
            @Result(property = "role",column = "userRoleId",one = @One(select = "com.thymeleaf.mapper.RoleMapper.selectById"))
    })
    @Select("select * from sys_user")
    public List<User>  findAllUsers();

    @Select("select * from sys_user where userName = #{userName} and password = #{password}")
    public User findByUserName(String userName, String password);

}
