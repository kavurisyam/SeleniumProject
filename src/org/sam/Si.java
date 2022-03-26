/* Inheritance: Inheritance in Java is a concept that acquires the properties from one class to other classes.

 Single Inheritance: 1)It is a process of creating one sub class from one super class.
                     2)Single inheritance enables a derived class to inherit properties and behavior from a single 
                       parent class*/

package org.sam;

public class Si {
public static void main(String[] ags) {
	Emp obj = new Emp();
	System.out.println("Employee salary:"+(obj.salary+obj.bonus));
	

}
}
class Employee{
	float salary =50000;
}
class Emp extends Employee{
	float bonus =10000;
}
