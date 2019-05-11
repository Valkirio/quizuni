package br.com.quiz.controller;

import java.util.Collections;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import br.com.quiz.dao.QuestionDao;
import br.com.quiz.model.Alternative;
import br.com.quiz.model.Question;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionDao dao;

	@GetMapping("/create")
	public ModelAndView create() {

		ModelAndView model = new ModelAndView("question/create");
		
		Question q = new Question();
		for (int i=0 ; i<5 ; i++) {			
			Alternative a = new Alternative();
			q.getAlternatives().add(a);
		}
		
		model.addObject("question", q);
	
		return model;
	}
	
	@PostMapping("/create")
	public ModelAndView create(@Valid Question q) {
		
		dao.save(q);
		
		return new ModelAndView("redirect:/question/create");
	}
	
	@GetMapping("/{id}")
	public void get(@PathVariable Long id) {
		Question q = dao.find(id);
		
		System.out.println("\n\nAlternativas na ordem original");
		for (Alternative a : q.getAlternatives()) {
			System.out.println(a.getDescription());
		}
		
		Collections.shuffle(q.getAlternatives());
		System.out.println("\n\nAlternativas embaralhadas");
		for (Alternative a : q.getAlternatives()) {
			System.out.println(a.getDescription());
		}
		
	}
}
