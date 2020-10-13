package com.beertecth.bancobeerconsumer.listener;

import com.beertecth.bancobeerconsumer.client.ContaClient;
import com.beertecth.bancobeerconsumer.config.RabbitConfig;
import com.beertecth.bancobeerconsumer.model.OperacaoMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContaListener {

	@Autowired
	ContaClient client;

	@RabbitListener(queues = RabbitConfig.QUEUE)
	public void consumer(Message message) throws JsonProcessingException {

		ObjectMapper objectMapper = new ObjectMapper();

		String json = new String(message.getBody());
		if (json.contains("hashOrigem")){
			OperacaoMessage operacaoMessage = objectMapper.readValue(json, OperacaoMessage.class);
			client.sendTransferOperation(operacaoMessage);
		}else{
			OperacaoMessage operacaoMessage = objectMapper.readValue(json, OperacaoMessage.class);
			client.sendOperation(operacaoMessage);
		}

	}
}