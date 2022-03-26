											// User defined Exceptions//

// 1) Create new Exception class extending Exception class.
// 2) Create a public constructor for a new class with string type of parameter.
// 3) pass the string parameter to the super class.
// 4) Declare the method level at the exception level.
// 5) Create try block inside that create a new Exception and throw it based on some condition.'
// 6) Write a catch block and use some predefined exceptions.
// 7) Write the optionally finally block.


package Exception;

public class ExceptionDemo4 extends Exception {  //extends Exception or extends RuntimeException both same.  most of the people uses Exception in the end i.e Demo4Exception.
	public ExceptionDemo4(String str) {
		super(str);
	}
	public static void main(String[] args) throws ExceptionDemo4 {
		try {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int age = sc.nextInt();
		if(age<18) {
			throw new ExceptionDemo4("Your are not eligible for vote");
		}
		else {
			System.out.println("You are eligible for vote");
		}
		}
		catch(ExceptionDemo4  ed) {
		ed.printStackTrace();
		}
		
	}

}
