									//Throw//
// Throw:

// 1) The java throw keyword is used to explicitly throw an exception from a method or any block of code.
// 2) we can throw either checked or uncheked exception in java by throw keyword.
// 3) The throw keyword mainly used to throw custom exceptions.



package Exception;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		validate(19);
		System.out.println("Program successfully completed");
	}
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Your are not eligible for vote");
			}
		else {
			System.out.println("You are eligible for vote");
			
		}
		
	}
	

}
