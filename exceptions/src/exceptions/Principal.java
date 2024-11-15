package exceptions;

import java.lang.Exception;

interface I1{
	void m1() throws java.io.IOException;
}

interface I2{
	void m1() throws java.sql.SQLException;
}

class Cliente implements I1,I2{

	@Override
	public void m1(){	
		System.out.println("Hello");
	}
	
	
}

public class Principal {

	public static void main(String[] args) {
		new Cliente().m1();
	}

}
