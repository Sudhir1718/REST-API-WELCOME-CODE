package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class a1 {
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome ";
	}
}
