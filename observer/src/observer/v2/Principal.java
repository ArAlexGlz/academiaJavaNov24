package observer.v2;

public class Principal {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		
		Observer texto = new Texto("DiplomadoJava",mouse);
		Observer gif = new Gif("Duck",10,mouse);
		Observer sb = new ScrollBar(mouse);
		
		mouse.click();
		
		System.out.println("*********");
		
		mouse.detach(gif);
		new Image(mouse);
		new ScrollBar(mouse);
		
		mouse.click();
//		
//		System.out.println("*********");
//
//		boolean r = ( texto == mouse.listaObservers.get(0) );
//		System.out.println(r);
		
	}

}
