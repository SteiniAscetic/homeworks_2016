package classwork160505;

public class Animal {

	// class members
	
	
	private String name;  // поле, field
	private String kind;  
	private boolean isHungry = true;
	
	public Animal(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}

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
