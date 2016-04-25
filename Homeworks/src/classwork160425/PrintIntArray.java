package classwork160425;

public class PrintIntArray {

	public static void main(String[] args) {
		
		int[] a = {10, 3, 4, 5, 6};
		
		for (int i = 0; i < a.length; i++){
			System.out.println("a[" + i + "]=" + a[i]);
			
		}
		
		int[] x = new int[10];
		
		for (int i = 0; i < x.length; i++){
			System.out.println("x[" + i + "]=" + x[i]);			
		}
		
		boolean b[] = new boolean[3];
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		String s[] = new String[4];
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		for (int i = 0; i < x.length; i++) {
			x[i] = i;
			System.out.println(x[i]);
		}
		
	}
	
}
