package com.assignment.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	public String generateReply(String message) {
		if(message == null) {
			return "I didn't underssatnd that.";
		}
		
		switch(message.toLowerCase()) {
		case "hi":
			return "Hello";
			
		case "bye":
			return "GoodBye";
			
		default:
			return "Sorry, I can only respond 'Hi' or 'Bye'.";
		}
		
	}

}
