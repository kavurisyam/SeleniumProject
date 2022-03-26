                                     //Different types of methods in ArrayList//


package Collections;
import java.util.*;

public class CollectionDemo3 {
	public static void main(String[] args) {
		
		List<String> al1 = new ArrayList<>();
		
		al1.add("sam");
		al1.add("John");
		al1.add("Moses");                  
		al1.add("Paul");
		al1.add("David");
		
	    //al1.add(2, "Daniel"); // here 2 is index position "Daniel" is element, It is used to insert the specified element at the specified position in a list.
	    al1.add("sam");
	    al1.add("John");
	    
	    //al1.remove(4);
	    //al1.remove("Moses"); // we can give the element name also
	    
	    //al1.set(4, "Melky"); // To replace the new element in particular index position
	    
	    //al1.add("david"); //This letter starting with lower case
	    
	    //al1.sort(String.CASE_INSENSITIVE_ORDER); //To print the elements in alphabetical order.
	    
	    //al1.sort(Comparator.naturalOrder()); //To print the lower case letters separtely.
	    
	    //System.out.println(al1.subList(2,6)); // To print the elements between the 2nd index position to 6th index position but it wont print the 6th position of the element. 
	    
	    //List<String> al2 = new ArrayList<>();
		
		//al2.add("Melky");
		//al2.add("samson");
		//al2.clear();        //If we use clear here the above 2 elements will be deleted from this list.
		//al2.add("Peter");                  
		//al2.add("John");
		//al2.add("Philip");
	    //al2.addAll(al1);    //addAll method is used to copy the one List elements to another list.
	    //al2.addAll(1,al1);  //Index based all method.
	    //al2.clear();        //clear the all elements from list.
	    
        //List<String> al3 = new ArrayList<>();
		
		//al3.add("sam");
		//al3.add("John");
		//al3.add("Moses");                  
		//al3.add("Paul");
		//al3.add("David");
		//al3.add(2, "Daniel");
		
		//System.out.println(al1.equals(al3)); // True printed in the o/p because both al1 and al2 have the same elements and in same order and no of elements also same. If we change the order of the elements it will print false only.
		
	    //System.out.println(al1.isEmpty()); //isEmpty method is used for whether the list is empty or not if there is no elements in the list it will show True.
	    
	    //System.out.println(al1.lastIndexOf("sam")); // O/p is 0 useful for to find inex position of the element
	    
	   // System.out.println(al1.lastIndexOf("sam")); //O/P is 6 because List allows the duplicate values so i have added another "sam" element in 6 the index position so lastIndex will find the lastIndex position only so it shown 6.
	    
	    //System.out.println(al1.indexOf("sam"));   // O/P is 0 indexOf is useful for to find the first element from the list even it has duplicate values.
	   
	    //System.out.println(al1.indexOf("John"));  // O/P is 1 becasue indexOf take the first element from the list.
	    
	    //System.out.println(al1.contains("Paul")); // O/P is True because "Paul" is present in that list. 	
	    
	    //System.out.println(al1);
	    
	    //for(String s:al1) {
	    	//System.out.println(s);
	    //}
	    //System.out.println();
	   
	    //for(String x:al2) {
	    	//System.out.println(x);
	    //}
	    
	    
		
	}
	
	

}
