package com.leqcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Reference :
 * 	https://spring.io/blog/2015/01/12/spring-and-angular-js-a-secure-single-page-application
 * 	https://spring.io/guides/tutorials/spring-security-and-angular-js/ (Official)
 * Regarding CSRF 
 *  https://stormpath.com/blog/where-to-store-your-jwts-cookies-vs-html5-web-storage
 */

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class SimpleAngularSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleAngularSecurityApplication.class, args);
    }
}
