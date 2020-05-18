package com.sapient.thread;

public class Tic extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print("Tic-");	
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
