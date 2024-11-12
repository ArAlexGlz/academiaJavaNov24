package arrays;

public class Principal2 {
	
	public static void main(String[] args) {
		long long1 = 2147483648L;
		int int1 = Integer.MAX_VALUE;
		int int2 = Integer.MIN_VALUE;

		System.out.println(int1);
		System.out.println(int2);

		System.out.println(long1);
		
		long long2 = 5;
		
		Long longObj1 = 5L;
		
		//Long longObj2 = new Long(3L);
		Long longObj2 = Long.valueOf(3);
		
		//Unboxing
		long long3 = longObj2;
		
	}

}
