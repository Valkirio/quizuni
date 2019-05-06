package br.com.quiz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.quiz.model.Answer;
import br.com.quiz.model.Player;
import br.com.quiz.model.Question;
import br.com.quiz.model.Rank;
import br.com.quiz.service.PlayService;

@Controller
@RequestMapping("/play")
public class PlayController {

	@Autowired
	PlayService play;
	
	@GetMapping
	public ModelAndView rank() {
		
		List<Rank> rank = play.listRank();
		ModelAndView model = new ModelAndView("play/rank");
		model.addObject("rank", rank);
		
		return model;
	}
	
	@PostMapping
	public ModelAndView go(Player player, HttpSession session) {
		
		session.setAttribute("player", player);
		
		List<Question> questions = play.start();
		ModelAndView model = new ModelAndView("play/play");
		model.addObject("size", questions.size());
		model.addObject("questions", questions); 

		return model;
	}
	
	@PostMapping("/finalize")
	public ModelAndView finalize(@RequestParam("responses") List<String> list, HttpSession session) {
		
		List<Answer> answers = new ArrayList<>();
		
		for (String s : list) {
			String[] x = s.split(",");
			Answer a = new Answer(Long.parseLong(x[0]), Long.parseLong(x[1]));
			answers.add(a);
		}
		
		Player player = (Player) session.getAttribute("player");
		
		int score = play.correction(answers, player);
		System.out.println(score);
		
		
		ModelAndView model = new ModelAndView("play/score");
		model.addObject("score", score);
		model.addObject("player", player);
		return model;
	}
	
}
