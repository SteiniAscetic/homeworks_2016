package classwork160510;

public class A {

	String state = "";                   // 1 инициализация
			
	{
			System.out.println(state);
			state = "начало";              // 2 блок инициализации
			System.out.println(state);
	}
	
	public A() {
		System.out.println(state);
		state = "конструктор";             // 3 конструктор
		System.out.println(state);
	}
	public A(String x) {
		this();                           // 4 вторичные конструкторы
		state = x;
		System.out.println(x);
	}
	public A(int n) {                     // 3' отдельный конструктор
		System.out.println("n=" + n);
	}
	
	public static void main(String[] args) {
		
		A a = new A(0);
		
	}
	
	
}
