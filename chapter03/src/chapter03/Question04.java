package chapter03;

public class Question04 {

	public static void main(String[] args) {
		
//		Question04 q = new Question04();
//		q.printReptile(3);

		new Question04().printReptile(5);
		//new Question04().printReptileOld(3);
	}

	void printReptile(int category) {
		String type = switch (category) {
		case 1, 2 -> "Snake";
		case 3, 4 -> "Lizard";
		case 5, 6 -> {
			System.out.println("Paso por 5 o 6");
			yield "Turtle";
		}
		case 7, 8 -> "Alligator";
		default -> "Sin definir";
		};
		
		System.out.println(type); //Lizard
	}
	
	void printReptileOld(int category) {
	    String type;
	    switch (category) {
	        case 1:
	        case 2:
	            type = "Snake";
	            break;
	        case 3:
	        case 4:
	            type = "Lizard";
	            break;
	        case 5:
	        case 6:
	            type = "Turtle";
	            break;
	        case 7:
	        case 8:
	            type = "Alligator";
	            break;
	        default:
	            type = "Sin definir";
	            break;
	    }
	    System.out.println(type);
	}
}
