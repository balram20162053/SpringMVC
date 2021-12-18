package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;


@Controller
@RequestMapping("/")
public class Controller1 {
	
	@RequestMapping(value="hello", method= RequestMethod.GET)
	public String helloWorld(ModelMap model) {
		System.out.println();
		model.addAttribute("message","Hello from Spring MVC Framework");
		return "hello";
	}

}
