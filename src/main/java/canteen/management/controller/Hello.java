package canteen.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/canteen")
public class Hello {
	
	@GetMapping("/hello")
	public String HEllo() {
		return "Hello From Canteen Service";
	}

}
