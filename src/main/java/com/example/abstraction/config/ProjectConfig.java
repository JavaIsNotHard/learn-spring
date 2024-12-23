package com.example.abstraction.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.example.abstraction.proxies",
        "com.example.abstraction.repositories",
        "com.example.abstraction.service"
})
public class ProjectConfig {
}
