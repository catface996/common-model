package com.catface.common.exception;

import lombok.Data;

/**
 * @author ds
 * @date 2019-01-23
 */
@Data
public class CatfaceException extends RuntimeException {

  private String errorCode;

  private String errorMessage;

  public CatfaceException(BaseErrorEnum baseErrorEnum) {
    super(baseErrorEnum.getMessage());
    this.errorCode = baseErrorEnum.getCode();
    this.errorMessage = baseErrorEnum.getMessage();
  }

  public CatfaceException(String errorCode, String errorMessage) {
    super(errorMessage);
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }

  public CatfaceException(BaseErrorEnum baseErrorEnum, Throwable cause) {
    super(cause);
    this.errorCode = baseErrorEnum.getCode();
    this.errorMessage = baseErrorEnum.getMessage();
  }

  public String getErrorCode() {
    return errorCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
