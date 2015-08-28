package com.codeofdan.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@Scope("prototype")
public class PrototypeCounter {

    private AtomicInteger counter = new AtomicInteger();

    public void count() {
        System.out.println(counter.incrementAndGet());
    }

}
