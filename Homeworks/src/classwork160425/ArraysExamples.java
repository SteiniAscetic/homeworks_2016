package classwork160425;

public class ArraysExamples {

	public static void main(String[] args) {
		
		int[] x = new int[3];
		int[] a = new int[0];
		
		System.out.println(x.length);
		System.out.println(a.length);

		System.out.println("----");
		
		int b[];
		
		b = new int[] {1, 2, 3};
		
		int c[] = b;
		
		b[1] = 10;
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
	}

}
