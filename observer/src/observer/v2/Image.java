package observer.v2;

public class Image extends Observer{
	
	Image(Subject sub){
		super(sub);
	}

	void mostrarImagen(){
		System.out.println("Imagen Bird");
	}

	@Override
	void update() {
		mostrarImagen();
	}
}
