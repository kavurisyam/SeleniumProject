                               //Topic: ArrayList and ways to print the statements//

package Collections;
import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		CollectionDemo cd = new CollectionDemo();
		
          //List al = new ArrayList();	
		
//If we give only List it will support the all data types suppose if we want to store only one particular data type ex: String data type
//for that we have to mention as List<String> al = new ArrayList<String>(); or new ArrayList<>();
		
		List<String> al = new ArrayList<>();
		
		al.add("sam");
		al.add("John");
		al.add("Moses");                   //So if we use List<String> it wont accept the integer values. like al.add(25);
		al.add("Paul");
		al.add("David");
	
		 //==> Normal process:
		System.out.println(al);                
		
		  // ==> String process:
		for(String s:al) {                    
			System.out.println(s);
		 }
		
		//==> For loop process:
		for (int i=0; i<al.size(); i++) {       
			System.out.println(al.get(i));
		 }
		
		// ==> ListIterator process:By using this we can print the elements either in forward direction or reverse direction
		ListIterator<String> itr = al.listIterator();  
		System.out.println("In forward direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("In reverse direction");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		// ==> Iterator process:
		Iterator<String> itr1 = al.iterator();           
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		// ==> forEach process:
		al.forEach(a->{
			System.out.println(a);
		});
		
		// ==> forEachRemaining process:
		Iterator<String> itr2 = al.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
	}
 
}
