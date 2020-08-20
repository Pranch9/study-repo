package ru.pranch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Bean
    ApplicationContext xmlContext(){
        return new ClassPathXmlApplicationContext("ApplicationConfig.xml");
    }

}
