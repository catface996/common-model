package com.catface.common.model;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by catface
 * @date 2021/8/2 11:21 上午
 * Copyright 2021 唯一艺术. All rights reserved.
 */
@Data
@ApiModel(description = "通过偏移量查询返回结果模型")
public class OffsetPageVO<O, T> {

    @ApiModelProperty(value = "结果列表")
    private List<T> records;

    @ApiModelProperty(value = "分页中出现的最小偏移量,用于下次查询上一页时使用")
    private O minOffset;

    @ApiModelProperty(value = "分页中出现的最大偏移量,用于下次查询下一页时使用")
    private O maxOffset;

    @ApiModelProperty(value = "分页大小")
    private Integer size;

    @ApiModelProperty(value = "是否有下一页,true:有;false:无")
    private Boolean hasNext;

    public OffsetPageVO() {

    }

    public OffsetPageVO(List<T> records, O minOffset, O maxOffset, Integer size, boolean hasNext) {
        this.records = records;
        this.minOffset = minOffset;
        this.maxOffset = maxOffset;
        this.size = size;
        this.hasNext = hasNext;
    }

}
