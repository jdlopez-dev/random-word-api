package com.randomword.api.service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.randomword.api.model.RandomWord;
import com.randomword.api.repository.RandomWordRepository;

@Service
public class RandomWordService {

    @Autowired
    private RandomWordRepository randomWordRepository;
    private Random rand;

    RandomWordService() throws NoSuchAlgorithmException {
        this.rand = SecureRandom.getInstanceStrong();
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

    public RandomWord randomWord() {
        ArrayList<String> words = new ArrayList<>();
        words.add("bitcoin");
        words.add("ethereum");
        words.add("ripple");
        words.add("litecoin");
        words.add("monero");
        words.add("dash");

        String word = words.get((rand.nextInt(words.size())));

        return new RandomWord(word);
    }

}