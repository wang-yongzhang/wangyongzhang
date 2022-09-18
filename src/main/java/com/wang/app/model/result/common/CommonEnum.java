package com.wang.app.model.result.common;

public enum CommonEnum {
    /**
     * 成功
     */
    SUCCESS("000", "SUCCESS"),
    /**
     * 普通异常
     */
    EXCEPTION("001", "Exception"),
    /**
     * IO异常
     */
    IO_EXCEPTION("002", "IOException"),
    /**
     * 空指针异常
     */
    NULL_POINTER_EXCEPTION("003", "NullPointerException"),
    /**
     * 出现了业务异常
     */
    WANG_EXCEPTION("004", "出现了业务异常"),
    ;
    private String code;
    private String message;

    CommonEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
