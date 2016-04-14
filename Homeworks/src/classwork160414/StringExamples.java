package classwork160414;

public class StringExamples {

	public static void main(String[] args) {
		
		char a = 'A';
		
		int i = 10;
		
		long l = 10_000_000_000_000L;
		
		int octal = 0100;
		
		int binary = 0b1100;
		
		int hexadecimal = 0xFF;  // 255   2^8 - 1
		
		String hello = "Hello, world!!!";
		
		String hi = new String("Hi!");
		
		String welcome = new String(new char[] {'W', 'e', 'l', 'c', 'o', 'm', 'e'});
		
		System.out.println(hello);
		System.out.println(hi);
		System.out.println(welcome);
		
		int c = a;
		System.out.println(c);
		
		c += 10;
		
		a = (char) c;
		
		System.out.println(a);
		

	}

}
