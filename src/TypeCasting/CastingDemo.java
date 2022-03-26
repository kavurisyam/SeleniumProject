											//Type Casting//

// 1) Typecasting or changing values from one data type to another data type.
// 2) These are 2 types 1.Widening 2.Narrowing
//Widening: Smaller primitive type value can store in bigger primitive data type: Byte to Int
//Narrowing: Bigger primitive data type value will be store into smaller primitive data tyep ex: Double to Int. (Data loss will occur in this

package TypeCasting;

public class CastingDemo {
	public static void main(String[] args) {
		//int x=10;       
		//double y=x;   //Here we are storing int value into double so it'possible this called widening.
		
		//Note: double x=10.7;
		//      int    y=x;     O/p is Error we can not store the bigger primitive value in smaller primitive. to overcome this issue we can use Narrowing.
		
		//double x=10.7;
		//int y=(int)x;   // This is called Narrowing but data loss will occur here .7 value not printed in the o/p.
		
		//System.out.println(x); //o/p is 10.7 
		//System.out.println(y); //o/p is 10
		
		int x=67;
		char y=(char)x;
		System.out.println(x);
		System.out.println(y); //o/p is C
		
		
	}
	

}
