package com.example.springnginx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NgnixController {

	@GetMapping("/home")
	public String home()
	{
		return "Hello, World";
	}
}
