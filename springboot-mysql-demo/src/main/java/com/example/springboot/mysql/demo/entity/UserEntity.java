package com.example.springboot.mysql.demo.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserEntity {
    /**
     * 用户ID
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**性别
     *
     */
    private Integer gender;
    /**
     * 手机号
     */
    private String mobilePhone;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 修改时间
     */
    private LocalDateTime updateTime;
}
