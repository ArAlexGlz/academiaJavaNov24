package com.nov28.v0;

import java.util.HashMap;
import java.util.Map;

public class MyKeys {
	
	Integer key;

	MyKeys(Integer k) {
		key = k;
	}

	@Override
	public int hashCode() {
		return key;
	}
	
	@Override
	public boolean equals(Object o) {
		return ((MyKeys)o).key.equals(this.key) ;
	}
	
	public String toString() {
		return key.toString();
	}

	public static void main(String[] args) {
		Map<MyKeys,String> m = new HashMap<>();
		MyKeys m1 = new MyKeys(1);
		MyKeys m2 = new MyKeys(2);
		MyKeys m3 = new MyKeys(1);
		MyKeys m4 = new MyKeys(new Integer(2));

		m.put(m1, "car");
		m.put(m2, "boat");
		m.put(m3, "plane");
		m.put(m4, "bus");
		
		System.out.println(m.size()); //2
		System.out.println(m);
	}

}