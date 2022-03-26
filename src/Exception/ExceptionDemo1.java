// For single try block we can create multiple "catch" blocks. but only one catch block will be executed in the o/p.
// For single try block only one finally block is possible.
package Exception;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		
		//try {
			//int arr[] = {2,5};
			//arr[2] = 5; //ArrayIndexOutofBoundsException
			
			//arr[3] =3/0;//ArithmeticException(3/0 is is not possible so AE shown. it always check the firtst exception and shown in o/p)
			
			//arr[3] =3/1;//ArrayIndexOutofBoundsException(3/1 is possible so AIOOB shown)
			
			// Even we give the two exceptions here only first exception will printed in the o/p. if we remove the arr[2] ArithmetichException will be printed.	
		//}
		//catch(ArithmeticException ae) {
			//ae.printStackTrace();
		//}
		//catch(ArrayIndexOutOfBoundsException aioob) {
			//aioob.printStackTrace();
		//}
		//finally {
			//System.out.println("hi"); // we can create only one finally block for try block. 
		//}
		
		// If we want to print the more than one exception in the same time we have to use the try block inside the try block
		
		//try {
			//int arr[]= {2,6};
			//try {
				//arr[2]=3/0;
			//}
			//catch(ArithmeticException ae) {
				//ae.printStackTrace();   //ArithmeticException
			//}
			//arr[3]=7;
		//}
		//catch(ArrayIndexOutOfBoundsException a) {
			//a.printStackTrace(); //ArrayIndexOutOfBoundsException
		//}
		//try {
			//int arr[]= {1,3};
			//arr[4]=5;
		//}
		//catch(ArrayIndexOutOfBoundsException b) {
			//b.printStackTrace();
		//}
		
		// If we give the catch(Exception) it is a super class exception for all exceptions i.e ArithmeticException,ArrayIndexOutOfBoundsExceptions,etc......
		// we should give the catch(Excpetion) in last only. if we give the super class exception in starting error will be displayed like "Unreachable catch block"
		
		try {
			int arr[]= {2,5};
			arr[2]=7;
		}
		catch(ArrayIndexOutOfBoundsException a){ //sub class exception
			a.printStackTrace();
			
		}
		
		catch(Exception e) {  // super class exception
			e.printStackTrace();
		}
	}

}
