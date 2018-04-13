package com.zc.docsearch.common;

/**
 * 接口返回实体Bean
 * @author zengchao
 * Created by zengchao on 2018/4/9.
 */
public class ResponseBean {
    /**
     * 状态码
     */
    private int code;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回的数据
     */
    private Object Data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    public ResponseBean(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        Data = data;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", Data=" + Data +
                '}';
    }
}
