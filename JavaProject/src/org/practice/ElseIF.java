package org.practice;

import java.util.Scanner;

public class ElseIF {

	public static void main(String[] args) {
		
		int marks;
		System.out.println("Enter marks");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();

		if (marks>80)
		{
			System.out.println("Distinction");
		}
		else if (marks<80 && marks>=60)
		{
			System.out.println("First class");
		}
		else if (marks<60 && marks>=40)
		{
			System.out.println("second class");
		}
		else
		{
			System.out.println("Result fail");
		}
	}
}