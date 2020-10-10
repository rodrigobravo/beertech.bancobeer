package com.beertech.banco.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operacao {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private LocalDateTime dataHora;
	private BigDecimal valor;
	private TipoOperacao tipo;
	
	public Operacao(BigDecimal valor, TipoOperacao tipo) {
		this.dataHora = LocalDateTime.now();
		this.valor = valor;
		this.tipo = tipo;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public TipoOperacao getTipo() {
		return tipo;
	}

}
