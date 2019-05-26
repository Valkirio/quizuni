package br.com.quiz.model;

import org.springframework.stereotype.Component;

@Component
public class Answer {

	private Long question;
	private Long response;

	public Answer() {
		super();
	}

	public Answer(Long question, Long response) {
		super();
		this.question = question;
		this.response = response;
	}

	public Long getQuestion() {
		return question;
	}

	public void setQuestion(Long question) {
		this.question = question;
	}

	public Long getResponse() {
		return response;
	}

	public void setResponse(Long response) {
		this.response = response;
	}

}
