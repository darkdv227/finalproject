package kr.co.jhta.erp.web.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home.hta")
	public String home() {
		
		return "home";
	}
}
