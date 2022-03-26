
public class StringBasic {
	public static void main(String[] args) {
		String s1 = "vengat";
		String s2 = "vengat"; // literal string(same value so its share the memory)
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String x1=new String("vengat");
		String x2=new String("vengat");// non literal string(its won't share, create new memory
		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));
		}
		}


