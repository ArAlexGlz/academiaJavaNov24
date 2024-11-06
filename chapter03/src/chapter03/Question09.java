package chapter03;

public class Question09 {

	public static void main(String[] args) {
		int count = 0;

		BUNNY: for (int row = 1; row <= 3; row++)
			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0)
					//________;
					System.out.println("PASO");
				count++;
			}
		System.out.println(count); //9
	}
	
	// count    row      col  (col+row)
	//     0      1        0         1
	//     1
	//                     1         2   PASO    
	//     2
	//                     2         3
	//     3
	//                     3
	//     ************************************
	//     3      2        0         2   PASO
	//     4
	//                     1         3
	//     5
	//                     2         4   PASO
	//     6
	//                     3
	//     *************************************
	//     6      3        0         3
	//     7
	//                     1         4   PASO
	//     8
	//                     2         5
	//     9
	//                     3
    //     *************************************
	//            4
	
	
}