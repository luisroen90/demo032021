package com.roen.demos.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roen.demos.app.dao.PalindromeDao;

public interface PalindromeRepository extends JpaRepository<PalindromeDao, Integer>{

}
