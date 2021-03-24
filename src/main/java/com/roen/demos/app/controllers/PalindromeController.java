package com.roen.demos.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roen.demos.app.services.IPalindromeService;

@RestController
@RequestMapping("/palindromes")
public class PalindromeController {

	@Autowired
	private IPalindromeService service;
	
	@GetMapping("/getLongest")
	public String getLongesPalindrom(@RequestParam(name = "toFind") String toFind) {
		return service.getLongest(toFind);
	}
	
}
