package com.alokSpringBootIntro.week1.Week1Intro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component //use this to make this Apple class a bean
public class Apple {
    void eatApple() {
        System.out.println("Eating Apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsCreated() {
        System.out.println("Called This Before Apple is created");
    }

    @PreDestroy
    void callThisBeforeDestroy() {
        System.out.println("destroying the Apple Bean");
    }
}
