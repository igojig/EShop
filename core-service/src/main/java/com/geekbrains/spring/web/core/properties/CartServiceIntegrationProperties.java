package com.geekbrains.spring.web.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "integrations.cart-service")
@Data
public class CartServiceIntegrationProperties {

    @ConstructorBinding
    @Data
    @ConfigurationProperties(prefix = "integrations.cart-service.timeouts")
    public static class Timeouts{
        private Integer connect;
        private Integer read;
        private Integer write;
    }

    private String url;
    private Timeouts timeouts;

}



