package demo4;


public class ComparatorToTest {
	public static void main(String[] args) {
		String s1 = "sam";
		String s2 = "devi";
		String s3 = "sam";
		 int     r = s1.compareTo(s2);
		System.out.println(s2.compareTo(s1));
		if(r==0) {
			System.out.println("String are same");
		}else {
			System.out.println("String are not same");
		}
	}
	}

