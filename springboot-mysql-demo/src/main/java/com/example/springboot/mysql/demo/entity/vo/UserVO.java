package com.example.springboot.mysql.demo.entity.vo;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class UserVO {
    /**
     * 用户ID
     */
    private Long id;
    /**
     * 姓名
     */
    @NotEmpty(message = "姓名不能为空")
    private String name;
    /**
     * 年龄
     */
    @NotNull(message = "年龄不能为空")
    private Integer age;
    /**
     * 性别
     */
    @NotNull(message = "性别不能为空")
    private Integer gender;
    /**
     * 手机号
     */
    @NotEmpty(message = "手机号不能为空")
    private String mobilePhone;
}
