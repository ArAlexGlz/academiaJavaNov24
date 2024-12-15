package observer.v2;

public class ScrollBar extends Observer{
	
	ScrollBar(Subject sub){
		super(sub);
	}

	void desplazar(){
		System.out.println("Desplazar ScrollBar");
	}

	@Override
	void update() {
		desplazar();
	}
}
