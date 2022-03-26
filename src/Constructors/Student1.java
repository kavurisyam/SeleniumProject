package Constructors;

public class Student1 {
	int rollno;
	String name;
	String branch;
	public static void main(String[] args) {
		Student1 s1= new Student1(7,"sam");
		Student1 s2= new Student1(8,"Giri");
		Student1 s3= new Student1(9,"Shankar");
		Student1 s4= new Student1("ECE");
		Student1 s5= new Student1(7,"sam","ECE");
	}
	
	Student1(int x, String n){
		rollno=x;
		name=n;
		System.out.println("Name:" +name+ " Rollno:"+rollno );
	}
	
	Student1(String b){
		branch=b;
		System.out.println(branch);
	}
	
	Student1(int x, String n, String b){
		rollno=x;
		name=n;
		branch=b;
		System.out.println("Name:" +name+ " Rollno:"+rollno+ " Branch:" +branch);
	}

}
