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
	@GetMapping("/{name}")
	public String hello(@PathVariable String name)
	{
		return "Welcome "+name+"!";
	}
	@GetMapping("/{col}")
	public String MyFavCol(@PathVariable String col)
	{
		return "My  Favorite color is "+col;
	}
}
