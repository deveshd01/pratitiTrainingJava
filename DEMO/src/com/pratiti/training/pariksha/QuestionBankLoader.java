package com.pratiti.training.pariksha;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {

	public List<Question> loadQuestionsOnJava() {
		QuestionBank qb = new QuestionBank();
		
		qb.addNewSubject("Java");
		
		//first question
		Question q = new Question("Which method is used for displaying output on the console?"); 
		List<Option> ops = new ArrayList<>();
		ops.add(new Option("Console.Writeline", false));
		ops.add(new Option("System.out.println", true));
		ops.add(new Option("System.write", false));
		ops.add(new Option("Console.write", false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);

		//second question
		q = new Question("What is the fullform of JVM?"); 
		ops = new ArrayList<>();
		ops.add(new Option("Java Virtual Machine", true));
		ops.add(new Option("Java Viral Machine", false));
		ops.add(new Option("Java Volatile Machine", false));
		ops.add(new Option("None of the above", false));
		q.setOptions(ops);
		qb.addNewQuestion("Java", q);

		return qb.getQuestionsFor("Java");
	}
}




