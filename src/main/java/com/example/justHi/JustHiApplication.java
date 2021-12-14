package com.example.justHi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JustHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustHiApplication.class, args);
	}
	
	@GetMapping("/{name}")
   public String getName(@PathVariable String name) {
		String str = "hi " + name + "!!,, just say HIII";
		return str;
		
	}
}
