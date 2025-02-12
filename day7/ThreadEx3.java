package com.celcom.day7;


class MyThread implements Runnable{
public void run() {
	for(int i = 1; i<=5;i++) {
		System.out.println("My threading running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}
}


}

public class ThreadEx3 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread2() );
		System.out.println(t1.getState());
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		t1.start();// running my thread 
		Thread.sleep(3000);
		System.out.println("Main End");
		t1.suspend();
		System.out.println(t1.getState());
		t1.resume();

		
	}

}

