package Polymorphism;

public class MvChildclass {
	public static void main(String[] args) {
		sample1 p = new sample1();
		p.display();
		p.display("sam");
		p.display(10);
	}
	void display() {
		System.out.println("Parent class");
	}
	}
class sample extends MvChildclass{
	void display(String x) {
		System.out.println("child class");
	}
}
class sample1 extends sample{
	void display(int x) {
		System.out.println("Sub child class");
	}
}
