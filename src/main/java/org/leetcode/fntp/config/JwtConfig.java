package org.leetcode.fntp.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * TODO codewithme2.0版本预计转型SpringCloud微服务
 * @author fntp
 */
@Configuration
@Data
@ConfigurationProperties(prefix = "jwt")
public class JwtConfig {
    /**
     * 慢hash加密盐值
     */
    private String salt;
    /**
     * JWT过期时间
     */
    private Integer expiration;
    /**
     * 秘钥
     */
    private String secret;
    /**
     * token开头
     */
    private String tokenHead;
    /**
     * 签名
     */
    private String sign;

}
