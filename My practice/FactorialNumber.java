
// Factorial Number: A factorial is function that multiplies a number by every number below it.
// Ex: 5! = 5*4*3*2*1=120 OR 1*2*3*4*5=120	

public class FactorialNumber {
	public static void main(String[] args) {
		int num =5;
		long factorial =1;
		
		for(int i=1;i<=num;i++) {
			factorial = factorial*i;
			
		}
		System.out.println("Factorial of a Number is:" + factorial);
		
	}
	

}
