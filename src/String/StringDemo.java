/* 1.String is useful to store the group of characters.
   2.String is a predefined class.
   3.We can create the string in 2 ways   */


package String;

public class StringDemo {
	public static void main(String[] args) {
		   String s1= new String("Hello sam");   //If we print the String value by using object this will be saved into 'heap memory'
		
		    String s2= "Welcome to string";  //This will be saved in String constant pool     */
		
		String s3= new String("abc");
		String s4 = "ABC";
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s1.length()); // To print the size of the string  Note: 'length' is a method name
		//System.out.println(s2.length());
		System.out.println(s1.charAt(3)); // To print the particualr index postion from the string.
		System.out.println(s1.concat(s2)); // To concat the s1 with s2
		System.out.println(s2.concat(s1)); // To concat the s2 with s1
		
		System.out.println(s3.equals(s4));             // O/P is false
		System.out.println(s3.equalsIgnoreCase(s4));   // O/P is True because we Ignore the case.
		
	}

}
