package arj.spring.boot.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/api")
	public ResponseEntity<?> apiHome() {
		return ResponseEntity.ok("API Version 1.0");
	}
	
}
