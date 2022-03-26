
public class Reverse {
	public static void main(String[] args) {
		int num=1234;
		int rev =0;
		
		while(num!=0) {
			rev=rev*10+num%10; //0*10+1234%10=>0+4=4   4*10+123%10=>40+3=43  43*10+12%10=>430+2=432  432*10+1%0=>4320+1=4321
			
			num=num/10;  //1234/10=123   123/10=12   12/10=1  1/10=0
			}
		
		System.out.println(rev);
		
	}

}
