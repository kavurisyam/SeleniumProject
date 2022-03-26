
                                                         // Throws//

// 1) Throws is a keyword in java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions.
// 2) The caller to these methods has to handle the exception using a try catch block.
// 3) It is designed to transfer the responsibility of exception handling to its caller.
// 4) Throws is used with checked exceptions (Compile time only)

package Exception;

public class ExceptionDemo3 {
	static void display() throws ArithmeticException{
		int a=3/0;
		System.out.println(a);
	}
	public static void main(String[] args) {
		try {
			display();
			}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("Successfully printed");
		
	}
	
	

}
