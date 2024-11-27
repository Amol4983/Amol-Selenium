package org.java;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		//Access
		int large=arr[0];//10
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<large) {
				large=arr[i];
			}
		}
		System.out.println(large+" is the Largest Element");
	}

}
