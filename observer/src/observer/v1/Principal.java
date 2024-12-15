package observer.v1;

public class Principal {

	public static void main(String[] args) {
		
		Observer texto = new Texto("DiplomadoJava");
		Observer gif = new Gif("Duck",10);
		Observer sb = new ScrollBar();

		Mouse mouse = new Mouse();
		
		mouse.attach(texto);
		mouse.attach(gif);
		mouse.attach(sb);
		//*******************************
		
		mouse.click();
		
		System.out.println("*********");
		mouse.detach(gif);
		mouse.attach(new Image());
		mouse.attach(new ScrollBar());
//		
		mouse.click();
//		
//		System.out.println("*********");
//
//		boolean r = ( texto == mouse.listaObservers.get(0) );
//		System.out.println(r);
		
	}

}
