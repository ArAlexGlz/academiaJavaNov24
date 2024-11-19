package com.curso.docto.v0;

interface SampleCloseable{
	public void close() throws java.io.IOException; 
}

public class Test implements SampleCloseable {

//	@Override
//	public void close() throws java.io.IOException{}
	
	@Override
	public void close(){}
	
//	@Override
//	public void close() throws java.io.FileNotFoundException{}
	
//	@Override //NO SE PUEDE
//	public void close() throws Exception{}
	
}
