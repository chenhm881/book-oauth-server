package com.heiio.bookoauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookOauthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookOauthServerApplication.class, args);
    }

}
