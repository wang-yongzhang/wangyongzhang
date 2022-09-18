package com.wang.app.model.result.app;


public enum AppEnum {
    APP_EXCEPTION("001", "系统异常，请稍后再试！"),
    APP_002("002", "系统异常，请稍后再试！"),
    ;
    private final String code;
    private final String message;

    AppEnum(String code, String message) {
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
