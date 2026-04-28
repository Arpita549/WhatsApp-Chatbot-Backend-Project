package com.assignment.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.chatbot.dto.MessageRequest;
import com.assignment.chatbot.dto.MessageResponse;
import com.assignment.chatbot.service.MessageService;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

	@Autowired
	private MessageService messageService;
	
	@PostMapping
	public MessageResponse receiveMessage(@RequestBody MessageRequest request) {
		System.out.println("from: "+ request.getFrom());
		System.out.println("message: "+ request.getMessage());
		
		String reply = messageService.generateReply(request.getMessage());
		
		return new MessageResponse(reply);
	}
}
