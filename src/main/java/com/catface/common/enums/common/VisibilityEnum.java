package com.catface.common.enums.common;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.catface.common.enums.BaseEnum;

/**
 * @author catface
 * @since 2022/8/20
 */
public enum VisibilityEnum implements BaseEnum {

    PRIVATE("PRIVATE", "私有"),
    PUBLIC("PUBLIC", "公开"),
    SYSTEM("SYSTEM", "系统")
    ;

    @EnumValue
    private final String code;

    private final String desc;

    VisibilityEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 获取枚举值描述
     *
     * @return 枚举值描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 获取枚举值编码
     *
     * @return 枚举值编码
     */
    public String getCode() {
        return code;
    }
}
