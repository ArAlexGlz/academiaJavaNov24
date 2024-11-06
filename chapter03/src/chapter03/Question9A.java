package chapter03;

public class Question9A {

	public static void main(String[] args) {
		int count = 0;

		BUNNY: for (int row = 1; row <= 3; row++)
			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0)
					continue;
				count++;
			}
		System.out.println(count); //5
	}
	
	// count    row      col  (col+row)
	//     0      1        0         1
	//     1
	//                     1         2       
	//                     2         3
	//     2
	//                     3
	//     ************************************
	//     2      2        0         2   
	//                     1         3
	//     3
	//                     2         4   
	//                     3
	//     *************************************
	//     3      3        0         3
	//     4
	//                     1         4  
	//                     2         5
	//     5
	//                     3
    //     *************************************
	//            4
	
	
}