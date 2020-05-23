package com.sapient.thread;

public class Tok extends Thread{
	
	Game ob;
	
	public Tok(Game ob) {
		super();
		this.ob = ob;
	}
	public Tok() {
		super();
	}

	public void run() {
		for(int i=0;i<10;i++) {
			ob.printTok();	
			if(i==0) {
				try {
					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
