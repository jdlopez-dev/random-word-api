package com.randomword.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.randomword.api.model.RandomWord;
import com.randomword.api.repository.RandomWordRepository;

@Service
public class RandomWordService {

    private RandomWordRepository randomWordRepository;

    RandomWordService(RandomWordRepository randomWordRepository) {
        this.randomWordRepository = randomWordRepository;
    }

    public List<RandomWord> getCountries() {
        return randomWordRepository.findAll();
    }

    public String getRandomWord(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) (Math.random() * 26 + 'a'));
        }
        return sb.toString();
    }

    public String randomWord() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("bitcoin");
        words.add("ethereum");
        words.add("ripple");
        words.add("litecoin");
        words.add("monero");
        words.add("dash");
        return words.get((int) (Math.random() * words.size()));
    }

}