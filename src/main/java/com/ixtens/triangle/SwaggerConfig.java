package com.ixtens.triangle;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/swagger-ui.html")) {
            registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/swagger/swagger-ui.html");
        }
        if (!registry.hasMappingForPattern("/springfox.js")) {
            registry.addResourceHandler("/springfox.js").addResourceLocations("classpath:/swagger/springfox.js");
        }
    }
}
