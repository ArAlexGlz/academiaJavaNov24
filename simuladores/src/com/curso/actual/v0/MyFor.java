package com.curso.actual.v0;

public class MyFor
{
   public static void main(String[] args)
   {
       for (int ii = 0; ii < 4; ii++) //2 //4
       {
           System.out.println("ii = " + ii); //0 2
           ii = ii +1; //1 //3
       }
   }
}