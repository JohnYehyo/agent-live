package com.johnyehyo.agentLive.entity;


import java.io.Serializable;

/**
 * @description: 统一返回
 * @author: JohnYehyo
 * @create: 2021-04-26 01:22:48
 */
public class ResponseVo<T> implements Serializable {

    private static final long serialVersionUID = 2157815966898945209L;

    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
