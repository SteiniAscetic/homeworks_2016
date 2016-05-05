package classwork160505;

public class FindMax {

	public static void main(String[] args) {
		
	int[] a = {10, 2, 45, -5, 80, 4};
	
	int m = findMaxElementIndex(a);
		
	System.out.println(m);
	System.out.println(a[m]);
	
		
	}

	private static int findMaxElementIndex(int[] a) {
		
		
		if (a == null) {
			return -1;
		}
		if (a.length == 0) {
			return -1;
		}
		
		int IndexOfElementWithMaxValue = 0;
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[IndexOfElementWithMaxValue]) {
				a[i] = a[IndexOfElementWithMaxValue];
			}
		}
		
		
		return IndexOfElementWithMaxValue;
	}
}
