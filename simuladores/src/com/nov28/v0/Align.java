package com.nov28.v0;

import java.text.*;

public class Align {

	public static void main(String[] args) throws ParseException {
		String[] sa = { "111.234", "222.5678" };
		
		NumberFormat nf = NumberFormat.getInstance();
		
		nf.setMaximumFractionDigits(3); //NO TIENE SENTIDO
		
		for (String s : sa) {
			Number num = nf.parse(s);
			System.out.println(num);
		}
	}

}