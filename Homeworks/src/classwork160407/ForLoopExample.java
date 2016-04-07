package classwork160407;

public class ForLoopExample {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
// одно и тоже		
		int j = 0;
		while (j < 10) {
			System.out.println(j);
			j++;
		}
		
		for (int k = 9; k >= 0; k--) {
			System.out.println(k);
		}

//		for (;;) {
//			System.out.println("hihi");     бесконечный цикл (аналог while (true))
//		}
		
	}

}
