package arrays;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		//Size constante //primitivos
		//String[] arrayString = {"Patrobas","Andronico","Tercio","Epeneto"};
		String[] arrayString = new String[4];
		arrayString[0] = "Patrobas";
		arrayString[1] = "Andronico";
		arrayString[2] = "Tercio";
		arrayString[3] = "Epeneto";
		
		//Size variable //NO primitivos
		ArrayList<String> arraylistString = new ArrayList<>();
		arraylistString.add("Patrobas");
		arraylistString.add("Andronico");
		arraylistString.add("Tercio");
		arraylistString.add("Epeneto");
		arraylistString.add(0, "Filologo");
		System.out.println(arraylistString);
		
		//System.out.println(arrayString[2]);
		System.out.println(arraylistString.get(2));
		
		
		
	}

}
