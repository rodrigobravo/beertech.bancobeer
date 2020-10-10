package com.beertecth.bancobeerconsumer.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.beertecth.bancobeerconsumer.model.OperacaoMessage;

@Service
public class ContaClient {

	@Value("${banco.url}")
	private String bancoUrl;
	
	@Autowired
	RestTemplate restTemplate;

	public void sendOperation(OperacaoMessage message) {
		HttpEntity<OperacaoMessage> request = new HttpEntity<>(message);
		restTemplate.exchange(bancoUrl, HttpMethod.POST, request, OperacaoMessage.class);
	}
}
