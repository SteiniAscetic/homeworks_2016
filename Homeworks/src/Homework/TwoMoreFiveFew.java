package Homework;

import java.util.Arrays;

public class TwoMoreFiveFew {

	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("Usage: TwoFiveExample <number>");
			System.exit(0);
		}
		
		String argsList = Arrays.toString(args);
		
		System.out.println(argsList);		
		
		int x = Integer.parseInt(args[0]);
		
		if (x == 2) {
			
			System.out.println("Много");
		}
		if (x == 5) {
			
			System.out.println("Мало");
		}
		if (x == 1) {
			
			System.out.println("В самый раз!");
		}

	}

}
