package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.MsgService;

@RestController
@RequestMapping("/api")  // Keep this if you want all endpoints in this controller to start with /api
public class MsgRestController {
	
	@Autowired
	private MsgService msgService;
	
	@GetMapping("/welcome")  // This maps the /api/welcome endpoint to this method
	public String getMsg() {
		int i = 10;
		int j = 20;
		int age = 16;
		int k = 30;
		return msgService.getWelcomeMsg();
	}
	
}
