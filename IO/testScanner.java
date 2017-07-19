package IO;

import java.util.Scanner;

public class testScanner {
	public static void main(String[] args) {
		int num1, num2;
		Scanner scannerObject = new Scanner(System.in);
		
		System.out.println("Enter two integer: ");
		num1 = scannerObject.nextInt();
		num2 = scannerObject.nextInt();
		
		System.out.println("num1=" + num1 + ", num2=" + num2);
		
		System.out.println("Enter two decimal: ");
		double d1,d2;
		d1 = scannerObject.nextDouble();
		d2 = scannerObject.nextDouble();
		
		System.out.println("d1=" + d1 + ", d2=" + d2);
		
		System.out.println("Enter two words");
		String s1,s2;
		s1 = scannerObject.next();
		s2 = scannerObject.next();
		System.out.println("s1=" + s1 + ", s2=" + s2);
		
		scannerObject.nextLine();
		System.out.println("Enter a line:");
		String line;
		line = scannerObject.nextLine();
		System.out.println("line=" + line);
		
	}
}
