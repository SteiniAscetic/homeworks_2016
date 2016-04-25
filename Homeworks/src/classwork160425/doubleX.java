package classwork160425;

public class doubleX {
	
	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("Usage: DoubleX <some string with possible x>");
			System.exit(0);
		}
		
		System.out.println(doubleX(args[0]));
		
		
		System.out.println(doubleX(null));
		System.out.println(doubleX(""));
		System.out.println(doubleX("x"));
		System.out.println(doubleX("ax"));
		System.out.println(doubleX("xx"));
		System.out.println(doubleX("axax"));
		System.out.println(doubleX("axxa"));
		System.out.println(doubleX("aaax"));
		
	}
	
	static boolean doubleX(String str) {
		  if (str == null){
		    return false;
		  }
		  
		  if (str.length() < 2) {
		    return false;
		  }
		  
		  int xIndex = str.indexOf('x');
		  if (xIndex < 0) {
		    return false;
		  }
		  if (xIndex == str.length() - 1) {
		    return false;
		  }
		  return str.charAt(xIndex + 1) == 'x';
		}
}
