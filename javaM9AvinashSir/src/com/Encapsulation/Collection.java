//package com.Encapsulation;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Collection {
//	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList();
//		al.add(10);
//		al.add(50);
//		al.add(80);
//		al.add(20);
//		al.add(5);
//		
//		Collections.sort(al);
//		for(Integer obj:al) {
//			if(obj%2==0) {
//				System.err.println(obj);
//			}
//		}
//	}
//
//}


/* WAJP to create an object of Array list type and store 7names and
print the names which has more than 4charecters in accending order. */

package com.Encapsulation;

import java.util.ArrayList;
import java.util.Collections;

public class Collection{
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList();
		al.add("vikas");
		al.add("subodh");
		al.add("mirza bhai");
		al.add("balaji");
		al.add("shuiva");
		al.add("rahul bhai");
		al.add("vaibhav");
		al.add("abhay");
		al.add("akshay");
		
		for(String obj:al) {
			if(obj.length()>4);
			System.err.println(obj);
			
		}
		
	}
}






















