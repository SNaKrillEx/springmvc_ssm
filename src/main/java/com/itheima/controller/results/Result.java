package com.itheima.controller.results;

/**
 * 操作结果类，用于封装API操作结果
 */
public class Result {
    // 操作结果编码
    private Integer code;
    // 操作数据结果
    private Object data;
    // 消息
    private String message;

    /**
     * 构造函数，用于创建只有结果编码的Result对象
     *
     * @param code 结果编码
     */
    public Result(Integer code) {
        this.code = code;
    }

    /**
     * 构造函数，用于创建包含结果编码和数据的Result对象
     *
     * @param code 结果编码
     * @param data 操作数据结果
     */
    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    /**
     * 返回字符串表示的Result对象，包括结果编码、数据和消息
     */
    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

    /**
     * 获取结果编码
     *
     * @return 结果编码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置结果编码
     *
     * @param code 结果编码
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取操作数据结果
     *
     * @return 操作数据结果
     */
    public Object getData() {
        return data;
    }

    /**
     * 设置操作数据结果
     *
     * @param data 操作数据结果
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 获取消息
     *
     * @return 消息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置消息
     *
     * @param message 消息
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
