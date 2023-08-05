package Practice;

public class MathTests {

	public static void main(String[] args) {
		float z = 15.67f;
		double d = 67.87;
		int x = 10;
		int y = 3;
		byte b = 25;
		int k = 2000000;
		System.out.println(x/y);
		System.out.println(x % y);
		System.out.println(z/y); // float / int gives float
		System.out.println(z/d); // float / double gives double
		System.out.println(d % x); 
		System.out.println(k/b); // int / byte gives int value

	}

}
