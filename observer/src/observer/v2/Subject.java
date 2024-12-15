package observer.v2;

import java.util.*;

public abstract class Subject {
	
	//HAS-A
//	Observer o1;
//	Observer o2;
//	Observer o3;
	List<Observer> listaObservers = new ArrayList<>();
	
	void attach(Observer o) {
		listaObservers.add(o);
	}
	
	void detach(Observer o) {
		listaObservers.remove(o);
	}
	
	//POLIMORFISMO
	void notificar() {
		for (Observer o:listaObservers)
			o.update();
	}

}
