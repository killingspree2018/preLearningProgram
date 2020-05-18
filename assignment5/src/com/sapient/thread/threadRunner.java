package com.sapient.thread;

public class threadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tic tic = new Tic();
		tic.start();
		tic.setPriority(10);
		Tok tok = new Tok();
		tok.start();
		
	}

}
