package com.beertech.banco.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.beertech.banco.entity.TipoOperacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beertech.banco.entity.Operacao;
import com.beertech.banco.repository.OperacaoRepository;
import com.beertech.banco.service.BancoService;

@Service
public class BancoServiceImpl implements BancoService {

    @Autowired
    OperacaoRepository operacaoRepository;

    @Override
    public Operacao salvaOperacao(Operacao operacao) {
        return operacaoRepository.save(operacao);
    }

    @Override
    public BigDecimal getSaldo() {
        List<Operacao> listagem = operacaoRepository.findAll();
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

}
