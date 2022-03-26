											//StaticMethods//

//Collections have some static methods those are 1)sort() 2)reverse() 3)swap() 4)min() 5)max()

package Collections;
import java.util.*;

public class StaticMethods {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(56);
		al.add(23);
		al.add(67);
		al.add(89);
		
		System.out.println(al);
		
		//Collections.sort(al);  //sort method is useful for to sorting the values.
		//System.out.println(al); 
		
		//Collections.reverse(al);
		//System.out.println(al); //To print the o/p in reverse direction
		
		//Collections.swap(al,1,3);
		//System.out.println(al);  // To inter change the positions of 1st and 3rd index positions
		
		//System.out.println(Collections.min(al)); //To print the min value
		
		System.out.println(Collections.max(al));  // To print the max value
		
		
	}

}
