package com.example.springboot.mysql.demo.service.impl;

import com.example.springboot.mysql.demo.dao.UserDao;
import com.example.springboot.mysql.demo.entity.UserEntity;
import com.example.springboot.mysql.demo.model.UserDO;
import com.example.springboot.mysql.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 新增
     * @param user
     */
    @Override
    public void insert(UserEntity user) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(user, userDO);
        userDao.insert(userDO);
    }

    /**
     * 查询
     * @param id
     * @return
     */
    @Override
    public UserEntity queryById(Long id) {
        if (id == null) {
            return null;
        }
        UserDO userDO = userDao.queryById(id);
        if (userDO == null) {
            return null;
        }
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDO, userEntity);
        return userEntity;
    }

    /**
     * 修改
     * @param user
     */
    @Override
    public void updateById(UserEntity user) {
        UserDO exist = userDao.queryById(user.getId());
        if (exist == null) {
            return;
        }
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(user, userDO);
        userDao.updateById(userDO);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void deleteById(Long id) {
        UserDO exist = userDao.queryById(id);
        if (exist == null) {
            return;
        }
        userDao.deleteById(id);
    }
}
