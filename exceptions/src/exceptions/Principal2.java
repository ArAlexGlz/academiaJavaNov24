package exceptions;

public class Principal2 {

	public static void main(String[] args) {
		float ff = Float.NaN;
		System.out.println(ff);
	}
	
	public float parseFloat(String s) {
	    float f = 0.0f;
	    try {
	        f = Float.valueOf(s).floatValue();
	        return f;
	    } catch (NumberFormatException nfe) {
	        System.out.println("Invalid input " + s);
	        f = Float.NaN;
	        return f;
	    } finally {
	        System.out.println("finally");
	    }
	    //return f;
	}


}
