package com.beertech.banco.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.beertech.banco.controller.dto.OperacaoDto;

@Entity
public class Operacao {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private LocalDateTime dataHora;
	private BigDecimal valor;
	@Enumerated(EnumType.STRING)
	private TipoOperacao tipo;
	private String hash;
	
	public Operacao(BigDecimal valor, TipoOperacao tipo, String hash) {
		this.dataHora = LocalDateTime.now();
		this.valor = valor;
		this.tipo = tipo;
		this.hash = hash;

	}
	public Operacao() {

	}
	public Operacao(OperacaoDto operacaoDto) {
		this.dataHora = LocalDateTime.now();
		this.valor = operacaoDto.getValor();
		this.tipo = operacaoDto.getTipo();
		this.hash = operacaoDto.getHash();
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

	public String getHash() { return hash; }
}
