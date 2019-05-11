package br.com.quiz.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.quiz.model.Rank;

@Repository
@Transactional
public class RankDao extends Dao {

	public void save (Rank rank) {
		if(rank.getId() == null) {
			manager.persist(rank);
		}else {
			manager.merge(rank);
		}
	}
	
	public List<Rank> findAll(){
		return manager.createQuery("select r from Rank r order by r.score desc").getResultList();
	}
}
