package com.catface.common.model;

import com.catface.common.enums.common.QueryDirectionEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author by catface
 * @date 2020/12/15
 */
@Data
@ApiModel(description = "分页请求模型")
public class OffsetRequest<O> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "当前页码,从1开始", example = "1212121212121")
    @NotNull(message = "偏移量不能为空")
    private O offset;

    @ApiModelProperty(value = "查询滚动方向", example = "NEXT")
    @NotNull(message = "查询滚动方向不能为空")
    private QueryDirectionEnum direction = QueryDirectionEnum.NEXT;

    @ApiModelProperty(value = "分页大小", example = "10")
    @Min(value = 1, message = "分页大小需大于0")
    private long size = 10;

    public OffsetRequest() {

    }

    public OffsetRequest(O offset, long size, QueryDirectionEnum direction) {
        this.offset = offset;
        this.size = size;
        this.direction = direction;
    }
}
