package com.beertech.banco.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.beertech.banco.controller.dto.OperacaoDto;
import com.beertech.banco.entity.Operacao;
import com.beertech.banco.service.BancoService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	BancoService bancoService; 

    @PostMapping(value = "/operacao")
    public ResponseEntity<Operacao> salvaOperacao(@RequestBody OperacaoDto operacaoDto) {
    	Operacao operacao = bancoService.salvaOperacao(new Operacao(operacaoDto));
    	return ResponseEntity.ok(operacao);
    }

    @GetMapping(value = "/saldo/")
    public ResponseEntity<BigDecimal> getDataSaldo() {
    	BigDecimal saldo = bancoService.getSaldo();
    	return ResponseEntity.ok(saldo);
    }
}