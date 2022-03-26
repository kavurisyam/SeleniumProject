package org.sam;

/* Interface is just like a super class it contains final variable and abstract methods only

   Multiple Inheritance does not support in java, In order to implement the multiple Inheritance through Interface 
   only we can implement.

   Interface also work like class only
   
   MI:Multiple inheritance means that a subclass can inherit from two or more superclasses. */

public class Interface {
	public static void main(String[] args) {
		sam e = new sam();
		e.emp();
	}

}
interface Robo{
	 final  int Ecode=10;
	 abstract void emp();
}
class sam implements Robo{
	public void emp() {
		System.out.println("E code="+Ecode);
		System.out.println("Ename=Robo");
		
	}
}
