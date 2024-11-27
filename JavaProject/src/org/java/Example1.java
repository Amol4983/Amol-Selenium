package org.java;

import java.util.Arrays;

public class Example1 {
	public static void main(String[] args) { // Anagram
		String s1 = "Karan";
		String s2 = "Arjun";
		
		if(s1.length()==s2.length()) {
			System.out.println("These string are eligible");
			String str1 = returnData(s1);
			String str2 = returnData(s2);
			
			if(str1.equalsIgnoreCase(str2)) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not an Anagram");
			}
		}
		
		else {
			System.out.println("Not eligible bcz length is not matching");
		}
	}
		
		public static String returnData(String s1) {
			char[] ch1=s1.toCharArray();
			Arrays.sort(ch1);
			
			String str = new String(ch1);
			return str;
			
			
		}
	}


