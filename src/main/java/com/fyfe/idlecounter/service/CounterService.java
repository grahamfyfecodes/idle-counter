package com.fyfe.idlecounter.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CounterService {

    private final AtomicInteger counter;

    public CounterService() {
        this.counter = new AtomicInteger();
    }

    public int incrementCount() {
        return counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }
}
