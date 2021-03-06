package com.codeofdan.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlExample {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.sayHello();
    }
}
