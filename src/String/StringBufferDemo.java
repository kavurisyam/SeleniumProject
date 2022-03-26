/* 													StringBuffer	

 1) Once we create String we can not change the values in that string so by using this StringBuffer we can modify it.
 2) But by creating object only we can use this StringBuffer Ex:StringBuffer sb = new StringBuffer("")    */

package String;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Hello sam");
		
		System.out.println(sb);
		
		System.out.println(sb.length());
		
		//System.out.println(sb.append(" Kavuri")); // By using the append we can add the extra data to the end of the string
		
		//System.out.println(sb.delete(1,3)); // By using  delete we can delete the group of characters
		
		//System.out.println(sb.deleteCharAt(5)); //By using deleteCharAt we can delete only particular index position.
		
		//System.out.println(sb.substring(1)); // It will print the o/p from index no 1
		
		//System.out.println(sb.substring(1, 4)); // It will print the o/p between index position between 1 and 4
		
		//System.out.println(sb.insert(6," kavuri ")); // To add the data from the 6th index position
		
		//System.out.println(sb.replace(0,5,"kavuri")); //To replace the data b/w the particular index positions
		
		//System.out.println(sb.reverse());
		
		
	}

}
