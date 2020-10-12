package com.beertech.banco.entity;

import com.beertech.banco.controller.dto.ContaCorrenteDto;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContaCorrente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private int hash;
	
	private BigDecimal saldo;
	
	public ContaCorrente(BigDecimal valor, TipoOperacao tipo) {

		this.saldo = new BigDecimal(0);
		this.hash = Instant.now().hashCode();	}
	public ContaCorrente() {
		this.hash = Instant.now().hashCode();
		this.saldo = new BigDecimal(0);
	}

	public ContaCorrente(ContaCorrenteDto contaCorrente) {
		this.hash = Instant.now().hashCode();
		this.saldo = contaCorrente.getSaldo();
	}

	public long getId() {
		return id;
	}

	public int getHash() { return hash; }
	
	public void atualizaSaldo(TipoOperacao tipo, BigDecimal valor) {
		if(tipo.equals(TipoOperacao.DEPOSITO)) {
			this.saldo.add(valor);
		} else {
			this.saldo.subtract(valor);
		}
	}	
}
