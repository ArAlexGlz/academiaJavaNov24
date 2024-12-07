package com.dic05.v2;

abstract class Widget {
    String data = "data";
    public void doWidgetStuff() {
      System.out.println(data);
    }
}

class GoodWidget extends Widget{
    String data = "big data";
    public void doWidgetStuff() {
    	System.out.println("GoodWidget doWidgetStuff()");
    	super.doWidgetStuff();
    }
}

public class WidgetUser{
    public static void main(String[] args) {
        Widget w = new GoodWidget();
//      w.doWidgetStuff();
//      System.out.println(w.data);
        
        ((Widget)w).doWidgetStuff();
    }
   
}
