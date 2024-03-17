package com.example.springboot.mysql.demo.dao;

import com.example.springboot.mysql.demo.model.UserDO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    /**
     * 新增
     * @param userDO
     * @return
     */
    int insert(UserDO userDO);

    /**
     * 查询
     * @param id
     * @return
     */
    UserDO queryById(Long id);

    /**
     * 修改
     * @param userDO
     * @return
     */
    int updateById(UserDO userDO);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteById(Long id);
}
