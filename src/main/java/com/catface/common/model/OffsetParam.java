package com.catface.common.model;

import com.catface.common.enums.common.QueryDirectionEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

import javax.validation.constraints.Min;

/**
 * @author by catface
 * @date 2020/12/15
 */
@Data
@ApiModel(description = "根据偏移量分页查询参数,供service和dao层使用")
public class OffsetParam<O> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "当前页码,从1开始")
    private O offset;

    @ApiModelProperty(value = "查询滚动方向")
    private QueryDirectionEnum direction = QueryDirectionEnum.NEXT;

    @ApiModelProperty(value = "分页大小")
    @Min(value = 1, message = "分页大小需大于0")
    private long size = 10L;

    public OffsetParam() {

    }

    public OffsetParam(O offset, Long size, QueryDirectionEnum direction) {
        this.offset = offset;
        this.size = size;
        this.direction = direction;
    }
}
