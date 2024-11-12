package com.curso.v0;

abstract class Saloon {
    protected int m1() { 
        return 0; 
    }
}

public class OverridingSaloon extends Saloon {
	@Override
    protected int m1() { 
        return 1; 
    }
}
