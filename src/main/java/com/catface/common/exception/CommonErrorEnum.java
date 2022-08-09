package com.catface.common.exception;

/**
 * @author ds
 * @date 2019-02-02
 */
public enum CommonErrorEnum implements BaseErrorEnum {

  /**
   * 参数不合法
   */
  ILLEGAL_ARGUMENT("参数不合法"),
  SYSTEM_ERROR("网络环境不稳定，请稍后重试"),
  SYSTEM_TIMEOUT("接口超时"),
  PARAM_ERROR("参数错误，参数为空或者不完整"),
  DATABASE_ERROR("数据库处理失败"),
  CACHE_ERROR("redis缓存处理失败"),
  BINDING_ERROR("资源绑定失败"),
  METHOD_NOT_SUPPORTED("请求方法不支持"),
  ARGUMENT_NOT_VALID("参数校验通不过"),
  ARGUMENT_TYPE_MISMATCH("请求参数格式转换异常"),
  BIND_ERROR("参数类型不匹配"),
  ILLEGAL_STATE("非法状态"),
  DUPLICATE_KEY("数据已存在"),
  BODY_IS_MISS("读取body信息失败"),
  LOGIN_STATUS_ERROR("登录状态失效"),
  USER_NOT_EXISTS("用户不存在"),
  WX_AUTH_ERROR("微信授权登录失败"),
  SIGN_ERROR("签名失败");

  private final String message;

  CommonErrorEnum(String message) {
    this.message = message;
  }

  public String getCode() {
    return name();
  }

  public String getMessage() {
    return message;
  }
}
