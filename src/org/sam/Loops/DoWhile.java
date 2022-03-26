/* 1) The Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true.
   2) If the number of iteration is not fixed and you must have to execute the loop at least once, 
      it is recommended to use a do-while loop. Java do-while loop is called an exit control loop*/

package org.sam.Loops;

public class DoWhile {
	public static void main(String[] args) {
		int i=4;//Even if we give the i=4  "hello" will be printed at least once
		do {
			System.out.println("hello");
			i++;
		}
		while(i<3);
	}
	

}
