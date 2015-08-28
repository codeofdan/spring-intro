package com.codeofdan.autowired;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    public void sayHello() {
        System.out.println(getClass().getName());
    }
}
