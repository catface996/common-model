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
@ApiModel(description = "分页请求模型")
public class PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "当前页码,从1开始", required = true, example = "1")
    private long current = 1;

    @ApiModelProperty(value = "分页大小", required = true, example = "10")
    private long size = 10;

    public PageRequest() {

    }

    public PageRequest(long current, long size) {
        this.current = current;
        this.size = size;
    }

}
