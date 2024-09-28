package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * 用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 保存用户
     * @param user 要保存的用户对象
     * @return 保存是否成功
     */
    @Override
    public boolean save(User user) {
        return userDao.save(user);
    }

    /**
     * 更新用户信息
     * @param user 要更新的用户对象
     * @return 更新是否成功
     */
    @Override
    public boolean update(User user) {
        return userDao.update(user);
    }

    /**
     * 删除用户
     * @param uuid 用户的唯一标识
     * @return 删除是否成功
     */
    @Override
    public boolean delete(Integer uuid) {
        return userDao.delete(uuid);
    }

    /**
     * 获取用户信息
     * @param uuid 用户的唯一标识
     * @return 用户对象
     */
    @Override
    public User get(Integer uuid) {
        return userDao.get(uuid);
    }

    /**
     * 获取所有用户分页信息
     * @param page 页码
     * @param size 每页大小
     * @return 分页信息
     */
    @Override
    public PageInfo<User> getAll(int page,int size) {
        PageHelper.startPage(page,size);
        List<User> all = userDao.getAll();
        return new PageInfo<User>(all);
    }

    /**
     * 用户登录
     * @param userName 用户名
     * @param password 密码
     * @return 用户对象，如果登录成功；否则返回null
     */
    @Override
    public User login(String userName, String password) {
        return userDao.getByUserNameAndPassword(userName,password);
    }
}
