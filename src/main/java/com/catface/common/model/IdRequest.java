package com.catface.common.model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author by catface
 * @date 2020/12/15
 */
@Data
@ApiModel(description = "id请求模型")
public class IdRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "业务ID")
    @NotNull(message = "ID不能为空")
    private Long id;

}
