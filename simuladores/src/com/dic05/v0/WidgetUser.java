package com.dic05.v0;

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
}

public class WidgetUser {
	public static void main(String[] args) {
		Widget w = new GoodWidget();
		//System.out.println(w.data); //data
		w.doWidgetStuff(); //data
	}
}
