package com.johnyehyo.agentLive.enums;


/**
 * @Description 响应枚举
 * @Author JohnYehyo
 * @Date 2021-03-02 14:56
 * @Version 1.0
 */
public enum ResponseEnum {

    SUCCESS(0, "操作成功"),
    CONNECTION_EXCEPTION(11111, "连接异常, 请尽快上线查看!"),
    DATABASE_EXCEPTION(22222, "连接数据库异常, 请尽快上线查看!"),
    REDIS_EXCEPTION(33332, "连接REDIS异常, 请尽快上线查看!");

    private Integer code;
    private String value;

    ResponseEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
