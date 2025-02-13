package com.celcom.day7;

class MyThread2 implements Runnable{
public void run() {
	for(int i = 1; i<=5;i++) {
		System.out.println( Thread.currentThread().getName()+"threading running");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}
}

public void start() {
	// TODO Auto-generated method stub
	
}

public void setName(String string) {
	// TODO Auto-generated method stub
	
}

public char[] getName() {
	// TODO Auto-generated method stub
	return null;
}

public char[] getPriority() {
	// TODO Auto-generated method stub
	return null;
}

public char[] getState() {
	// TODO Auto-generated method stub
	return null;
}



}

public class ThreadExNew {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread1());
		t1.setName("t1");
		Thread t2 = new Thread(new MyThread1());
		t1.setName("t2");
		t1.start();
		t2.start();
		
	}

}
