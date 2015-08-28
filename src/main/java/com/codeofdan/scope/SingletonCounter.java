package com.codeofdan.scope;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class SingletonCounter {

    private AtomicInteger counter = new AtomicInteger();

    public void count() {
        System.out.println(counter.incrementAndGet());
    }

}
