package com.celcom.day7;




public class InnnerClasssEx {
	
	//Non static innerClass
	class InnerClass1{
		void MyMethod1(){
			System.out.println("Non-Static Inner class");
		}
	}
	
	
	// static innerClass
	static class InnerClass2{
			void MyMethod2(){
				System.out.println("Static Inner class");
			}
		}
	
	void MyMethod() {
		//3.local inner class
		class Innerclass3{
		void MyMethod3() {
			System.out.println("Local Inner class");
		}
		}
		Innerclass3 obj3 = new Innerclass3();
		obj3.MyMethod3();
	}

	public static void main(String[] args) {
		InnnerClasssEx e = new InnnerClasssEx();
		InnerClass1  i = e.new InnerClass1();
		i.MyMethod1();
		InnnerClasssEx.InnerClass2 obj = new InnnerClasssEx.InnerClass2();
		obj.MyMethod2();
		

	}

}
