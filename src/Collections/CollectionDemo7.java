                                    //Stack//

//Stack follows the LIFO(Last in first out) process.

//Stack methods are: 1)push() 2)pop() 3)peek() 4)empty() 5)search()

package Collections;
import java.util.Stack;	

public class CollectionDemo7 {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(0);
		
		//System.out.println(s); // O/P is 5,4,3,2,1,0
		
		//s.pop();
		//System.out.println(s);  // O/P is 5,4,3,2,1 (pop() will removes last in elements means 0 is the last in element) This is called LIFO.
		
		//System.out.println(s.peek()); // O/P is 0 it will print the last element.
		
		//System.out.println(s.empty()); // Stack contains elements so O/P shown as false
		
		System.out.println(s.search(3));  // O/P is 4 Newly added elements will be inserted on the top 3 presented in the 4th position
	}

}
