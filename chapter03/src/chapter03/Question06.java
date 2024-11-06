package chapter03;

public class Question06 {

	public static void main(String[] args) {

		int x = 10;
		
		for (int y=0; y==0 && x<5; y++)
			System.out.println("Hola mundo");
	
		System.out.println("Fin de Programa");
	}
	
	void printReptile(String category) {
		String type = switch (category) {
		case "1", "2" -> "Snake";
		case "3", "4" -> "Lizard";
		case "5", "6" -> {
			System.out.println("Paso por 5 o 6");
			yield "Turtle";
		}
		case "7", "8" -> "Alligator";
		default -> "Sin definir";
		};
		
		System.out.println(type); //Lizard
	}

}
