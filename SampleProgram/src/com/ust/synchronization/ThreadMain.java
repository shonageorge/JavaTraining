package com.ust.synchronization;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		SynchronizationExample s= new SynchronizationExample();
		ThreadA a= new ThreadA(s);
		ThreadB b= new ThreadB(s);
		
		a.start();
		b.start();
		
	}

}
