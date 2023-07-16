package com.pratiti.training.pariksha;

import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		QuestionBankLoader qbLoader = new QuestionBankLoader();
		List<Question> questions = qbLoader.loadQuestionsOnJava();
		
		System.out.println("Welcome to Pariksha 1.0");
		System.out.println("All the Best!\n\n");
		
		int score = 0;
		for(Question question : questions) {
			System.out.println("Q. " + question.getQuestion());
			int index = 1;
			for(Option option : question.getOptions()) {
				System.out.println(index++ + ". " + option.getOption());
			}
			System.out.println("Enter the right answer");
			int ans = sc.nextInt();
			Option selectedOption = question.getOptions().get(ans-1);
			if(selectedOption.isRightAnswer())
				score ++;
		}
		
		System.out.println("\n\nEnd of Exam!!");
		System.out.println("Your score is " + score);
	}
}
