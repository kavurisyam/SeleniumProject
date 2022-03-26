                                           //StringBuilder//

/* 1) We can apply the all methods for StringBuilder too what ever we applied for StringBuffer.

 Diff b/w StringBuffer and StringBuilder: 1) StringBuffer(Synchronized) is thread safe only one thread at a time can acces. 
										  2) StringBuilder(Non-synchronized) not-thread safe Many threads can access at a time.

  For security purpose we can use the StringBuffer      */



package String;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Welcome to PTIT");
		
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuilder s1 = new StringBuilder("Welcome to builder");
		
		System.out.println(s1.append("in java"));
		
		
	}

}																								
