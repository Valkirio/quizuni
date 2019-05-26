package br.com.quiz.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/index")
@Controller
public class HomeController {
	
	@GetMapping
	public ModelAndView index(HttpSession session) {
		ModelAndView model = new ModelAndView("index");
		session.removeAttribute("player");
		return model;
	}
	
}
