package com.example.fruit_back.chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

	@GetMapping("/test")
	public String testPath() {
		return "test 성공";
	}
}
