package com.beertech.banco.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.beertech.banco.controller.dto.TransferenciaDto;
import com.beertech.banco.entity.ContaCorrente;
import com.beertech.banco.entity.TipoOperacao;
import com.beertech.banco.repository.ContaCorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beertech.banco.entity.Operacao;
import com.beertech.banco.repository.OperacaoRepository;
import com.beertech.banco.service.BancoService;

@Service
public class BancoServiceImpl implements BancoService {

    @Autowired
    OperacaoRepository operacaoRepository;

    @Autowired
    ContaCorrenteRepository contaCorrenteRepository;

    @Override
    public Operacao salvaOperacao(Operacao operacao) {
        return operacaoRepository.save(operacao);
    }

    @Override
    public BigDecimal getSaldo(String hash) {
        List<Operacao> listagem = operacaoRepository.findByHash(hash);
        BigDecimal resultadoSaldo = new BigDecimal(0);
        for (Operacao operacao : listagem) {
            if (operacao.getTipo().equals(TipoOperacao.DEPOSITO)) {
                resultadoSaldo = resultadoSaldo.add(operacao.getValor());
            } else {
                resultadoSaldo = resultadoSaldo.subtract(operacao.getValor());
            }
        }

        return resultadoSaldo;
    }

    @Override
    public ContaCorrente criaContaCorrente(ContaCorrente contaCorrente) {

        return contaCorrenteRepository.save(contaCorrente);
    }

    @Override
    public void transferencia(TransferenciaDto transferencia) {

        Operacao operacaoSaida = new Operacao(transferencia.getValor(), TipoOperacao.SAQUE, transferencia.getHashOrigem());
        Operacao operacaoEntrada = new Operacao(transferencia.getValor(), TipoOperacao.DEPOSITO, transferencia.getHashDestino());
        operacaoRepository.save(operacaoSaida);
        operacaoRepository.save(operacaoEntrada);



    }

}
