package com.itheima.system.exception;

/**
 * 自定义系统异常类，继承自运行时异常类
 * 用于处理系统中发生的异常情况
 */
public class SystemException extends RuntimeException {

    /**
     * 默认构造函数，创建一个不带详细消息或原因的系统异常对象
     */
    public SystemException() {
    }

    /**
     * 构造函数，创建一个带有详细消息的系统异常对象
     *
     * @param message 异常的详细消息
     */
    public SystemException(String message) {
        super(message);
    }

    /**
     * 构造函数，创建一个带有详细消息和原因的系统异常对象
     *
     * @param message 异常的详细消息
     * @param cause   导致此异常的原因
     */
    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造函数，创建一个带有原因的系统异常对象
     *
     * @param cause 导致此异常的原因
     */
    public SystemException(Throwable cause) {
        super(cause);
    }

    /**
     * 构造函数，创建一个带有详细消息、原因和异常链属性的系统异常对象
     *
     * @param message          异常的详细消息
     * @param cause            导致此异常的原因
     * @param enableSuppression 是否抑制异常链
     * @param writableStackTrace 是否记录原因的堆栈跟踪
     */
    public SystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
