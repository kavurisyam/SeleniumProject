package Constructors;

public class Student {
	int a;
	char i;
	float b;
	public static void main(String[] args) {
		Student s1 = new Student();
		//System.out.println(s1.a); // If we give like this jvm will create one zero para constructor and shows o/p as 0 because we given int.
		System.out.println(s1.i);   // space will be print in the o/p
		System.out.println(s1.b);  //0.0 will be print in the o/p
		
		//s1.display();
	}
	
	Student(){
		a=10;
		System.out.println(a);  // with out creating another method we can directly print the 'a' value
	}
	//void display() {  // We can print the o/p  by creating the method and with out method also we can create the constructor value.
		//System.out.println(a);  // o/p is 10
	//}

}
 