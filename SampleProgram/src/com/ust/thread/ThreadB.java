package com.ust.thread;


public class ThreadB extends Thread{
	

	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Diplaying Thread class B");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
