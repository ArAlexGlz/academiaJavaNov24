package com.curso.oca.v0;

public class Test {
	
    static String j = "";

    public static void method(int i) {//i=1, i=2
        try {
            if (i == 2) {
                throw new Exception();
            }
            j += "1"; //1
        } catch (Exception e) {
            j += "2"; //1342
            return;
        } finally {
            j += "3"; //13 //13423
        }
        j += "4"; //134
    }

    public static void main(String args[]) {
        method(1);
        method(2);
        System.out.println(j); //13423
    }
}

