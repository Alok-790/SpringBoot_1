package com.alokSpringBootIntro.week1.Week1Intro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean //Alternate way to create a bean
    @Scope("prototype") // using this everytime u write code to create bean a different bean will be generated each time
    Apple apple() {
        return new Apple();
    }
}
