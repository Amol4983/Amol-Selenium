package Collection;

import java.util.ArrayList;

public class Example3 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		  //addAll() will add all the objects of one collection into another
		     al.add(10);
		     al.add('A');
		     al.add(22.4);
		     al.add("Hi");
		     al.add(null);
		     al.add(true);
		
		ArrayList al1 = new ArrayList();
		  //addAll() will add all the objects of one collection into another
		     al1.add(al);
		     al1.add(22);
		     al1.add(39.4);
		     al1.add("Bye");
		     System.out.println(al1);
		     
		 /* containsAll() will check whether all the objects of one collection is 
		    present inside another collection or not   */
		     System.out.println(al1.containsAll(al));
		     al1.remove("Hi");
		     System.out.println(al1.containsAll(al));
		     
		 //*retainAll() will save the object of another coll and removes the objects of its own coll.    
		     al1.retainAll(al);
		     System.out.println(al1);
		     
		 /*removeAll() will remove the objects of another coll and saves the objects 
		   of its own coll  */
		     al1.removeAll(al);
		     System.out.println(al1);
		
	}

}

/*Output:-
 
 [[10, A, 22.4, Hi, null, true], 22, 39.4, Bye]
 false
 false
 []
 []

*/
