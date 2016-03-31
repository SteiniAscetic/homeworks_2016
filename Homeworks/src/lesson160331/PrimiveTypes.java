package lesson160331;

public class PrimiveTypes {

	public static void main(String[] args) {
	
	byte b = 1; // 8 bits == 1 byte
	b = Byte.MAX_VALUE;
	b = Byte.MIN_VALUE;
	
	short s = 34; //16 bits == 2 bytes
	s = Short.MAX_VALUE;
	s = Short.MIN_VALUE;
	
	int i = 10; // 32 bits == 4 bytes
	i = Integer.MAX_VALUE;
	i = Integer.MIN_VALUE;
	
	long l = 15; // 64 bits == 8 bytes
	l = Long.MAX_VALUE;
	l = Long.MIN_VALUE;
	
	char c = 23; // 16 bit == 2 bytes
	c = Character.MAX_VALUE;
    c = Character.MIN_VALUE;
    c = 'E';
    System.out.println(c);
	
	float f = 64.3f; // 32 bits == 4 bytes
	f = Float.MAX_VALUE;
	f = Float.MIN_VALUE;
	
	double d = 32.1; // 64 bits == 8 bytes
	d = Double.MAX_VALUE;
	d = Double.MIN_VALUE;
	
	
	
	}
	
}
