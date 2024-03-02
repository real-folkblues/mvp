//package org.launchcode.mvp.config; // Adjust the package name as per your project structure
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:3000") // For development, you might use "*", but it's more
//                // secure to
//                // specify your
//                // frontend's URL in production
//                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
//    }
//}
