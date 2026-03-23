package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapCollectionDemo {

	public static void main(String[] args) {
		Map<Integer,String> hashmMap=new HashMap<>();
		hashmMap.put(101,"Akash"); //Entry
		hashmMap.put(102, "Sai");  //Entry
		hashmMap.put(103,"Praveen");
		hashmMap.put(104, "Surya");
		
		System.out.println(hashmMap);
		
		System.out.println(hashmMap.get(101));
		System.out.println(hashmMap.keySet());
		
		for(int key:hashmMap.keySet()) {
			System.out.println(key);
		}
		
		System.out.println(hashmMap.values());
		for(String value:hashmMap.values()) {
			System.out.println(value);
		}
		
		System.out.println(hashmMap.entrySet());
        for(Entry<Integer,String> entry:hashmMap.entrySet()) {
        	System.out.println(entry);
        }
	}

}
