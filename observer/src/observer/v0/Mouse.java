package observer.v0;

public class Mouse {

	//ALTO ACOPLAMIENTO => BAJO ACOPLAMIENTO
	Gif gif;
	Texto  txt = new Texto("Mostrar Texto");
	ScrollBar sb;

	Mouse(){
		gif = new Gif("Duck",10);
	}
	
	void click() {
		System.out.println("Click Mouse");
		txt.showMessage();
		gif.showGif();
		if (sb == null)
			new ScrollBar().desplazar();
		else
			sb.desplazar();
	}

}
