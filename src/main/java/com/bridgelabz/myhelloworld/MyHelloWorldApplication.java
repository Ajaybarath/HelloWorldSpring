package com.bridgelabz.myhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyHelloWorldApplication {

    public static void main(String[] args) {
        System.out.println("Hello from bridgelabz");
        SpringApplication.run(MyHelloWorldApplication.class, args);
    }

}
