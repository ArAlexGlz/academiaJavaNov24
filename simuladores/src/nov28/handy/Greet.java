package nov28.handy;

//import nov28.handy.dandy.*; //2
import nov28.handy.dandy.KeyStroke; //3

public class Greet {
	public static void main(String[] args) {
        String greeting = "Hello";
        System.out.print(greeting);

//1     nov28.handy.dandy.KeyStroke stroke = 
//        		new nov28.handy.dandy.KeyStroke();
        
        KeyStroke stroke = new KeyStroke();
        
        stroke.typeExclamation();
    }
}
