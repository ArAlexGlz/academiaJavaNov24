package exceptions;

public class TestClass1 {
    public static void main(String[] args) throws MyException{
        TestClass1 tc = new TestClass1();
        try {
            tc.m1();
        } catch (MyException e) {
			tc.m1();
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
