                                    //LinkedHashSet//  & //TreeSet//

// 1) HashSet duplicate values NO and insertion order No. But LinkedHashSet duplicate values No insertion order YES.
// 2) LinkedHashSet saves the values in two ways Hashtable+doubly linkedlist
// 3) TreeSet duplicate values NO and ascending order YES. TreeSet is very fast for retrieving the any values.
// 4) By using TreeSet we can print the values in descending order also.
// 5) TreeSet have different types of methods those are 1.first()  2.last() 3.headSet() 4/tailSet() 5.subSet()

package Collections;
import java.util.*;
public class CollectionDemo9 {
	public static void main(String[] args) {
		//LinkedHashSet ls = new LinkedHashSet();
		
		//ls.add(10);
		//ls.add(5);
		//ls.add(24);
		//ls.add(15);
		//ls.add(10); //Even we add the duplicate values it wont print in the o/p.
		
		//Iterator it = ls.iterator();
		//while(it.hasNext()) {
			//System.out.println(it.next());
		//}
		
		
          TreeSet ts = new TreeSet(); //TreeSet follows the ascending or descending order to print the values in the o/p.
		
		  //ts.add(10);
		  //ts.add(5);
		  //ts.add(24);
		  //ts.add(15);
		  //ts.add(10); //Even we add the duplicate values it wont print in the o/p.
		  //ts.add(3);
		  //ts.add(7);
          
			//Iterator it = ts.iterator(); // To print the values in ascending order.
	        //while(it.hasNext()) {
				//System.out.println(it.next());
		    //}
		  
		    //Iterator it = ts.descendingIterator();// To print the values in descending order.
			//while(it.hasNext()) {
				//System.out.println(it.next());
			//}
		  
          //System.out.println(ts.first()); // It will print first value o/p is 3
		  
		  //System.out.println(ts.last()); // It will print the last value so o/p is 24
		  
		  //TreeSet ts1 = (TreeSet) ts.headSet(10); // headSet is useful for to print the lesser values. we mentioned 10 in headSet  so it will find which values are lessthan 10 and gives the o/p.
		  
		  //System.out.println(ts1); // O/P is 3,5,7 
		  
		  //TreeSet ts2 = (TreeSet) ts.tailSet(10); // tailSet is useful for to print the higher values. we mentioned 10 in tailSet  so it will find which values are highertha 10 and gives the o/p.
		  
		  //System.out.println(ts1); // O/P is 10,15,24
		  
		  //TreeSet ts3 = (TreeSet) ts.subSet(5,15); // subSet is useful fot to print the values between the 5 and 15.
		  
		  //System.out.println(ts1); // O/P is 5,7,10
          
          
          ts.add("Sam");
          ts.add("David");
          ts.add("Paul");
          ts.add("Daniel");
          ts.add("Abraham");
          ts.add("Joseph");
          
          System.out.println(ts); // O/P prints in alphabetical order
          
		  
		 
				
	}

}
