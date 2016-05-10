package classwork160510;

public class Animal11 {

	// class members
	
	// state - состояние
	
	private String name;  // поле, field
	private String kind;  
	private boolean isHungry = true;
	
	
	
	
	public Animal11(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	
	public Animal11(boolean h, String n, String k) {
		kind = k;
		name = n;
		isHungry = h;
	}
	
	public Animal11(String king, String name) {
		this(true, name, kind);
	}
	
	
	public Animal11() {
//		this(true, "", "микроб");
		this("микроб", "");
	}
	

	
	//  behavior - поведение
	
	
	public void feed(String food) {   // метод экземпляра instance method
		if (isHungry) {
			System.out.println(kind + " '" + name + "' ест " + food);
			isHungry = false;
		} else {
			System.out.println(kind + " '" + name + "' играет с " + food);			
		}
	}
	
	public void play() {   // no static ==> instance method
		if (isHungry) {
			System.out.println(kind + " '" + name + "' обиделся и залез в коробку ");
		} else {
			System.out.println(kind + " '" + name + "' играет, пока не проголодается ");
			isHungry = true;
		}
	}
	
}
