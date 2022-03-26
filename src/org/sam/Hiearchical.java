package org.sam;

/* Heiarchical inheritance means create 1 or more child class from one parent class.
   So we have to create an object for every class becasuse every child class will be inherited 
   from the parent class only*/
 

public class Hiearchical {
	public static void main(String[] args) {
		Dog obj= new Dog();
		obj.bark();
		Cat obj1 = new Cat();
		obj1.meow();
		Animal obj3 =new Animal();
		obj3.eat();
	}

}
class Animal{
	void eat() {
		System.out.println("Eating");
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("Meow");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}