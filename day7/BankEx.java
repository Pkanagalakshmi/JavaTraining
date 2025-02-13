package com.celcom.day7;

import java.util.Scanner;

class SavingAccount{
	private long balanceAccount;
	void deposit(long amount) {
		this.balanceAccount=this.balanceAccount+amount;
	}

void withDraw(long amount) {
	this.balanceAccount=this.balanceAccount-amount;
}
long getBalanceAmount() {
	return this.balanceAccount;
}

}
class WithDrawer extends Thread{
	SavingAccount savingAccount;
	
	WithDrawer(	SavingAccount savingAccount){
		this.savingAccount=savingAccount;
	}
	public void run() {
		synchronized (savingAccount) {
			System.out.println("WithDrawer is waiting for Depositer to deposit money");
		
		System.out.println("Enter the amount :");
		long amount =new Scanner(System.in).nextLong();
		savingAccount.withDraw(amount);
		System.out.println(amount + "withDraw Successfully");
		System.out.println("Balance : " +savingAccount.getBalanceAmount());
		}
	}
	
}
class Depositer extends Thread{
	SavingAccount savingAccount;
	
	Depositer(SavingAccount savingAccount){
		this.savingAccount=savingAccount;
	}
	public void run() {
		synchronized (savingAccount) {
		System.out.println("Despoisrer started to deposit a money:");
		System.out.println("Enter the amount :");
		long amount =new Scanner(System.in).nextLong();
		savingAccount.deposit(amount);
		System.out.println(amount +"Desposited amount");
		System.out.println("Balance : "+savingAccount.getBalanceAmount());
		savingAccount.notify();
		}
	}
	
}
public class BankEx {
public static void main(String[] args) throws InterruptedException {
	SavingAccount sa = new SavingAccount();
	WithDrawer wd = new WithDrawer(sa);
	wd.start();
	Thread.sleep(2000);
	Depositer de =new Depositer(sa);
	de.start();
	
}
}
