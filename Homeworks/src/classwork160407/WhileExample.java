package classwork160407;

public class WhileExample {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		// i, j, k, l, m, n
		
		int i = 0;
		
		while (i < 10) {
			i = i + 1;                 // важно в цикле указывать изменения с переменной
			System.out.println(i);
		}
		
//		while (true) {     
//			System.out.println("hoho");       бесконечный цикл
//		}
	}

}
