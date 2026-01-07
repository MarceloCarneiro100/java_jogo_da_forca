package br.com.projeto.jogoforca.game;

import br.com.projeto.jogoforca.core.Dictionary;

public class Game {

	public void start() {
		
		// Singleton pattern : only one instance exists in the application
		Dictionary d1 = Dictionary.getInstance();
		Dictionary d2 = Dictionary.getInstance();
		
		System.out.println(d1);
		System.out.println(d2);
		
	}
}
