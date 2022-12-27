package com.ust.synchronization;

public class ThreadA extends Thread{
	
	SynchronizationExample s;
	
	ThreadA(SynchronizationExample s){
		this.s=s;
	}
	
	public void run() {
		
		s.display(5, "ThreadA");
	}

}
