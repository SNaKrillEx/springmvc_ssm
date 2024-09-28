package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.controller.results.Code;
import com.itheima.controller.results.Result;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.system.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// 用户控制器类，处理与用户相关的HTTP请求
@RestController
@RequestMapping("/user")
public class UserController {

    // 自动注入UserService bean
    @Autowired
    private UserService userService;

    // 添加用户
    // 通过POST请求接收User对象，调用服务层的save方法保存用户
    @PostMapping
    public Result save(User user){
        boolean flag = userService.save(user);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERROR);
    }

    // 更新用户信息
    // 通过PUT请求接收User对象，调用服务层的update方法更新用户信息
    @PutMapping
    public Result update(User user){
        boolean flag = userService.update(user);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERROR);
    }

    // 删除用户
    // 通过DELETE请求接收用户ID，调用服务层的delete方法删除用户
    @DeleteMapping("/{uuid}")
    public Result delete(@PathVariable Integer uuid){
        boolean flag = userService.delete(uuid);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERROR);
    }

    // 获取用户信息
    // 通过GET请求接收用户ID，调用服务层的get方法获取用户信息
    // 如果用户ID为10，则抛出BusinessException模拟异常
    @GetMapping("/{uuid}")
    public Result get(@PathVariable Integer uuid){
        User user = userService.get(uuid);
        if (uuid == 10 ) throw new BusinessException("查询出错啦，请重试！",Code.GET_ERROR);
        return new Result(null != user ?Code.GET_OK: Code.GET_ERROR,user);
    }

    // 获取所有用户分页信息
    // 通过GET请求接收页码和每页大小，调用服务层的getAll方法获取分页用户信息
    @GetMapping("/{page}/{size}")
    public Result getAll(@PathVariable Integer page, @PathVariable Integer size){
        PageInfo<User> all = userService.getAll(page, size);
        return new Result(null != all ?Code.GET_OK: Code.GET_ERROR,all);
    }

    // 用户登录
    // 通过POST请求接收用户名和密码，调用服务层的login方法进行登录验证
    @PostMapping("/login")
    public Result login(String userName,String password){
        User user = userService.login(userName,password);
        return new Result(null != user ?Code.GET_OK: Code.GET_ERROR,user);
    }

}
