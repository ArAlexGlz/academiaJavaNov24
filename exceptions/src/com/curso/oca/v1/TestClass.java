package com.curso.oca.v1;

class SomeException extends Exception{} //Checked

class A{
	protected void m() throws SomeException{}
}

class B extends A{
	@Override
	public void m(){}
}

public class TestClass {
	
	public static void main(String[] args){
		
//		B b = new B();
//		b.m(); //SI SE PUEDE
//		
//		A a = new B();
//		a.m(); //NO SE PUEDE
//		
//		//B b = new A(); //MALA DEFINICION
//		b.m();
		
		A a = new B();
		((B)a).m();
		
		Object o = new B();
		((B)(A)o).m();
		
		
	}

}
