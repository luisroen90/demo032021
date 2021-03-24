package com.roen.demos.app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roen.demos.app.dao.PalindromeDao;
import com.roen.demos.app.repository.PalindromeRepository;
import com.roen.demos.app.services.IPalindromeService;

@Service
public class PalindromeService implements IPalindromeService {

	@Autowired
	private PalindromeRepository repository;

	@Override
	public String getLongest(String toFind) {

		PalindromeDao palindrome = new PalindromeDao();
		palindrome.setToFind(toFind);

		int start = 0, end = 0;

		for (int i = 0; i < toFind.length(); i++) {

			int maxL = Math.max(findLength(toFind, i, i), findLength(toFind, i, i + 1));

			if (maxL > end) {
				end = maxL;
				start = i - ((maxL - 1) / 2);
			}

		}

		palindrome.setLongestPalindrome(toFind.substring(start, (start + end)));
		repository.saveAndFlush(palindrome);
		return palindrome.getLongestPalindrome();
	}

	private int findLength(String toFind, int toL, int toR) {

		while ((toL >= 0) && (toR < toFind.length()) && (toFind.charAt(toL) == toFind.charAt(toR))) {
			toL--;
			toR++;
		}

		return toR - toL - 1;
	}

}
