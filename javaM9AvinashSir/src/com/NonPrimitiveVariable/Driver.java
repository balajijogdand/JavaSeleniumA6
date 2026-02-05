// NON PRIMITIVE TYPE CASTING:
// THE PROCESS OF CONVERTINIG ONE NON-PRIMITIVE DATA TYPE 
// INTO ANOTHER NON-PRIMITIVE DATA TYPE IS KNOWN AS NON-PRIMITIVE TYPE CASTING.

package com.NonPrimitiveVariable;

public class Driver {
	public static void main(String[]args) {
		person p = new child();
// accesing member of parson class reffernce variable.
		System.out.println(p);
		
// accesing member of child class reffernce variable.
		//System.out.println(p.b); compile time error.
		System.out.println(p.a);
		}
}
