package org.practice;

import java.util.Scanner;

public class Method1 {
	int n1,n2;
	int add,sub,mul,div,rem;
	public static void main(String[] args) {
		Method1 m=new Method1();
		m.input();
		m.process();
		m.output();
	}
	void input()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	n1=sc.nextInt();
	n2=sc.nextInt();
	System.out.println("==================");
	}
	void process()
	{
		add=(n1+n2);
		sub=(n1-n2);
		mul=(n1*n2);
		div=(n1/n2);
		rem=(n1%n2);	
	}
	void output()
	{
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(rem);
		System.out.println("================");
	}
	

}
