package com.nov26.v0;

public class MyFive {
    public static void main(String[] args) {
        short kk = 11;  
        short ii;
        short jj = 0;
        //   11               ii = ii - 1
        for (ii = kk; ii > 6; ii-=1) {
            jj++; //0 (ENTRAR 5 VECES)
        }
        
        System.out.println("jj = " + jj); //5
        
        // kk   ii   jj
        // 11   11    0
        //            1
        //      10    2
        //       9    3
        //       8    4
        //       7    5
        //       6   
    }
}