package Polymorphism;

/*Polymorphism:If a single entity shows multiple forms or multiple behaviors then it is called polymorphism

  Method overloading: To process of specifying multiple methods, having different signature with the same method name 
                      is called as method overloading.
                    
  Use of MO: Method overloading increases the readability of the program. This provides flexibility to programmers 
             so that they can call the same method for different types of data. This makes the code look clean

 Note: we can apply the MO process in Main class or child class*/

//Instance method process:

public class MethodOverloading {  //compiler time polymorphism.
	void add(int x,int y) {
		System.out.println("Result1:"+(x+y));
	}
	void add(int x,int y,int z) { //When compare with 1st method no.of parameters are different
		System.out.println("Result2:"+(x+y+z));
	}
	void add(int x,double y) { //When compare with 1st method type of parameters are different
		System.out.println("Result3:"+(x+y));
	}
	void add(double x,int y) {  //When compare with 3rd method order of parameters are different
		System.out.println("Result1:"+(x+y));
	}
		
//Static method process:	
	
	static void show(int x) {
		System.out.println("Welcome to int parameters");
	}
	static void show(double x) {
		System.out.println("Welcome to double parameters");
	}
	
// Main method process:
	public static void main(int[] args) {
		System.out.println("int array");
	}
	public static void main(int args) {
		System.out.println("int parameters");
	}

// Constructor method process:
	
	MethodOverloading(){  //Method overloading is constructor name we have created class name as MO while creating class so here constructor name also same as Classs name
		System.out.println("Zero parameter const");
	}
	MethodOverloading(String name){
		System.out.println("My name is :"+name);
		
	}
	
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(20, 30);
		obj.add(20, 30, 50);
		obj.add(20, 30.5);
		obj.add(25.5, 20);
		show(5);
		show(5.2);
		main(new int[] {4,5,6,7});
		main(12);
		MethodOverloading M = new MethodOverloading();
		MethodOverloading S = new MethodOverloading("samson");
		
	}

}
