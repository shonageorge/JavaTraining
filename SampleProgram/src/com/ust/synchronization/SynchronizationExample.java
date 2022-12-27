package com.ust.synchronization;

public class SynchronizationExample {
	
public synchronized void display(int n, String s) {
		// synchronixed block
	// synchronized(this) {
		for(int i=0;i<3;i++) {
			System.out.println(s+" "+n*i);
		}
	//	}
	}

}
