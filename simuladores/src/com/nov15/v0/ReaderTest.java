package com.nov15.v0;

interface Classic {
	//public static final
    int version = 1;
    //public abstract
    public void read();
}

class MediaReader implements Classic {
	//default
    int version = 2; //Hidden (Oculta)
    
    @Override
    public void read() {
    	MediaReader otroMr = this;
    	Classic c = (Classic)otroMr;
    	System.out.println(c.version); //1
    	
        //System.out.println(((Classic)this).version);
    }
}

public class ReaderTest {
    public static void main(String[] args) {
    	MediaReader mr = new MediaReader();
        mr.read(); //2
    }
}
