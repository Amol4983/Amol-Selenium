package org.java;

public class Example2 {
	public static void main(String[] args) {  //reverse string
		String s1 = "I Love Java";
		String s2 = " ";
		String s3[] = s1.split(s2);
		
		for(int i=s3.length-1;i>=0;i--) {
			System.out.println(s3[i]+s2);
		}
	}

}
