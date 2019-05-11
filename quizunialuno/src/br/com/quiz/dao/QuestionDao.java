package br.com.quiz.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.quiz.model.Alternative;
import br.com.quiz.model.Question;

@Repository
@Transactional
public class QuestionDao extends Dao {
	
	public Question save(Question q) {
		if(q.getId() == null) {
			manager.persist(q);
		}else {
			manager.merge(q);
		}
		
		for (Alternative a : q.getAlternatives()) {
			a.setQuestion(q);
			if(a.getId() == null) {				
				manager.persist(a);
			}else {
				manager.merge(a);
			}
		}
		return q;
	}
	
	public Question find(Long id){
		return manager.find(Question.class, id);
	}
	
	public List<Question> findAll(){
		return manager.createQuery("select q from Question q", Question.class).getResultList();
	}
	
	public void delete(Question q) {
		manager.remove(manager.merge(q));
	}
	
	public List<Question> findAllActives() {
		return manager.createQuery("select q from Question q where q.active = 1", Question.class).getResultList();
	}
	
	public boolean correction(Long idQuestion, Long idResponse) {
		
		Question q = manager.find(Question.class, idQuestion);
		
		for (Alternative a : q.getAlternatives()) {
			if(a.getId().equals(idResponse) && a.isCorrect()) {
				return true;
			}
		}
		
		return false;
	}

}
