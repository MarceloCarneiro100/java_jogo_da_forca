package br.com.projeto.jogoforca.game;

import br.com.projeto.jogoforca.core.Word;

public class Game {

	public void start() {
		Word word = new Word("casa");
		word.hasChar('a');
		word.hasChar('s');
		word.hasChar('c');

		System.out.println(word);
		System.out.println(word.discovered());
	}
}
