                                  //HashSet//

//1) HashSet comes from the Set so it wont allows the duplicate values.
//2) HashSet is non synchronized means not thread safe at a time more than one thread can access the values.
//3) HashSet will use the Hashtable in order to store the values this is called hashing.
//4) It is useful for search operations and it should contains the unique values only.
//5) It's Initial capacity is 16 once 12  elements get stored  it will be double((because lead factor double the capacity once 75% filled)) But it has  another facility i.e "lead factor" 
//6) lead factor will take care when the capacity should be increased like after 50% completion it should be increase or after 75% completion it should be increase. 
//7) Lead factor default size is 75%. means once 75% filled it will double the capacity.
//8) we can use these all method in HashSet. add, remove, contains, isEmpty, size, clear
//9) HashSet print the values randomly. It does not print the values as we have added.

package Collections;
import java.util.*;

public class CollectionDemo8 {
	public static void main(String[] args) {
		HashSet hs = new HashSet(); //we can use generics also here ex: HashSet<String>
		
		hs.add("Philip");
		hs.add("David");
		hs.add("Moses");
		hs.add("Paul");
		hs.add("David"); //HashSet wont allows the duplicate values so it will not print in the o/p.
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
