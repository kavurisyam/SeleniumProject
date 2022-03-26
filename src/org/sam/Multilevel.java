          								//Multi Level inheritance//

//  It is a process of creating one sub class from already derived class.


package org.sam;

public class Multilevel {
	public static void main(String[] args) {
		Divide obj = new Divide();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}

}
class Add{
	int a=15,b=10;
	void add() {
		System.out.println(a+b);
	}
}
class Sub extends Add{
	void sub() {
		System.out.println(a-b);
		
	}
}
class Mul extends Sub{
	void mul() {
		System.out.println(a*b);
	}
}
class Divide extends Mul{
	void div() {
		System.out.println(a/b);
	}
}
