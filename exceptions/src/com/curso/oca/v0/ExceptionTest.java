package com.curso.oca.v0;

class MyException extends Throwable {}

class MyException1 extends MyException {}
class MyException2 extends MyException {}

class MyException3 extends MyException2 {}


public class ExceptionTest {
	
	void myMethod() throws MyException {
        throw new MyException3();
    }
	
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		
		try {
			et.myMethod();
		}catch (MyException3 me) {
            System.out.println("MyException3 thrown");
        }catch (MyException2 me) {
            System.out.println("MyException2 thrown");
        }catch (MyException me) {
            System.out.println("MyExceptio thrown");
        }catch (Exception me) {
            System.out.println("Exception thrown");
        }finally {
            System.out.println("Done");
        }
		
	}

}
