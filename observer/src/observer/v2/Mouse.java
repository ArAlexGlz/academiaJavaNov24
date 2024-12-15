package observer.v2;
                   //IS-A
public class Mouse extends Subject {
	
	void click() {
		System.out.println("Click Mouse");
		notificar();
	}

}
