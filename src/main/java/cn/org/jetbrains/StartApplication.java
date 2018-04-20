package cn.org.jetbrains;

import io.spring.initializr.metadata.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }


    /**
     * 去除自动去spring-boot官网拉取最新版本问题。
     *
     * @param properties
     * @return
     */
    @Bean
    public InitializrMetadataProvider initializrMetadataProvider(
            InitializrProperties properties) {
        InitializrMetadata metadata = InitializrMetadataBuilder
                .fromInitializrProperties(properties).build();
        return new SimpleInitializrMetadataProvider(metadata);
    }
}
