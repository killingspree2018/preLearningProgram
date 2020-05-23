package com.sapient.thread;

public class Game {
	synchronized void printTic() {
		notify();
		System.out.print("Tic - ");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	synchronized void printTok() {
		notify();
		System.out.println("Toc");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
