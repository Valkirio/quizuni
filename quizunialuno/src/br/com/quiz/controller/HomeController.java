package br.com.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class HomeController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	

}
