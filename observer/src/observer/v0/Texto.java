package observer.v0;

public class Texto {
	
	private String mensaje;

	public Texto(String mensaje) {
		this.mensaje = mensaje;
	}
	
	void showMessage() {
		System.out.println(mensaje);
	}
}
