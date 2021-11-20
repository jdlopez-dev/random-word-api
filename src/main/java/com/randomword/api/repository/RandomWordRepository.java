package com.randomword.api.repository;

import com.randomword.api.model.RandomWord;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RandomWordRepository extends JpaRepository<RandomWord, Long> {

}