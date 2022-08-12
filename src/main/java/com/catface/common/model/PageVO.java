package com.catface.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

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
    private Long current;

    @ApiModelProperty(value = "分页大小")
    private Long size;

    @ApiModelProperty(value = "总页数")
    private Long pages;

    @ApiModelProperty(value = "是否有下一页,true:有;false:无")
    private Boolean hasNext;

    @ApiModelProperty(value = "总条数")
    private Long total;

    public PageVO() {

    }

    public PageVO(List<T> records, long current, long size, long pages, long total) {
        this.records = records;
        this.current = current;
        this.size = size;
        this.pages = pages;
        this.hasNext = current < pages;
        this.total = total;
    }

    public PageVO(long current, long size, long pages, long total) {
        this.current = current;
        this.size = size;
        this.pages = pages;
        this.hasNext = current < pages;
        this.total = total;
    }

}
