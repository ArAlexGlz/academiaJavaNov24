package com.curso.v1;

public class FindInMatrix {

	public static void main(String[] args) {

		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 }, { 8, 99 }  };

		int searchValue = 2; //2,0
		int positionX = -1;
		int positionY = -1;

		for (int i = 0; i < list.length; i++) { 
			for (int j = 0; j < list[i].length; j++) { 
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					System.out.println("("+i+","+j+")");
					break; //<== TERMINA CON EL FOR ANIDADO
				}
			}
		}

		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}

	}

}