package com.beertecth.bancobeerconsumer.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OperacaoMessage {
	@JsonProperty(required=false,value="tipo")
	private String tipo;
	@JsonProperty(required=false,value="valor")
	private BigDecimal valor;

	@Override
	public String toString() {
		return "OperacaoMessage [tipo=" + tipo + ", valor=" + valor + "]";
	}

}
