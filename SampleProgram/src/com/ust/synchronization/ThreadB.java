package com.ust.synchronization;

public class ThreadB extends Thread{
	
	SynchronizationExample s;	
	
	ThreadB(SynchronizationExample s){
		this.s=s;
	}
	
	public void run() {
		s.display(11,"ThreadB");
	}
	

}
