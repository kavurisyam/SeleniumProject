import java.util.Scanner;


// Planidrome Number: A palnindrome Number is a number that remains the same when its digits are reversed. Like 16461

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num: ");
		
		int num= sc.nextInt();
		int org_num= num;
		
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num== rev) {
			System.out.println(org_num+" Plaindrome Number");
		}
		else {
			System.out.println(org_num+" Not Plaindrome Number");

			
		}
	}

}
