package com.catface.common.model;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by catface
 * @date 2020/12/15
 */
@Data
@ApiModel(description = "分页通用返回模型")
public class PageVO<T> {

    @ApiModelProperty(value = "结果列表")
    private List<T> records;

    @ApiModelProperty(value = "当前页码")
    private Integer current;

    @ApiModelProperty(value = "分页大小")
    private Integer size;

    @ApiModelProperty(value = "总页数")
    private Integer pages;

    @ApiModelProperty(value = "是否有下一页,true:有;false:无")
    private Boolean hasNext;

    @ApiModelProperty(value = "总条数")
    private Integer total;

    public PageVO(){

    }

    public PageVO(List<T> records, Integer current, Integer size, Integer pages, Integer total) {
        this.records = records;
        this.current = current;
        this.size = size;
        this.pages = pages;
        this.hasNext = current < pages;
        this.total = total;
    }

}
