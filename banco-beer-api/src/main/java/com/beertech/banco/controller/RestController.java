package com.beertech.banco.controller;


import com.beertech.banco.entity.ContaCorrente;
import com.beertech.banco.entity.TipoOperacao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class RestController {

    @PutMapping(value = "/operacao")
    public ContaCorrente putDataOperacao(@RequestParam(value = "tipo")TipoOperacao tipo,
                                         @RequestParam(value = "valor")BigDecimal valor){
    return new ContaCorrente(valor, tipo);
    }


    @PutMapping(value = "/saldo/")
    public void putDataSaldo(){

    }

    @GetMapping(value = "/saldo/")
    public void getDataSaldo(){

    }



}