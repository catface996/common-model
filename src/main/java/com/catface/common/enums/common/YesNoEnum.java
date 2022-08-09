package com.catface.common.enums.common;

import com.catface.common.enums.BaseEnum;
import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author by catface
 * @date 2020/12/18
 */
public enum YesNoEnum implements BaseEnum {

    /**
     * 是否枚举值,兼容mysql的boolean类型
     */
    YES("YES", "是"),

    NO("NO", "否"),

    ;

    @EnumValue
    private final String code;

    private final String desc;

    YesNoEnum(String code, String desc) {
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
