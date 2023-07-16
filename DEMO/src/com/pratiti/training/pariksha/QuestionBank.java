package com.pratiti.training.pariksha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {

	private Map<String, List<Question>> questionBank = new HashMap<>();
	
	/*private List<Question> questionsOnJava;

	private List<Question> questionsOnPython;
	
	private List<Question> questionsOnJavaScript;*/
	
	public void addNewSubject(String subject) {
		questionBank.put(subject, new ArrayList<>());
	}
	
	public void addNewQuestion(String subject, Question question) {
		List<Question> list = questionBank.get(subject);
		list.add(question);
	}

	public List<Question> getQuestionsFor(String subject) {
		return questionBank.get(subject);
	}

}
