package classwork160407;

public class IfErrors {

	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("No args!");
			System.exit(1);
		}
		
		System.out.println("args[0]=" + args[0]);

		
		int x = 1;
		
//		if (x) {    Error!!!
//			// ...
//		}
		
		
		
//		if (x = 2) {   Error!!!
//			// ...
//		}
		
		if (2 == x) {
			// ...
		}
		
	}

}
