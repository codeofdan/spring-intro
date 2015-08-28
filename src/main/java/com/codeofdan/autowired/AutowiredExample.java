package com.codeofdan.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AutowiredExample {

    @Autowired
    private HelloWorld helloWorld;

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.codeofdan.autowired");

        AutowiredExample autowiredExample = ctx.getBean(AutowiredExample.class);

        autowiredExample.run();
    }

    public void run() {
        helloWorld.sayHello();
    }
}
