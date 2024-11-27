package com.exception;

public class Ex6 {
	
	    int a = 10;
	public static void main(String[] args) {
		
		Ex6 e = null;
		System.out.println("Hi");
		
		try {
			System.out.println(e.a);
		}
		catch(NullPointerException obj) {
			System.out.println("any msg print");			
		}
		
		System.out.println("Bye");
		System.out.println("Thank you");	

	}

}
