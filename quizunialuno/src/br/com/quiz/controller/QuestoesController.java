package br.com.quiz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.quiz.dao.QuestoesDao;
import br.com.quiz.model.Questoes;
import br.com.quiz.validator.QuestoesValidation;

@RequestMapping("/questoes")
@Controller
public class QuestoesController {
	
	@Autowired
	private QuestoesDao questoesDao;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators( new QuestoesValidation());
	}

	@GetMapping("/form")
	public ModelAndView form(Questoes questoes) {
		ModelAndView model = new ModelAndView("questoes/form");
		model.addObject("questoes", questoes);
		return model;
	}
	
	@PostMapping("/form")
	public ModelAndView create( @Valid Questoes questoes, BindingResult result, RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
			return form(questoes);
		}
		
		questoesDao.create(questoes);
		redirectAttributes.addFlashAttribute("sucesso", "Cadastrado com sucesso!");
		
		return new ModelAndView("redirect:/questoes/form");
	}
	
	@GetMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") Long id) {
		return form(questoesDao.findOne(id));
	}
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("questoes/list");
		model.addObject("listaDeQuestoes", questoesDao.findAll());
		return model;
	}
}
