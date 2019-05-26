package br.com.quiz.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quiz.dao.QuestionDao;
import br.com.quiz.dao.RankDao;
import br.com.quiz.model.Answer;
import br.com.quiz.model.Player;
import br.com.quiz.model.Question;
import br.com.quiz.model.Rank;

@Service
public class PlayService {

	private int points;
	final int numberQuestions = 10;
	final int hit = 10;
	private char[] sequence = {'A','B','C','D','E'};
	
	@Autowired
	QuestionDao dao;
	
	@Autowired
	RankDao rankDao;
	
	public List<Question> start() {
		List<Question> questions = dao.findAllActives();

		Collections.shuffle(questions);
		if(questions.size() > numberQuestions) {			
			for(int i=numberQuestions ; i<questions.size() ; i++ ) {
				questions.remove(i);
			}
		}
		
		questions.forEach(q -> {
			Collections.shuffle(q.getAlternatives());
			for(int i=0; i<sequence.length ; i++) {
				q.getAlternatives().get(i).setSequence(sequence[i]);
			}
		});
		
		return questions;
	}
	
	public int correction(List<Answer> answers, Player player) {
		points = 0;
		answers.stream().forEach(a -> {
			if(dao.correction(a.getQuestion(), a.getResponse())) {
				points += 10;
			}
		});
		rankDao.save(new Rank(player.getName(), player.getEmail(), points));
		
		return points;
	}
	
	public List<Rank> listRank(){
		return rankDao.findAll();
	}
	
}
