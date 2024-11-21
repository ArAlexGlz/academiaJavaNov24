package com.curso.nov21;

public class Test {
	public int luckyNumber(int seed) {
		if (seed > 10)
			return seed % 10;
		int x = 0;
		try {
			if (seed % 2 == 0) 
				throw new Exception("No Even Number Please.");
			else
				return x;
		} catch (Exception e) {
			return 3;
		} finally {
			return 7;
		}
	}

	public static void main(String args[]) {
		
//		int i = 0;
//		i = new Test().luckyNumber(9);
//		System.out.println("i: "+i); //7

        int amount = 100, seed = 6;
        switch (new Test().luckyNumber(6)) {
            case 3: amount = amount * 2; break;
            case 7: amount = amount * 2; break;
            case 6: amount = amount + amount; break;
            default: break;
        }
        System.out.println(amount); //200
	}
}
