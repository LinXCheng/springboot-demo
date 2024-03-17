package com.example.springboot.mysql.demo.controller;

import com.example.springboot.mysql.demo.entity.UserEntity;
import com.example.springboot.mysql.demo.entity.vo.ResponseVO;
import com.example.springboot.mysql.demo.entity.vo.UserVO;
import com.example.springboot.mysql.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@RequestMapping("/admin/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 新增用户
     * @param userVO
     * @return
     */
    @PostMapping("/insert")
    public ResponseVO<Void> insert(@RequestBody @Valid UserVO userVO) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userVO, userEntity);
        userService.insert(userEntity);
        return ResponseVO.ok();
    }

    /**
     * 根据用户ID查询用户信息
     * @param id 用户ID
     * @return
     */
    @GetMapping("/query")
    public ResponseVO<UserVO> queryById(@RequestParam(value = "id") Long id) {
        UserEntity user = userService.queryById(id);
        return ResponseVO.ok(user);
    }

    /**
     * 修改用户信息
     * @param userVO
     * @return
     */
    @PostMapping("/update")
    public ResponseVO<Void> update(@RequestBody @Valid UserVO userVO) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userVO, userEntity);
        userService.updateById(userEntity);
        return ResponseVO.ok();
    }

    /**
     * 根据用户ID删除用户
     * @param id 用户ID
     * @return
     */
    @DeleteMapping("/delete")
    public ResponseVO<Void> delete(@RequestParam(value = "id") Long id) {
        userService.deleteById(id);
        return ResponseVO.ok();
    }
}
