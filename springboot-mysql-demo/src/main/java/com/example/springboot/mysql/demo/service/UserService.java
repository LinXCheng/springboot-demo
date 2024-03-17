package com.example.springboot.mysql.demo.service;

import com.example.springboot.mysql.demo.entity.UserEntity;

public interface UserService {
    /**
     * 新增
     * @param user
     */
    void insert(UserEntity user);

    /**
     * 查询
     * @param id
     * @return
     */
    UserEntity queryById(Long id);

    /**
     * 修改
     * @param user
     */
    void updateById(UserEntity user);

    /**
     * 删除
     * @param id
     */
    void deleteById(Long id);
}
