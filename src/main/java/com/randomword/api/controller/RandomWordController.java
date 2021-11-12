package com.randomword.api.controller;

import com.randomword.api.service.RandomWordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomWordController {

    @Autowired
    private RandomWordService randomWordService;

    @GetMapping("/")
    public String randomWord() {
        return randomWordService.randomWord();
    }

    @GetMapping("/word")
    public String randomWord(@RequestParam(value = "length", defaultValue = "10") int length) {
        return randomWordService.getRandomWord(length);
    }
}
