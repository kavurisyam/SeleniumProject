                          //Vector//

package Collections;
import java.util.Vector;

// Initially Vector default capacity is 10 but we can change the capacity by using Vector(size ex:30). depends upon the size of the elements Vector will double the capacity.

// Diff b/w ArrayList and Vector:
//--------------------------------
// Array list will increase the capacity only 50%, But Vector increase the capacity to double(100%)
// Not much memory loss in ArrayList, But memory loss will be happen in Vector because if we add the 11 elements size will get double menans capacity wil increase to 20 so rest of the 9 elements memory will be waste if we do not use.
// ArrayList not synchronized(multiple threads can access the object at a time) no thread safe. But Vector synchronized only one thread can access at a time
public class CollectionDemo6 {
	public static void main(String[] args) {
		 Vector v = new Vector();
		 v.add("sam");
		 v.add("Moses");
		 v.add("Paul");  // I have added 3 elements here and O/P  shown as 10
		 v.add("sam");
		 v.add("Moses");
		 v.add("Paul");
		 v.add("sam");
		 v.add("Moses");
		 v.add("Paul");
		 v.add("sam");
		 v.add("Moses");
		 v.add("Paul");  // I have added more than 10 elements here and O/P shown as 20
		 v.add("Paul");
		 v.add("sam");
		 v.add("Moses");
		 v.add("Paul");
		 v.add("Paul");
		 v.add("sam");
		 v.add("Moses");
		 v.add("Paul");
		 v.add("Paul");
		 v.add("sam");
		 v.add("Moses");
		 v.add("Paul"); //I have added more than 20 elements here and O/P shown as 40 means If we add more than 10 capacity will increase to 20. If we add more than 20 capacity will increase to 40.
		 
		 System.out.println(v.capacity());
		 System.out.println(v.size());  // to find the how many elements present in that Vector
	}

}

//  Vector v = new Vector(5); => If we mention like this  initially Vectro size is 5 so if we add more than 5 elements capacity will increase to 10;

//  But if we dont want want to increase the capacity to double just I want to increase the capacity to only 7 then we should as below.

//  Vector v = new Vector(5,2); => so after inserting the 5 elements capacity will increase to 7 only without wasting memory like wise we can adjust the memory.
