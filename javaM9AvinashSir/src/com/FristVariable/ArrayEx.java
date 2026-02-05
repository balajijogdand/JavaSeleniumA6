package com.FristVariable;

import java.util.Arrays;

public class ArrayEx {
	   static int sum;
	public static void main(String[] args) {
//		int []num=new int[4];
//         num[0]=52;
//         num[1]=20;
//         num[2]=28;
//         num[3]=87;
//         // sort the element
//         Arrays.sort(num); 
//         System.out.println(Arrays.toString(num));
		
		String s1 = "bal1aji243";
		        int sum = 0;
		        for(int i = 0; i<s1.length();i++){
		            char ch=s1.charAt(i);
		            if (ch>='0' && ch<='9') {   
		                sum=sum+(ch-'0');    
		            }
		        }
		        	System.out.println(sum);
		    }
		}

