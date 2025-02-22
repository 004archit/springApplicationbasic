package org.example;

import org.example.beans.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
        ApplicationContext context=new ClassPathXmlApplicationContext("applicatio.xml");
        UserConfig config=(UserConfig) context.getBean("myBean");
    }
}