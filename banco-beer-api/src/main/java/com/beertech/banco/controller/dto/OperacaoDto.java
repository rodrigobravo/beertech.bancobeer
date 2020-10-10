package com.beertech.banco.controller.dto;

import java.math.BigDecimal;

import com.beertech.banco.entity.TipoOperacao;

public class OperacaoDto {

	private BigDecimal valor;
	private TipoOperacao tipo;
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoOperacao getTipo() {
		return tipo;
	}
	public void setTipo(TipoOperacao tipo) {
		this.tipo = tipo;
	}
	
	
}
