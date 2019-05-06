package br.com.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/index")
@Controller
public class HomeController {
	
	@GetMapping
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
}
