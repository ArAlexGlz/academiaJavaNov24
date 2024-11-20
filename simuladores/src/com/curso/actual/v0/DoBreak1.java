package com.curso.actual.v0;

public class DoBreak1
{
   public static void main(String[] args)
   {
       String[] table = {"aa", "bb", "cc", "dd"}; 
       for (String ss: table)
       {
           if ("bb".equals(ss))
           {
               continue;
           }
           System.out.println(ss); //aa cc
           if ("cc".equals(ss))
           {
               break;
           }
       }
   }
}