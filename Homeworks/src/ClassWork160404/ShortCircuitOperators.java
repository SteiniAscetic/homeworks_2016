package ClassWork160404;

public class ShortCircuitOperators {

	public static void main(String[] args) {
		
		int x = 5, y = 3;
		
		boolean r = x < y & (x = 10) < y;
		
		System.out.println(x);

	}

}
