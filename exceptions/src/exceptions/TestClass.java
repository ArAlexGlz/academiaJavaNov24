package exceptions;

class MyException extends Exception {}

public class TestClass {
    public static void main(String[] args){
        TestClass tc = new TestClass();
        try {
            tc.m1();
        } catch (MyException e) {
        	System.out.println(e);
            try {
				tc.m1();
			} catch (MyException e1) {
				System.out.println(e1);
			}
        } finally {
            tc.m2();
        }
    }

    public void m1() throws MyException {
        throw new MyException();
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }
}
