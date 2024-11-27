package com.book.v0;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    @Override
	public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    public static void main(String[] args) {
        String[] values = { "123", "Abb", "aab" };
        //                   123    abb    aab
        //                   123    aab    abb
        //Arrays.sort(values); //123, Abb, aab
        Arrays.sort(values, new MyComparator()); //abb aab 123
        for (var s: values) {
            System.out.print(s + " "); //Abb aab 123
        }
    }
}