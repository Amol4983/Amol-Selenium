package com.exception;

public class Ex4 {

	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		int a = 10;
		int b = 0;
		
		try {
			int res = a/b;
			System.out.println(res);
		}
		catch(RuntimeException e) {
			System.out.println("cannot divide any number by 0");
		}
		System.out.println("Bye");
		System.out.println("Thank you");

	}

}
