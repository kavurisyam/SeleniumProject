										//Map Interface//

// 1) Map is useful to store the key values.
// 2) Map contains 4 types of implementation classes those are 1.HashMap 2.LinkedHashMap 3.TreeMap 4.HashTable
// 3) Key should be unique(means do not allow identical names) but values can be same.
// 4) HashMap has KeySet method by using this we can retrieve all  keys in the HashMap.

package Collections;
import java.util.*;

public class CollectionDemo10 {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("name", "Joseph");
		hm.put("dob", "20th jan");
		//hm.put("name", "David");   //We have given the same key here so it will delete the first values and shows second value.
		hm.put("nick name", "Joseph"); //But it accepts the same type of values.
		
		//hm.remove("name"); To remove any keys
		
		//System.out.println(hm.get("name")); // We can get the value by passing key
		
		//System.out.println(hm.size()); To know the size of the class
		
		//System.out.println(hm.isEmpty()); To know the whether the hashmap contains values or empty
		
		Set s = hm.keySet(); // In order to retrieve all keys we should store all key in one variable i.e 's'. Here we shoud use Set Interface only because Set wont accept the duplicate values.
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next(); // We are storing the values in obj
			
			String str = (String)obj; // Directly We can not print the object in the so we are changing that obj into string. 
			
			//System.out.println(str); //If we give like this it will print the only keys
			
			System.out.println(str+ ":"+hm.get(str)); //To print the values with the keys.
		}
		
		
		  //System.out.println(hm);
		
		
		
		
	}

}
