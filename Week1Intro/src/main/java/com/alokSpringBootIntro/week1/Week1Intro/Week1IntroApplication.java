package com.alokSpringBootIntro.week1.Week1Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Week1IntroApplication implements CommandLineRunner {

//	@Autowired //notifies the spring that this object needs to be injected in the class
//	Apple obj1;
//
//	@Autowired
//	Apple obj2;

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(Week1IntroApplication.class, args);

		//obj.eatApple(); cannot call non static obj in static function as psvm is static thus we use CommandLineRunner
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(dbService.getData());

//		obj1.eatApple();
//		obj2.eatApple();
//
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
	}
}
