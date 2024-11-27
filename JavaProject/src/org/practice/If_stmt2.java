package org.practice;

import java.util.Scanner;

public class If_stmt2 {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter the user age");
		Scanner sc = new Scanner(System.in);
		age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("you are eligible for married");
		}
		System.out.println("this stmt always execute");
	}

}
