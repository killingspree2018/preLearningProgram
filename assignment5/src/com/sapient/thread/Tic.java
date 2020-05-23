package com.sapient.thread;

public class Tic extends Thread{
	Game ob;
	
	public Tic(Game ob) {
		super();
		this.ob = ob;
	}
	public Tic() {
		super();
	}

	public void run() {
		for(int i=0;i<10;i++) {
			ob.printTic();	
		}
	}

}
