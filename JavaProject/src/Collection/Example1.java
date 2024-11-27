package Collection;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		       al.add(10);
		       al.add(20);
		       al.add(30);
		       al.add('A');
		       al.add("Arjun");
		       al.add(null);
		       al.add(true);
		       
		       System.out.println(al);

	}
}



/* Output:-
 
     [10, 20, 30, A, Arjun, null, true]
 
*/ 
