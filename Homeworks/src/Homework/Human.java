package Homework;

public class Human {

	private String name;
	private String nationality;
	private boolean isHappy = true;
	
	static int theCount;
	
	
	public Human(String nationality, String name) {
		this.nationality = nationality;
		this.name = name;
	}
	
	
	
	public void conversation(String friend) {
		if (isHappy) {
			System.out.println(nationality + " '" + name + "' говорит с " + friend);
			theCount++;
			if (theCount >= 3) {
				System.out.println(nationality + " '" + name + "' устал говорить с " + friend);
				isHappy = false;
			}
		} else {
			System.out.println(nationality + " '" + name + "' скучает ");
		}
	}
	
	
	
	public void giveAsurprise(String gift) {
		if (isHappy) {
			System.out.println(nationality + " '" + name + "' подарит " + gift + " другу");
			theCount++;
			if (theCount >= 5) {
				System.out.println(nationality + " '" + name + "' оставит себе " + gift);
				isHappy = false;
			}
		} else {
			System.out.println(nationality + " '" + name + "' примет " + gift);
			isHappy = true;
		}
	}
	
}
