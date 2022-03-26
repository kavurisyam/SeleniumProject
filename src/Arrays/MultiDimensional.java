												//Multi dimensional Array//

// 1) In Java, a multi-dimensional array is nothing but an array of arrays
// 2) 2D array − A two-dimensional array in Java is represented as an array of one-dimensional arrays of the same type.
// 3) Mostly, it is used to represent a table of values with rows and columns − Int[][] myArray = {{10, 20, 30}, {11, 21, 31}, {12, 22, 32} } 

package Arrays;

public class MultiDimensional {
	public static void main(String[] args) {
		
		//int arr[][] = new int[2][2];
		//arr[0][0]=1;
		//arr[0][1]=2;
		//arr[1][0]=3;
		//arr[1][1]=4;
		
		//Another process to create an Array
		//--------------------------------
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int []x : arr) {
			for(int y:x) {
				System.out.print(y+ " ");
			}
			System.out.println();
		}
	}

}
