package com.klapertart.elide.config;

import com.yahoo.elide.spring.config.ElideConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kurakuraninja
 * @since 17/07/24
 */


@Configuration
public class ElideConfig {

    @Bean
    public ElideConfigProperties settings() {
        return new ElideConfigProperties();
    }
}