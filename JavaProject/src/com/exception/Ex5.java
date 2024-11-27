package com.exception;

public class Ex5 {

	public static void main(String[] args) {
		int[]a = new int[4];
		System.out.println("Welcome");
		System.out.println("Hello");
		
		try {
			System.out.println(a[5]);
		}
		catch(RuntimeException e) {
			System.out.println("length of array is 4 but size is greater");
		}
		System.out.println("Bye");
		System.out.println("Thank you");
	}

}
