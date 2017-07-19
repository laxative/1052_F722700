package Classes;

public class DuckClass{
	public boolean canfly = false;
	
	public void Quack() {
		System.out.println("quack!");
	}
	
	public String eat(String food) {
		String message = "Thank you the " + food + " is good.";
		return message;
	}
	
	public void swim(int distance) {
		distance = distance - 1;
		System.out.println("The distance of my swimming is " + distance);
	}
}
