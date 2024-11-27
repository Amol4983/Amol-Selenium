package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmpDriver {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList();
		al.add(new Employee(102,"karan",2000));
		al.add(new Employee(101,"Arjun",3000));
		al.add(new Employee(104,"Mahesh",2500));
		al.add(new Employee(103,"Deep",3200));
		al.add(new Employee(106,"Rohit",2800));
		al.add(new Employee(105,"Bipin",4000));
		
		System.out.println("Press 1 for Id Ascending");
		System.out.println("Press 2 for Id Descending");
		System.out.println("Press 3 for Name Ascending");
		System.out.println("Press 4 for Name Descending");
		System.out.println("Press 5 for Salary Ascending");
		System.out.println("Press 6 for Salary Descending");
		
		Scanner s1 = new Scanner(System.in);
		int choice = s1.nextInt();
		switch(choice) {
		case 1: {
			Collections.sort(al,new IdAsc());
			break;
		}
		case 2: {
			Collections.sort(al,new IdDesc());
			break;
		}
		case 3: {
			Collections.sort(al,new NameAsc());
			break;
		}
		case 4: {
			Collections.sort(al,new NameDesc());
			break;
		}
		case 5: {
			Collections.sort(al,new SalAsc());
			break;
		}
		case 6: {
			Collections.sort(al,new SalDesc());
			break;
		}
		default: System.out.println("Enter valid input");
		
	 } // End of switch
		
		for(Employee o: al) {
			System.out.println(o);
		
	 }	
		
   }
	
}


