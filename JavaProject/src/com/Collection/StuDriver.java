package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StuDriver {

	public static void main(String[] args) {
		
	ArrayList<Student> al = new ArrayList();
		al.add(new Student("Karan", 101));
        al.add(new Student("Lalit", 102));
        al.add(new Student("Sachin", 103));
        al.add(new Student("Amol", 104));
        al.add(new Student("Pankaj", 105));
        al.add(new Student("Kunal", 106));
        al.add(new Student("Jayesh", 107));
        al.add(new Student("Rahul", 108));
        al.add(new Student("Arjun", 109));
        al.add(new Student("Virat", 110));

        Collections.sort(al, new Comparator<Student>() {
        	//Override
            public int compare(Student s1, Student s2) {
                return s2.name.compareTo(s1.name);
        	} 
        	
        });
        
        for (Student o: al) {
            System.out.println(o);
        }
    }
}
        
       


	