package com.randomword.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RandomWordApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomWordApplication.class, args);
	}

	@GetMapping("/")
	public String randomWord() {
		return "random-word";
	}

	@GetMapping("/word")
	public String randomWord(@RequestParam(value = "length", defaultValue = "10") int length) {
		return getRandomWord(length);
	}

	private String getRandomWord(int length) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			sb.append((char) (Math.random() * 26 + 'a'));
		}
		return sb.toString();
	}
}
