package com.beertech.banco.controller;

import com.beertech.banco.controller.dto.ContaCorrenteDto;
import com.beertech.banco.controller.dto.TransferenciaDto;
import com.beertech.banco.entity.ContaCorrente;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.beertech.banco.controller.dto.OperacaoDto;
import com.beertech.banco.entity.Operacao;
import com.beertech.banco.service.BancoService;

import java.util.Date;

@RestController
@RequestMapping("/conta")
public class ContaController {
	
	@Autowired
	BancoService bancoService; 

    @PostMapping(value = "/operacao")
    public ResponseEntity<Operacao> salvaOperacao(@RequestBody OperacaoDto operacaoDto) {
    	Operacao operacao = bancoService.salvaOperacao(new Operacao(operacaoDto));
    	return ResponseEntity.ok(null);
    }

    @PostMapping(value = "/criacao", produces = "application/json")
    public ResponseEntity<ContaCorrente> criaContaCorrente(@RequestBody ContaCorrenteDto contaCorrenteDto) {

        ContaCorrente contaCorrente = bancoService.criaContaCorrente(new ContaCorrente(contaCorrenteDto));

        return ResponseEntity.ok(contaCorrente);
    }

    @GetMapping(value = "/saldo", produces = "application/json")
    public ResponseEntity<String> getDataSaldo(@RequestParam String hash) throws JSONException {
    	 String saldo = "{ \"saldo\":"+ bancoService.getSaldo(hash).toString() +"}";
        JSONObject respostaSaldo= new JSONObject(saldo);
        return ResponseEntity.ok(respostaSaldo.toString());
    }

    @PostMapping(value = "/transferencia", produces = "application/json")
    public ResponseEntity<String> transferencia(@RequestBody TransferenciaDto transferenciaDto) {

            bancoService.transferencia(transferenciaDto);

        return ResponseEntity.ok(null);
    }
}