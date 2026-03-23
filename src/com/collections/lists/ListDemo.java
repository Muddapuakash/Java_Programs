package com.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class ListDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		Collections.reverse(list);
	    System.out.println(list);
		Collections.max(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Set<Integer> set=new LinkedHashSet<>(list);
		System.out.println(set);
		
	}
}
