package com.fyfe.idlecounter.controller;

import com.fyfe.idlecounter.service.CounterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/count/")
public class CounterController {

    private final CounterService counterService;

    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping(value = "inc")
    public int incCount() {
        return counterService.incrementCount();
    }
}
