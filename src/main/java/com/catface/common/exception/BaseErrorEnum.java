package com.catface.common.exception;

/**
 * @author ds
 * @date 2019-02-02
 */
public interface BaseErrorEnum {

    /**
     * 错误码
     *
     * @return 错误码
     */
    String getCode();

    /**
     * 错误信息
     *
     * @return 错误信息
     */
    String getMessage();

}
