package com.catface.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * @author by catface
 * @date 2020/12/15
 */
@Data
@ApiModel(description = "http通用返回模型")
public class JsonResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String SUCCESS_CODE = "200";
    public static final String ERROR_CODE = "500";
    public static final String SUCCESS_MESSAGE = "操作成功!";
    public static final String RPC_ERROR = "系统繁忙,请稍后重试!";

    @ApiModelProperty(value = "状态码", example = SUCCESS_CODE, required = true)
    private String code;

    @ApiModelProperty(value = "请求成功与否,true:成功,false:失败", required = true)
    private Boolean success;

    @ApiModelProperty(value = "提示信息", example = SUCCESS_MESSAGE, required = true)
    private String message;

    @ApiModelProperty(value = "返回业务数据")
    private T data;

    private JsonResult() {

    }

    public JsonResult(boolean isSuccess, String code, String message) {
        this.success = isSuccess;
        this.code = code;
        this.message = message;
    }

    public static <T> JsonResult<T> success() {
        return new JsonResult<T>(true, SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    public static <T> JsonResult<T> success(T data) {
        JsonResult<T> result = new JsonResult<T>(true, SUCCESS_CODE, SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public static <T> JsonResult<T> error(String message) {
        return new JsonResult<T>(false, ERROR_CODE, message);
    }

    public static <T> JsonResult<T> error(T data, String message) {
        JsonResult<T> result = new JsonResult<T>(false, ERROR_CODE, message);
        result.setData(data);
        return result;
    }

    public static <T> JsonResult<T> rpcError() {
        return new JsonResult<T>(false, ERROR_CODE, RPC_ERROR);
    }

    public static <T> JsonResult<T> rpcError(String message) {
        return new JsonResult<T>(false, ERROR_CODE, message);
    }

    public static <T> JsonResult<T> error(String message, String code) {
        JsonResult<T> result = new JsonResult<T>(false, code, message);
        result.setCode(code);
        return result;
    }

}
