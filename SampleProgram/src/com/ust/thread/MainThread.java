package com.ust.thread;

public class MainThread {

	public static void main(String[] args) {
		
		ThreadA a= new ThreadA();
		ThreadB b= new ThreadB();
		a.start();
		b.start();
		
		//new ThreadA(a->a.start());
		
		new Thread(() -> { 
	         for(int i=1; i <= 5; i++) {
	            System.out.println("Child Thread: "+ i);
	            try {
	               Thread.sleep(500);
	            } catch(Exception e) {
	               e.printStackTrace();
	            }
	         }
	      }).start();
	      
	      for(int j=1; j < 5; j++) {
	         System.out.println("Main Thread: "+ j);
	         try {
	            Thread.sleep(500);
	         } catch(Exception e) {
	            e.printStackTrace();
	         }
	      }
	   

	}

}
