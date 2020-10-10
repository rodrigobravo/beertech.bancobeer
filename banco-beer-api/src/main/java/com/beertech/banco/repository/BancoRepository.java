package com.beertech.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beertech.banco.entity.ContaCorrente;

public interface BancoRepository extends JpaRepository<ContaCorrente, Long> {
	
}
