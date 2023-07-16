package com.devesh.webSockets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.devesh.webSockets.controller.model.Message;

@Controller
public class ChatController {

	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

	@MessageMapping("/message") 			// /app/message
	@SendTo("/chatroom/public")						// send received msg to all those who subscribed this URL
	private Message receivePublicMessage(@Payload Message message) {
		System.out.println("---------------------->message 1 = " + message);
		return message;
	}

	@MessageMapping("/private-message")
	public Message receivePrivateMessage(@Payload Message message) {
		simpMessagingTemplate.convertAndSendToUser(message.getReceiverName(), "/private", message); // /user/devesh/private

		System.out.println("---------------------->message 2 = " + message);

		return message;
	}

}
