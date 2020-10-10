package com.beertech.banco.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beertech.banco.entity.Operacao;
import com.beertech.banco.repository.OperacaoRepository;
import com.beertech.banco.service.BancoService;

@Service
public class BancoServiceImpl implements BancoService {
	
	@Autowired
	OperacaoRepository operacaoRepository;
	
	@Override
	public Operacao salvaOperacao(Operacao operacao) {
		return operacaoRepository.save(operacao);		
	}

	@Override
	public BigDecimal getSaldo() {		
		return null;
	}

}
