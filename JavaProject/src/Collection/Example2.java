package Collection;

import java.util.ArrayList;

public class Example2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		//add() will add objects in collection
		al.add(10);
		al.add('A');
		al.add("Hello");
		al.add(null);
		System.out.println(al);
		
		//removing object
		al.remove(0);//it will remove the object
		System.out.println(al);
		
		//searching object
		System.out.println(al.contains(10));
		System.out.println(al.contains("Hello"));
		
		//miscelleneous
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
	}

}

/* Output
      [10, A, Hello, null]
      [A, Hello, null]
      false
      true
      3
      false
      0
      true
*/
