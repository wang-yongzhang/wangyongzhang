package com.wang.app.model.result.common;

import com.wang.app.model.result.Business;
import com.wang.app.model.result.Head;

public class CommonHead {
    public static Head SUCCESS = create(CommonEnum.SUCCESS);
    public static Head EXCEPTION = create(CommonEnum.EXCEPTION);
    public static Head IO_EXCEPTION = create(CommonEnum.IO_EXCEPTION);
    public static Head NULL_POINTER_EXCEPTION = create(CommonEnum.NULL_POINTER_EXCEPTION);
    public static Head WANG_EXCEPTION = create(CommonEnum.WANG_EXCEPTION);

    private static Head create(CommonEnum commonEnum) {
        Head head = new Head();
        head.setCode(Business.GLOBAL + commonEnum.getCode());
        head.setMessage(commonEnum.getMessage());
        return head;
    }
}
