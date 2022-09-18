package com.wang.app.model.result.app;

import com.wang.app.model.result.Business;
import com.wang.app.model.result.Head;

public class AppHead {
    public static Head APP_EXCEPTION = create(AppEnum.APP_EXCEPTION);

    private static Head create(AppEnum appEnum) {
        Head head = new Head();
        head.setCode(Business.APP_CONTROLLER + appEnum.getCode());
        head.setMessage(appEnum.getMessage());
        return head;
    }
}
