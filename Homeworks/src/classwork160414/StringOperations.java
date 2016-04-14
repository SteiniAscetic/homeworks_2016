package classwork160414;

public class StringOperations {

	public static void main(String[] args) {
		
		// Concatenation
		
		System.out.println("Hello" + "World");
		
		System.out.println("x=" + 200);
		
		String s = "x=" + 200;
		
		System.out.println(s);
		
		for (char c : s.toCharArray()) {
			System.out.println((int)c);
		}
		
		System.out.println(1 + 2);
		System.out.println('A' + 'B');
		System.out.println("A" + 'B');
		System.out.println('A' + "B");
		System.out.println(1 + "B");
		System.out.println(1 + 2 + "B");
		
		int i = 1;
		int j = 2;
		System.out.println("" + i + j + "B");
		
		s += "...";  // s = s + "..."
		
		s += 10;
		
		System.out.println(s);
		

	}

}
