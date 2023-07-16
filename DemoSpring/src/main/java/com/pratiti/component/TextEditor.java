package com.pratiti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("textE")
public class TextEditor {

	@Autowired		//DI
	private SpellChecker sp;
//	no need of ApplicationContext  &  getBeans
	
	public void load(String document) {
		System.out.println("Loading text Editor....");
		sp.checkSpellingMistakes(document);
	}
}
