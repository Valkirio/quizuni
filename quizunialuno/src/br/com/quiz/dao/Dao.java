package br.com.quiz.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Dao {
	
	@PersistenceContext
	protected EntityManager manager;
}
