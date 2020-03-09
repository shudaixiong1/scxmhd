package com.zwxt.mapper;

import com.zwxt.pojo.User;

import java.util.List;

/**
 * @description:
 * @projectName:mavenweb-git
 * @see:com.zwxt.mapper
 * @author:liyongchao
 * @createTime:2020/3/9 22:05
 * @version:1.0
 */
public interface UserMapper {
    /**
     * 查询用户信息
     */
    public List<User> getUsers();

    /**
     * 新增用户信息
     */
    public int addUser(User user);
}
