package com.celcom.day7;

 class TwoTable1 extends Thread{@Override
		public void run() {
			for(int i =1;i<=10;i++) {
				System.out.println(i +"* 2 ="+(i*2));
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					
				}
			}
		}
		
	}
	

 class  FiveTable1 implements Runnable{@Override
		public void run() {
			for(int i =1;i<=10;i++) {
				System.err.println(i +"* 5 ="+(i*2));
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					
				}
			}
		}
		
	}


public class ThreadTable {
	public static void main(String[] args) throws InterruptedException {
		TwoTable1 two = new TwoTable1();
		
		Thread five = new Thread(new FiveTable1() );
		two.start();

		System.out.println("Main 1");
		
		two.join();
		five.start();
		
		System.out.println("Main");
	}

}
