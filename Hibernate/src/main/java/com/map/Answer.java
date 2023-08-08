package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answerName;
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answerId, String answerName) {
		super();
		this.answerId = answerId;
		this.answerName = answerName;
	}
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answerName=" + answerName + "]";
	}
	
	
	

}
