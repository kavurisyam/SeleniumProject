package Polymorphism;

/*Compiler (over loading) method same but diff sign and return type
  Run time (Overriding) metho name same sign also same and same return type

Over loading:
-------------
metod name same,diff sign, diff or same return type, use this for instance,static,main and consructors,
we can use this either same class or child class,call it as static/early binding, jvm compilation.
Overriding  : 
----------
method name,sign,returntype also same, we can apply for instance methods only,one method should be 
parent class one method should be in child class, dynamic/late binding, jvm run time.

Method Overriding: 
-----------------
1)Declaring a method in sub class which is already present in parent class is known as method overriding.
2)Overriding means to override the functionality of an existing method.
3)It is an example of run time polymorphism(means it will execute the method depends upon object creationn of a class. 
  if object creation for child class it wil call the child class If object creation for parent class it will call the parent class)
4)Static and final methods cannot be overridden as they are local to the class. */

public class Overriding {
	public static void main(String[] args) {
		Overriding d = new Overriding();
		d.msg();
	}
	void msg() {
		System.out.println("Parent method");
		
	}

}
class Demo extends Overriding{
	void msg() {
		System.out.println("Child method");
	}
}
