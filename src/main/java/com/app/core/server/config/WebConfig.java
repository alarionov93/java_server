package com.app.core.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by sanya on 12.01.16.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.app.core.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
