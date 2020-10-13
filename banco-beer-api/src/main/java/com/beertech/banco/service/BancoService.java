package com.beertech.banco.service;

import java.math.BigDecimal;

import com.beertech.banco.controller.dto.TransferenciaDto;
import com.beertech.banco.entity.ContaCorrente;
import com.beertech.banco.entity.Operacao;

public interface BancoService {
	public Operacao salvaOperacao(Operacao operacao);
	public BigDecimal getSaldo(String hash);
	public ContaCorrente criaContaCorrente(ContaCorrente contaCorrente);
	public void transferencia(TransferenciaDto transferencia);
}
