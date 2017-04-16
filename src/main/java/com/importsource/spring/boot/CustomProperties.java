package com.importsource.spring.boot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author hezhuofan
 */
@ConfigurationProperties(prefix = "importsource.mail")
@Data
public class CustomProperties {
    private String password;
}
