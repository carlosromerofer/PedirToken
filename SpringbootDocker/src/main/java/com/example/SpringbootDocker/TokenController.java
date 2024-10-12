package com.example.SpringbootDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {
	
	
	@GetMapping("/get-token")
	public String getToken() {

		return "container-is-up";
	}

}
