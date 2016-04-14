package classwork160414;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String s = "Hello, world!";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String name = "Mike";
		
		if (args.length == 0) {
			System.out.println("Enter name");
			return;
		}
		
		if (args[0].equalsIgnoreCase(name)) {
			System.out.println("Hello, Mike! How are you?");
		}

		if (args[0].startsWith("Mr.")) {
			System.out.println("Hello " + args[0]);			
		} else {
			System.out.println("Hi, buddy!");
		}
		
		System.out.println(s.endsWith("d!"));
		System.out.println(s.contains("d!"));
		System.out.println(s.contains("mom"));
		System.out.println(s.indexOf("mom") != -1);
		
		System.out.println(s.replace('o', 'O'));
		System.out.println(s.replace("Hell", "Ад"));
		
		System.out.println("abc".trim());
		System.out.println("   a   b   c   ".trim());   // removes white space
		
		System.out.println("\n\n\n\n\n\nhaha\n\n\n\n\n\n...");
		
	}

}
