package org.leetcode.fntp.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author fntp
 * @description TODO
 * @date 2022/7/30 18:12
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "my-webclient")
public class WebClientConfig {
    /**
     * 允许开放JavaScript
     */
    @Value ("$enableJavaScript")
    private Boolean enableJavaScript;
    /**
     * 允许开放css
     */
    @Value ("$enableCss")
    private Boolean enableCss;

}
