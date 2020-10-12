package com.beertech.banco.controller.dto;

import java.math.BigDecimal;

public class ContaCorrenteDto {
    private Long id;
    private BigDecimal saldo;
    private Integer hash;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Integer getHash() {
        return hash;
    }

    public void setHash(Integer hash) {
        this.hash = hash;
    }



}
