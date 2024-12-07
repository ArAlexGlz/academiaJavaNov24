package com.dic05.v1;

abstract class Widget {
	String data = "data";

	public void doWidgetStuff() {
	}
}

class GoodWidget extends Widget {
	//HIDDEN
	String data = "big data";

	public void doWidgetStuff() {
		System.out.println(super.data); //<== CLAVE
	}
	
	GoodWidget(){
		System.out.println(data); 
	}
}

public class WidgetUser {
	public static void main(String[] args) {
		System.out.println("v1");
		Widget w = new GoodWidget();
	}
}
