import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		 int num= sc.nextInt(); //User entered value will be store in this num
		//Ex: User entered 1234  we can enter any number but that value should be /10 and %10
		 
		 //If user enters word instead of Int value then we should use below
		 
		 //String str = sc.next(); // It will accept the word like ABCK, SAM, GIRI...etc
		
		// 1st way: Using Algorithm
		
		 int rev=0;  //Initially rev value is 0
		while(num!=0) {
			rev=rev*10+num%10; //0*10+1234%10=>0+4=4   4*10+123%10=>40+3=43  43*10+12%10=>430+2=432  432*10+1%0=>4320+1=4321
			
			num=num/10;  //1234/10=123   123/10=12   12/10=1  1/10=0
			}
		
		
		// 2nd way: Using String Buffer class
		
		/*StringBuffer sb= new StringBuffer(String.valueOf(num)); // Here we are converting user value into String format
		StringBuffer rev=sb.reverse();*/
		
		
		// 3rd way: String Builder
		
//		StringBuilder sbl = new StringBuilder();
//		sbl.append(num);
//		StringBuilder rev = sbl.reverse();
//		
//		
		System.out.println("Reverse Number:" +rev);
		
		
		// Another method to print the o/p
		
		/*public class ReverseNum{
		    public static void main(String[]args){
		        
		        String str = "ABCD";
		        String rev = "";
		        
		        int len = str.length();
		        
		        for(int i=len-1;i>=0;i--){
		            rev = rev+str.charAt(i);
		        }
		        System.out.println("The reverse Num is:" + rev);
		        
		    }
		}*/
		
			
		
		
	
	}

}
