                              //LinkedList//

package Collections;
import java.util.*;

class Student1{
	int rollNo;
	Student1(int rollNo){
		this.rollNo=rollNo;
	}
	public String toString() {
		return " "+rollNo;
	}
}

public class CollectionDemo5 {
	public static void main(String[] args) {
		LinkedList<Student1> ll = new LinkedList<>();
		
		ll.add(new Student1(34));
		
		Student1 s2 = new Student1(25);
		ll.add(s2);
		
		Iterator<Student1> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	

}

//By using LinkedList we can use thes below methods also:

//add()
//add(index, element)
//addFirst()
//addLast()
//clear()
//get()
//getFirst()
//getLast()
//remove()
//removeFirst()
//removeLast()
//size()
