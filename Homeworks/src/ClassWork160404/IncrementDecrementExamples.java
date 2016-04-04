package ClassWork160404;

public class IncrementDecrementExamples {
	
	public static void main(String[] args) {
		
		int counter = 0;
		
		System.out.println(counter);     // 0
		System.out.println(++counter);   // 1 
		System.out.println(counter);     // 1
		System.out.println(counter--);   // 1
		System.out.println(counter);     // 0
		
		
		int x = 3;                       // Standart test on Exam
		
		int y = ++x * 5 / x-- + --x;     // ((4 * 5) / 4) + 2   
		System.out.println("x=" + x);    // x = 2
		System.out.println("y=" + y);    // y = 7
		
		x++;
		
//		x+3;   ERROR(!!!)
		
		
		
	}

}
