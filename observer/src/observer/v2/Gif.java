package observer.v2;

                 //IS-A
public class Gif extends Observer {
	
	private String name;
	private int size;
	
	public Gif(String name, int size, Subject sub) {
		super(sub);
		this.name = name;
		this.size = size;
	}
	
	void showGif() {
		System.out.println("Mostrar Gif: "+name +", size: "+size);
	}

	@Override
	void update() {
		showGif();
	}
}
