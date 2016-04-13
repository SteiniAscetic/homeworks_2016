package Homework;

public class NumberToBit {

	public static void main(String[] args) {
		
		int x = 8;
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));
				
		while (x % 2 == 0) {
			x = x >> 1; 
				System.out.println(0);
		}
		
		System.out.println(1);


	}

}
