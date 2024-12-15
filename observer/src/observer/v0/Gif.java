package observer.v0;

public class Gif {
	
	private String name;
	private int size;
	
	public Gif(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	void showGif() {
		System.out.println("Mostrar gif: "+name +", size: "+size);
	}
}
