package com.wang.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OpenBrowser implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("开始自动加载指定的页面");
        try {
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("cmd /c start http://localhost:8080/app/index.html");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
