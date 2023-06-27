package com.kevinlucido.hellohuman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name, @RequestParam(value="last_name", required=false) String lastName) {
		if (name == null) {
			name = "Human";
		}
		if (lastName != null) {
			return "Hello " + name + " " + lastName;
		}
//		NINJA BONUS 2
//		if (String.format(multiply, null) == null) {
//			String repeated = "Hello " + name;
//			return repeated.repeat(multiply);
//		}
		return "Hello " + name;
	}
}
