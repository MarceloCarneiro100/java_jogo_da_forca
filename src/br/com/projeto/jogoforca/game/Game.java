package br.com.projeto.jogoforca.game;

import br.com.projeto.jogoforca.core.Dictionary;
import br.com.projeto.jogoforca.core.Word;

public class Game {

	public void start() {
		Dictionary dictionary = new Dictionary();
		Word word = dictionary.nextWord();
		
		System.out.println(word.getOriginalWord());
	}
}
