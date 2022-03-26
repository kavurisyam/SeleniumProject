											//Upcasting || Downcasting//

// 1) If a child class object is reffereed by a parent class reference i.e called Upcasting.
// 2) Downcasting will not work here because we can not convert parent class to child class.
     // with the reference of child class variable we can not create parent class object ex: child c= new parent(); ==> o/p Error


package TypeCasting;

class Parent{
	void show() {
		System.out.println("Parent class show method");
		
	}
	void display() {
		System.out.println("Parent class display method");
		
	}
}

class Child extends Parent{
	void show() {
		System.out.println("Child class show method");
		
	}
	void print() {
		System.out.println("Parent class display method");
		
	}
	
}

public class Upcasting {
	public static void main(String[] args) {
		//Parent p = new Parent();  // We have created the object for parent class
		//p.show();    // Parent class show method
		//p.display();  // Parent class display method
		
		//Child c = new Child(); // we have created object for child class we can access the parent class variables.
		//c.show();  //  Child class show method
		//c.display();  //  Parent class display method
		
		Parent p = new Child(); // Here object is created for child class but reference variable is for parent class this is called "Upcasting"
		p.show();  //Parent class show method (It is overrided means we have created for object for child class)
		p.display(); // Parent class display method
		
		
		
	}

}
