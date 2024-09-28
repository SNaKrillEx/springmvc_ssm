package com.itheima.system.exception;

/**
 * 自定义业务异常类，用于处理业务逻辑中的异常情况
 * 继承自RuntimeException，表示该异常在运行时可能会抛出
 * 该异常类增加了错误编码的处理，以便于前端或后端做更细致的异常处理
 */
public class BusinessException extends RuntimeException {
    //自定义异常中封装对应的错误编码，用于异常处理时获取对应的操作编码
    private Integer code;

    /**
     * 获取错误编码
     * @return 错误编码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置错误编码
     * @param code 错误编码
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 构造函数，仅带错误编码
     * @param code 错误编码
     */
    public BusinessException(Integer code) {
        this.code = code;
    }

    /**
     * 构造函数，带错误信息和错误编码
     * @param message 错误信息
     * @param code 错误编码
     */
    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * 构造函数，带错误信息、错误原因和错误编码
     * @param message 错误信息
     * @param cause 错误原因
     * @param code 错误编码
     */
    public BusinessException(String message, Throwable cause,Integer code) {
        super(message, cause);
        this.code = code;
    }

    /**
     * 构造函数，带错误原因和错误编码
     * @param cause 错误原因
     * @param code 错误编码
     */
    public BusinessException(Throwable cause,Integer code) {
        super(cause);
        this.code = code;
    }

    /**
     * 构造函数，带错误信息、错误原因、是否抑制异常和是否写入堆栈跟踪，并指定错误编码
     * @param message 错误信息
     * @param cause 错误原因
     * @param enableSuppression 是否抑制异常
     * @param writableStackTrace 是否写入堆栈跟踪
     * @param code 错误编码
     */
    public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace,Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }
}
