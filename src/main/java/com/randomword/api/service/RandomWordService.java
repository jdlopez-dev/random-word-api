package com.randomword.api.service;

import org.springframework.stereotype.Service;

@Service
public class RandomWordService {

    public String getRandomWord(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) (Math.random() * 26 + 'a'));
        }
        return sb.toString();
    }

    public String randomWord() {
        return "random-word";
    }

}