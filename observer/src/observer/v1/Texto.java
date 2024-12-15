package observer.v1;

public class Texto extends Observer  {
	
	private String mensaje;

	public Texto(String mensaje) {
		this.mensaje = mensaje;
	}
	
	void showMessage() {
		System.out.println("Texto: "+mensaje);
	}

	@Override
	void update() {
		showMessage();
	}
}
