package observer.v2;

public abstract class Observer {
	
	//HAS-A
	Subject sub;
	
	Observer(Subject sub){
		this.sub = sub;
		sub.attach(this);
	}
		
	abstract void update();

}
