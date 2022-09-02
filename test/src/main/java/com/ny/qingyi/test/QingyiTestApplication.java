package com.ny.qingyi.test;

import com.qytp.annomation.EnableQingyiTP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wenan.ren
 * @date 2022/8/31 16:54
 * @Description
 */
@EnableQingyiTP
@SpringBootApplication
public class QingyiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(QingyiTestApplication.class, args);
    }

}
