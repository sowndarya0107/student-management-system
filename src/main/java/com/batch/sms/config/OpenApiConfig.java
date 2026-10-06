package com.batch.sms.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI studentManagementOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Student Management System API")
                        .description("Phase 2: Department, Course, Student with relationships, "
                                + "pagination, search, caching and image upload")
                        .version("v1"));
    }
}
