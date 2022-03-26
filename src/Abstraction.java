											//Abstraction//

/* 
 Abstraction: Hiding the implementation part is called  abstraction
 
 It has 2 types:
 --------------
 1.partially abstraction(abstract class)
 2.Fully abstraction(interface)
 
 abstract class (concrete(non abstract) + abstract methods) :It is a restricted class that cannot be used to create objects 
 (to access it, it must be inherited from another class). 
 
 abstract method(only declaration)
 concrete class(only concrete methods)
 concrete methods (with body) (declaration & definition)
 */

public class Abstraction {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.diplay();
		d.sound();
		
	}
}
	abstract class Animal{       // Abstract class: 
		
		abstract void sound();   // Abstract method (Without abstract method also we can create abstract class)
		void diplay() {
			System.out.println("I am from Animal class");
		}
//		Animal(){                       //constructor process
//			System.out.println("const");
//		}
	}
	
	class Dog extends Animal{   // Inheritacne
		void sound() {          // method overriding (If the parent class have more abstract methods we have to override the all methods in child class)
			System.out.println("Barking");
		}
	}
	


