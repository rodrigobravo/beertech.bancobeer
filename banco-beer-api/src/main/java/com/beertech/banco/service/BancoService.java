package com.beertech.banco.service;

import java.math.BigDecimal;

import com.beertech.banco.entity.Operacao;

public interface BancoService {
	public Operacao salvaOperacao(Operacao operacao);
	public BigDecimal getSaldo();
}
