package com.zc.docsearch.common;

/**
 * Created by zengchao on 2018/4/9.
 */
public class Constant {
    /**
     * 返回值响应码
     */
    public enum ResponseCode {
        REQUEST_SUCCESS(100, "请求成功!"),
        REQUEST_PATH_ERROR(101,"请求资源未找到!404"),
        PARAMETER_ERROR(102, "参数错误!"),
        SERVER_ERROR(103,"服务器内部异常"),
        QUERY_DATA_IS_NULL(104,"没有找到符合的数据");
        private int code;
        private String message;

        ResponseCode(int code, String message) {
            this.code = code;
            this.message = message;
        }

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
    }

    /**
     * 数据类型
     */
    public enum DataType{
        SW("sw","网上订单"),
        SA("sa","销售出库单"),
        SB("sb","销售出库退回单");
        private String type;
        private String name;

        DataType(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static final String AUTHID = "";
    public static final String FU_URL = "http://121.41.173.11:30004/api/AFu_U8/router.aspx";
}
