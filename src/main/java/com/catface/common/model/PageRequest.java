package com.catface.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by catface
 * @date 2020/12/15
 */
@Data
@ApiModel(description = "分页请求模型")
public class PageRequest {

    @ApiModelProperty(value = "当前页码,从1开始")
    private Integer current = 1;

    @ApiModelProperty(value = "分页大小")
    private Integer size = 10;

    public PageRequest() {

    }

    public PageRequest(Integer current, Integer size) {
        this.current = current;
        this.size = size;
    }

}
