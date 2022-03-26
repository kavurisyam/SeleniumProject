
public class Sample {
public static void main(String[] args) {
	String s1 = "Hello welcome to java class";
	String[] x = s1.split(",");
	for(int i=0;i<x.length;i++) {
		System.out.println(x[i]);
	}
	String s2 = "Hello java";
	String[] s3 = s2.split("v");
	System.out.println(s3.length);
	String m= s2.substring(1, 6);
	System.out.println(m);
	
	int m1 = s2.indexOf("j");
	System.out.println(m1);
}
}

