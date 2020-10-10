package com.beertecth.bancobeerconsumer.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OperacaoMessage {

  private String tipo;
  private BigDecimal valor;

}
