package com.celcom.day5e;

interface OneNew{
int a =10;//public,static,final
}
interface Two{
	int b = 20;
}
interface Three extends OneNew,Two{
	void addition();
}
class addition implements Three{
	addition(int a,int b){
		a=One.a;
		b=Two.b;
	}
	public void addition(){
		System.out.println(a+b);
	}
	
	
	
}
public class MultipleInterfaceExOne {
	public static void main(String[] args) {
		Three add= new addition(1,2);
		add.addition();
		
	}
	
	

}
