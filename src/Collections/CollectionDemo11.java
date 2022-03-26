   											//LinkedHashMap//

// 1) HashMap does not follow the insertion order but LHM follows the insertion order.
// 2) HM intial capacity is 16 LHM is 16 TM have no capacity HashTable 11.
// 3) HM will use hash table to store the values, LHM=> hashtable+double linke list TM=> red black tree HashTable=> hashtable

package Collections;
import java.util.*;


public class CollectionDemo11 {
	public static void main(String[] args) {
		
        LinkedHashMap lhm = new LinkedHashMap(); // LinkedHashMap will follow the insertion order
		
		lhm.put("name", "Joseph");
		lhm.put("dob", "20th jan");
		lhm.put("nick name", "Joseph");
		
        Set s = lhm.keySet(); // In order to retrieve all keys we should store all key in one variable i.e 's'. Here we shoud use Set Interface only because Set wont accept the duplicate values.
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next(); // We are storing the values in obj
			
			String str = (String)obj; // Directly We can not print the object in the so we are changing that obj into string. 
			
			//System.out.println(str); //If we give like this it will print the only keys
			
			System.out.println(str+ ":"+lhm.get(str)); //To print the values with the keys.
		}
		 
		System.out.println(); // To show  the space between the LHM and TM in the o/p
		
		
		                             //TreeMap// 
		
		//  TreeMap follows the alphabetical order to print the o/p based on the keys.
		
		 TreeMap tm = new TreeMap(); // TreeMap will follow the alphabetical order to print the o/p based on the keys
			
			tm.put("name", "Joseph");
			tm.put("dob", "20th jan");
			tm.put("nick name", "Joseph");
			
	        Set s1 = tm.keySet(); // In order to retrieve all keys we should store all key in one variable i.e 's'. Here we shoud use Set Interface only because Set wont accept the duplicate values.
			
			Iterator it1 = s1.iterator();
			while(it1.hasNext()) {
				Object obj = it1.next(); // We are storing the values in obj
				
				String str = (String)obj; // Directly We can not print the object in the so we are changing that obj into string. 
				
				//System.out.println(str); //If we give like this it will print the only keys
				
				System.out.println(str+ ":"+tm.get(str)); //To print the values with the keys.
			}
			
			
			                        //HashTable//
			// HashTable is synchronized. At a time only one thread can access the object this is the only diff compare with othe classes.
			
			
			
			
			
	}
	
      

}
