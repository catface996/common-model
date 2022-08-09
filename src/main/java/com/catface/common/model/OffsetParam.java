package com.catface.common.model;

import javax.validation.constraints.Min;

import com.catface.common.enums.common.QueryDirectionEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by catface
 * @date 2020/12/15
 */
@Data
@ApiModel(description = "根据偏移量分页查询参数,供service和dao层使用")
public class OffsetParam<O> {

    @ApiModelProperty(value = "当前页码,从1开始")
    private O offset;

    @ApiModelProperty(value = "查询滚动方向")
    private QueryDirectionEnum direction = QueryDirectionEnum.NEXT;

    @ApiModelProperty(value = "分页大小")
    @Min(value = 1, message = "分页大小需大于0")
    private Integer size = 10;

    public OffsetParam() {

    }

    public OffsetParam(O offset, Integer size, QueryDirectionEnum direction) {
        this.offset = offset;
        this.size = size;
        this.direction = direction;
    }
}
