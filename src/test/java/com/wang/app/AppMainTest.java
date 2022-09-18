package com.wang.app;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.DateUtil;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AppMainTest {
    @Test
    public void testDate() {
        String format = DateUtil.format(new Date(), DatePattern.NORM_DATETIME_PATTERN);
        System.out.println(format);
    }
}
