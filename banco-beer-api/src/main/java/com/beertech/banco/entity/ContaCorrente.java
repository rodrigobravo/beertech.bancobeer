package com.beertech.banco.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ContaCorrente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private BigDecimal saldo;
	
	public ContaCorrente(BigDecimal valor, TipoOperacao tipo) {
		this.saldo = new BigDecimal(0);
	}

	public long getId() {
		return id;
	}
	
	public void atualizaSaldo(TipoOperacao tipo, BigDecimal valor) {
		if(tipo.equals(TipoOperacao.DEPOSITO)) {
			this.saldo.add(valor);
		} else {
			this.saldo.subtract(valor);
		}
	}	
}
