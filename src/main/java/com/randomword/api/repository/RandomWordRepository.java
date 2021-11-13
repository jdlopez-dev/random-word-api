package com.randomword.api.repository;

import com.randomword.api.model.RandomWord;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RandomWordRepository extends JpaRepository<RandomWord, Long> {

}