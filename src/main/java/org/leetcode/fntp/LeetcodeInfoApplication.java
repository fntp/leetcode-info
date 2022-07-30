package org.leetcode.fntp;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @author fntp
 */
@SpringBootApplication
@MapperScan("org.leetcode.fntp.mapper")
@EnableTransactionManagement
@EnableScheduling
@Slf4j
public class LeetcodeInfoApplication {

    public static void main(String[] args) {
        try {
            log.info ("Server started successfully, leetcode-server start to run...");
            SpringApplication.run (LeetcodeInfoApplication.class, args);
            log.info ("leetcode-server is running...");
        } catch (Exception e) {
            log.error (e.getMessage ());
        }
    }

}
