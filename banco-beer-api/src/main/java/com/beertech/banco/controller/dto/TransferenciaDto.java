package com.beertech.banco.controller.dto;

import java.math.BigDecimal;

public class TransferenciaDto {

    private String hashOrigem;
    private String hashDestino;
    private BigDecimal valor;

    public String getHashOrigem() {
        return hashOrigem;
    }

    public void setHashOrigem(String hashOrigem) {
        this.hashOrigem = hashOrigem;
    }

    public String getHashDestino() {
        return hashDestino;
    }

    public void setHashDestino(String hashDestino) {
        this.hashDestino = hashDestino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
