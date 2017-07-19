package IO;

public class PrimitiveParameterDemo {
	public static void main(String[] args){
		int speed = 50;
		System.out.println("parameter value: " + speed);
		change(speed);
		System.out.println("parameter value: " + speed);
	}
	public static void change(int speed) {
		speed = 100;
		System.out.println("parameter value: " + speed);
	}
}
