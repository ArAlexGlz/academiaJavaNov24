package com.nov15.v1;

public class Resource {
	
	private String data = "DATA";
	
	String getData() {
		return data;
	}
	
	void setData(String data) {
//		if (data == null)
//			this.data = "";
//		else
//			this.data = data;
		
		this.data = data == null ? "" : data;
	}
	
	boolean equals(Resource r) {
		return (r != null && 
				r.getData().equals(this.getData()));
	}
	
	public static void main(String[] args) {		
		
		Resource r1 = new Resource();
		String data1 = r1.getData(); 
		System.out.println(data1); //DATA
		
		Resource r2 = new Resource();
		String data2 = r1.getData(); 
		System.out.println(data2); //DATA
		
		boolean r = r1.equals(r2); //equals Resource
		System.out.println("boolean: "+r);
		//new Resource().equals(new Object()); //equals de Object
		
		System.out.println("***********************");
		
		Resource r4 = new Resource();
		r4.setData("Hello");
		Resource r5 = new Resource();
		r5.setData("Hello");
		System.out.println("1:"+r4.equals(r5));
		
		Resource r6 = new Resource();
		r6.setData(null); //""
		Resource r7 = new Resource();
		r7.setData(null); //""
		System.out.println("2:"+r6.equals(r7));
		
		System.out.println("Dato:"+r6.getData());
		System.out.println("Dato:"+r7.getData());

	}

}
