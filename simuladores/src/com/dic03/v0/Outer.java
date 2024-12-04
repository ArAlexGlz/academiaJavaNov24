package com.dic03.v0;


public class Outer
{
  private int i = 10;
  
  class Inner
  {
    public void methodA()
    {
       System.out.println(Outer.this.i);
       System.out.println(i);
       //System.out.println(this.i); //NO COMPILA
    }
  }
  
  public static void main(String[] args) {
	  Outer.Inner objecto = new Outer().new Inner();
	  
	  objecto.methodA();
  }
  
}


//Which of the following statements are valid at line 1 (Select the best answer).