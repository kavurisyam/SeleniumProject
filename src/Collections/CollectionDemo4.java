                              // How to add the group of objects to the ArrayList//

package Collections;
import java.util.*;

class Student{
	int rollno;
	String name, address;
	
	Student(int rollno, String name, String address){
	this.rollno=rollno;
	this.name=name;
	this.address=address;
	}
}

public class CollectionDemo4 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student(1,"Sam","Vizag"); 
		Student s2 = new Student(2,"Giri","Srikakulam");
		Student s3 = new Student(3,"Shankar","Vijayawada");
		Student s4 = new Student(4,"Jagadish","Hyderabad");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for(Student s: list) {
			System.out.println(s.rollno+" "+s.name+" "+s.address);
		}
		
		
		
		 
	}

}
