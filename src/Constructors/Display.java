										//Constructors//

// 1) It is a special type of method.
// 2) It is a block of code which is  used to initialize an instance variable.
// 3) Name must be same as class name.
// 4) It can not contain return type.
// 5) It will execute during object creation time.
// 6) It will execute one time for every object created.
// 7) It can contain any number of parameters.
//       i)zero parameter  ii) parameter
// 8) A class can contain any number of constructors.
// 9) We can create any no of constructors but that should be diff like no of parameters shoul be diff or type of parameters should be diff.




package Constructors;

public class Display {
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2= new Display();  // Hello sam second time printed
		Display d3= new Display();  // Hello sam third time printed means it will execute one for every object created.
		Display d4 = new Display(1,"sam");
	}
	
	Display(){   //Zero para 
//For example if we give 'void Display' this would be one method it wont show any error but Hello sam will not be printed in the o/p because that is not constructor 
		System.out.println("Hello sam");
	}
	
	Display(int i, String name){ //parameterised constructor
		System.out.println("Hi");
	}
	

}
