package com.celcom.day7;

public class ThreadAnonymousEx {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				for(int i =1;i<=5;i++) {
//					System.out.println("Thread t1 is running....");
					System.out.println(i + " * 2 = "+(i * 2));
					try{
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
					}
					}
				}
				
		};
	
	Thread t1 = new Thread(runnable);
	t1.start();
	Runnable runnable1 =() ->{
		for(int i = 1 ;i<=10;i++) {
			System.err.println(i + " * 5 = "+(i * 5));
			try {
				Thread.sleep(2000);
			}catch( InterruptedException e) {
				
			}
		}
	};
	Thread t2 = new Thread(runnable1);
	t2.start();
	
	
}}

