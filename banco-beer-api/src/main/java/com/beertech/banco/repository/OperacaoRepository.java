package com.beertech.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beertech.banco.entity.ContaCorrente;
import com.beertech.banco.entity.Operacao;

public interface OperacaoRepository extends JpaRepository<Operacao, Long> {
	
}
