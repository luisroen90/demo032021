package com.roen.demos.app.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IPalindromeServiceTest {

	private static List<String> toFind;

	@Autowired
	private IPalindromeService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		toFind = Stream.of("anitalavalatina","abbc","acb").collect(Collectors.toList());
	}

	@Test
	void test() {
		
		toFind.forEach(s->System.out.println("Palindrome: " + service.getLongest(s)));
		
		
	}

}
