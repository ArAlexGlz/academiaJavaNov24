package observer.v1;

public class Image extends Observer{

	void mostrarImagen(){
		System.out.println("Imagen Bird");
	}

	@Override
	void update() {
		mostrarImagen();
	}
}
