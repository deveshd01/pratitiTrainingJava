package com.pratiti.component;

import org.springframework.stereotype.Component;

@Component("spCheck")
public class SpellChecker {
	
	public void checkSpellingMistakes(String document) {
		System.out.println("function called spell checker");
		
	}

}
