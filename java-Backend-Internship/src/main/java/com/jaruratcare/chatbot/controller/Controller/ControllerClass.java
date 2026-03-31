package com.jaruratcare.chatbot.controller.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class ControllerClass {
	private static final Logger log = LoggerFactory.getLogger(ControllerClass.class);
	@PostMapping
	public Map<String,String> receiveMessage(@RequestBody Map<String, String> payload){
		
		if (payload == null || !payload.containsKey("message")) {
			return Map.of("reply", "Invalid request");
		}
		
		String userMessage = payload.get("message");
		
		log.info("Incoming message: {}", userMessage);
		
		String reply = getReply(userMessage);
		
		return Map.of("reply", reply);
	}
	
	private String getReply(String msg) {
		
		if (msg == null || msg.trim().isEmpty()) {
			return "Invalid message";
		}
		msg = msg.trim().toLowerCase();
		
		switch (msg) {
			case "hi":
				return "Hello";
			case "bye":
				return "Goodbye";
			default:
				return "Sorry, I didn't understand that";
		}
	}
	
	
	
}
