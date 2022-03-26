											//Arrays//

/* What is Arrray: An array is a container object that holds a fixed number of values of a single type.

   1)Java provides a data structure, the array, which stores a fixed-size sequential collection of elements of the same type. 
   2) An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.
   3) We ca print the Arrays o/p in two ways 1.forLoop 2.forEach. mostly forEach loop is using.*/

package Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		//int arr[]= new int[5];   // we can take any name instead of 'arr'. Here 5 is length of the arrray so it can store only upto 5 values with same data type.
		//arr[0]=5;
		//arr[1]=3;
		//arr[2]=4;
		//arr[3]=9;
		//arr[4]=7;
		//for(int i=0; i<arr.length; i++) {  //forLoop process
			//System.out.println(arr[i]);
			
		//}
		
		//for(int x:arr) {            // forEach loop process we can give any name instead of 'x'
			//System.out.println(x);
		//}
		
		// Antoher process to create Array in single line
		//................................................
		
		
		int arr[]= {1,2,3,4,5};
		for(int x:arr) {
			System.out.println(x);
		}
		
		
	}

}
