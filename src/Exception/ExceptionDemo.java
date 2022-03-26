											//Exception handling//

// 1) The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors. 
//    so that the normal flow of the application can be maintained.

// 2) Exception handling ensures that the flow of the program doesn't break when an exception occurs. 
//    For example, if a program has bunch of statements and an exception occurs mid way after executing certain statements 
//    then the statements after the exception will not execute and the program will terminate abruptly.

// Exceptions are 2 types: 1) Checked exceptions 2) Unchecked exceptions
// Checked Exceptions: 1)try 2)catch 3)throw 4)throws 5)finally

package Exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Today our topic is exception handling"); //This will be printed in the o/p. after this execution will get stopped. run time error occured in the o/p.
																	 // once the exception occured rest of the statements will not printed. For this we have to use try.
		
		
		try {
		int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace(); // This method is useful for to know why that exception occured and in which line occured and in which class occured 
			                      //and in which program occured and what is that exception name and method name to know these all.
			
			//System.out.println(ae.toString()); //exception name, reason
			
			//System.out.println(ae.getMessage()); // reason
			
			// Note: Above all methods are pre defined methods 
		    //if user wants to give the exception in his own then we can call them as user defined exceptions for that we can give the exception sopln("our own comment")
		       
			System.out.println("You can not divide a number with 0");
		}
			finally {
				System.out.println("from finally block"); // Even the exception occured at the c=a/b this will be printed in the o/p once.
				                                          // Due to there is no "catch" to handle that exception rest of the statements will not printed in the o/p.
				
			}
		
		
		
		//System.out.println(c);  //Compile time Error: Exception in thread "main" java.lang.Error: Unresolved compilation problem: c cannot be resolved to a variable
		
		//System.out.println(c); // If we give like this compilation will be succeed but run time will get error
		                       // Error: Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		System.out.println("Welcome to programming tutorials in telugu");
		System.out.println("by kotha Abhishek");
		
	}
}
