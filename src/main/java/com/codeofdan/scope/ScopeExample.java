package com.codeofdan.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeExample {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.codeofdan.scope");

        SingletonCounter counter1 = ctx.getBean(SingletonCounter.class);
        counter1.count();
        counter1.count();

        SingletonCounter counter2 = ctx.getBean(SingletonCounter.class);
        counter2.count();

        PrototypeCounter counter3 = ctx.getBean(PrototypeCounter.class);
        counter3.count();
        counter3.count();

        PrototypeCounter counter4 = ctx.getBean(PrototypeCounter.class);
        counter4.count();
    }
}
