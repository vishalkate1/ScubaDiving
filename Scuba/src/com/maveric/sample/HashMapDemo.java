package com.maveric.sample;
import java.util.*;

// hashmap example

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // creating hashmap
		HashMap<Integer,String> myhashmap = new HashMap<Integer,String>();
		
		myhashmap.put(1, "abc"); // put elements in map
		myhashmap.put(2, "def");
		myhashmap.put(3, "pqr");
		myhashmap.put(2, "xyz");
		
		System.out.println("Display hashmap elements...");
		
		for (Map.Entry a: myhashmap.entrySet()) {
		    System.out.println(a.getKey()+ "" +a.getValue());
	}

  }
} 