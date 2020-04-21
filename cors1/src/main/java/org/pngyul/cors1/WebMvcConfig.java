package org.pngyul.cors1;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080")
                .allowedHeaders("token","content-type","header3")
                .allowedMethods("PUT","POST","GET")
                .exposedHeaders("token")
                .allowCredentials(true)
                .maxAge(5);
    }
}
