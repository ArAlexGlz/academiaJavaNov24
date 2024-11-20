package com.curso.actual.v0;

public class SampleClass { //SUPERCLASE (PAPA)
	public static void main(String[] args) {
		
		AnotherSampleClass asc = new AnotherSampleClass();
		SampleClass sc = new SampleClass();
		
		
		//AnotherSampleClass asc1 = new SampleClass();
		SampleClass sc1 = new AnotherSampleClass();
		
		//asc = sc;
		sc = asc;
		
		//sc = (Object)asc;
		//asc = (Object)sc;
		
	}
}

class AnotherSampleClass extends SampleClass { //SUBCLASE (HIJO)
}
