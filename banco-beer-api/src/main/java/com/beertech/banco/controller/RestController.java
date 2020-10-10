package com.beertech.banco.controller;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.beertech.banco.controller.dto.OperacaoDto;
import com.beertech.banco.entity.ContaCorrente;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping(value = "/operacao")
    public ResponseEntity<ContaCorrente> salvaOperacao(@RequestBody OperacaoDto operacao) {
    	return null;    	
    }

    @GetMapping(value = "/saldo/")
    public ResponseEntity<BigDecimal> getDataSaldo() {
    	return null;
    }
}