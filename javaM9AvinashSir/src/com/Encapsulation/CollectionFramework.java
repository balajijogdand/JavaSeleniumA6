package com.Encapsulation;

import java.util.ArrayList;

public class CollectionFramework {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(20); // to add the element of array list.
		a1.add(50);
		a1.add("hi");
		a1.add(null);
		a1.add(20);
		a1.add(70);
		System.out.println(a1);
		
		a1.remove(2);
		System.out.println(a1); // remove the index values.
		
		System.out.println(a1.contains(50)); // contains method are used to search the element of array list.
		
		System.out.println(a1.size()); // size method are used to number of size of present in array list.
		
		System.out.println(a1.isEmpty());
		
		Object[] obj = a1.toArray();
		System.out.println(obj[2]);
		System.out.println(obj.length);
	}

}
