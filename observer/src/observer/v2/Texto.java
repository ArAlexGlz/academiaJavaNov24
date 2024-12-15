package observer.v2;

public class Texto extends Observer  {
	
	private String mensaje;

	public Texto(String mensaje, Subject sub) {
		super(sub);
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
