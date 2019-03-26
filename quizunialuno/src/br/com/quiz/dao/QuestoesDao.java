package br.com.quiz.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.quiz.model.Questoes;

@Repository
@Transactional
public class QuestoesDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void create(Questoes c) {
		if(c.getId() == null) {
			manager.persist(c);
		}else {
			manager.merge(c);
		}	
	}
	
	public Questoes findOne(Long id) {
		return manager.find(Questoes.class, id);
	}
	
	public List<Questoes> findAll(){
		return manager.createQuery("select p from Questoes p order by p.id asc", Questoes.class).getResultList();
	}
		
	public Iterable<Questoes> findListIterable(){
		return this.findAll();
	}
	
	public void delete(Questoes c) {
		manager.remove(manager.merge(c));
	}	

}
