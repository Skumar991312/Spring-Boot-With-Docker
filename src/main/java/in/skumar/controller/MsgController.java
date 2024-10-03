package in.skumar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@GetMapping("/welcome")
	public String getMsgWelcome() {
		
		return "Hello How Can Help You";
	}

}
