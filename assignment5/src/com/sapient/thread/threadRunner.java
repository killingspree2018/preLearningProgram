package com.sapient.thread;

public class threadRunner {

	public static void main(String[] args) {
		
		Game ob = new Game();
		Tic tic = new Tic(ob);
		tic.start();
		Tok tok = new Tok(ob);
		tok.start();
		
	}

}
