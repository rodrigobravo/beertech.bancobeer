package com.beertech.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beertech.banco.entity.ContaCorrente;
import com.beertech.banco.entity.Operacao;

@Repository
public interface OperacaoRepository extends JpaRepository<Operacao, Long> {
	
}
