package com.codeofdan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationExample {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.codeofdan.annotation");

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.sayHello();
    }
}
