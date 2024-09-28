package com.itheima.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * 该类用于封装用户的相关信息，并实现序列化接口，以支持对象的序列化操作
 */
public class User implements Serializable {
    // 用户唯一标识
    private Integer uuid;
    // 用户名
    private String userName;
    // 密码
    private String password;
    // 真实姓名
    private String realName;
    // 性别，1代表男，0代表女
    private Integer gender;
    // 出生日期
    private Date birthday;

    /**
     * 用户信息的字符串表示形式
     * 重写toString方法，以便在需要字符串表示用户对象时，提供详细的信息
     *
     * @return 用户信息的字符串
     */
    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }

    // 以下是各个字段的getter和setter方法

    /**
     * 获取用户唯一标识
     *
     * @return 用户唯一标识
     */
    public Integer getUuid() {
        return uuid;
    }

    /**
     * 设置用户唯一标识
     *
     * @param uuid 用户唯一标识
     */
    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取用户名
     *
     * @return 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取真实姓名
     *
     * @return 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取性别
     *
     * @return 性别，1代表男，0代表女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别，1代表男，0代表女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取出生日期
     *
     * @return 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
