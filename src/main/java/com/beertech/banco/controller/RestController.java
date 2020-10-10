package com.beertech.banco.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class RestController {

    @PutMapping(value = "/operacao/{tipo}/{valor}")
    public void putDataOperacao(){

    }


    @PutMapping(value = "/saldo/")
    public void putDataSaldo(){

    }



}