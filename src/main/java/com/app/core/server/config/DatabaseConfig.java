package com.app.core.server.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by sanya on 13.01.16.
 */

@Configuration
@EnableJpaRepositories("com.app.core.server.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("com.app.core.server")
public class DatabaseConfig {

    @Resource
    private Environment env;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());

        return em;
    }

    @Bean
    public DataSource dataSource() {

        BasicDataSource bds = new BasicDataSource();
        bds.setUrl(env.getRequiredProperty("db.url"));
        bds.setDriverClassName(env.getRequiredProperty("db.driver"));
        bds.setUsername(env.getRequiredProperty("db.username"));
        bds.setPassword(env.getRequiredProperty("db.password"));

        return bds;
    }
}
