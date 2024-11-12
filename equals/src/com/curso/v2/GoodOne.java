package com.curso.v2;

public class GoodOne {

	int theval;
	
	public static void main(String[] args) {
		GoodOne a = new GoodOne();
		a.theval = 6;
		GoodOne b = new GoodOne();
		b.theval = 9;
		
		System.out.println(a.equals(b));
	}
	
	public int hashcode() {
		return theval%3; //0,1,2 
	}
	
	@Override
	public boolean equals(Object obj) {
		//return true; //NO CUMPLE
		boolean bol;
		
		bol = this == obj ? true : ( theval%3 == 0 &&
				((GoodOne)obj).theval%3 == 0) ? true:false;
		
		if (this == obj)
			bol = true;
		else if (theval%3 == 0 && ((GoodOne)obj).theval%3 == 0)
			bol = true;
		else 
			bol = false;
		
		
		return bol;
	}
	
	//a=9 y b=9
	//a=6 y b=9
	
	//Si hashcode() asigna el número 1
	//¿Es el mismo número? R: No necesariamete
	//a=10 y b=10 
	//a=10 y b=4 
	
	//a=10 y b=10 //equals()=true
	//a=10 y b=4  //equals()=false
	

}
