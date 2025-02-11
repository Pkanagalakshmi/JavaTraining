package com.celcom.day6;

public class GarbageCollectionEx {
	
	static int count;
	GarbageCollectionEx(){
		count++;
		System.out.println(count);
	}
	protected void finalize() {
		count--;
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		GarbageCollectionEx obj1= new GarbageCollectionEx();
		GarbageCollectionEx obj2= new GarbageCollectionEx();
		obj1=null;
		System.gc();
		obj2=null;
		Runtime.getRuntime();
	}

}
