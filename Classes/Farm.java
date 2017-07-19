package Classes;

public class Farm {
	public static void main(String[] args) {
		DuckClass duck = new DuckClass();
		
		boolean canfly = duck.canfly;
		if(canfly == true) {
			System.out.println("I believe I can fly~~");
		}else {
			System.out.println("QQ I can't fly@@");
		}
		
		String food = "hamburger";
		String message = duck.eat(food);
		System.out.println(message);
		
		int expectedDistance = 10;
		duck.swim(expectedDistance);
		System.out.println("The expected distance is " + expectedDistance);
	}
}
