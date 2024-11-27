package com.Collection;

import java.util.Comparator;

public class IdAsc implements Comparator {
	public int compare(Object O1,Object O2) {
	Employee e1 = (Employee)O1;
	Employee e2 = (Employee)O2;
	return e1.id-e2.id;
	}
}
class IdDesc implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return e2.id-e1.id;
	}
}
class NameAsc implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}
class NameDesc implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return e2.name.compareTo(e1.name);
	}
}
class SalAsc implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return (int)e1.sal-(int)e2.sal;
	}
}
class SalDesc implements Comparator<Employee> {
	public int compare(Employee e1,Employee e2) {
		return (int)e2.sal-(int)e1.sal;
	}
}

