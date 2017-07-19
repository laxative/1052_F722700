package hw2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a,b,c;
		String format;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		format = scanner.next();
		DecimalFormat decimalFormat = new DecimalFormat(format);
		double x1,x2,D;
		D = Math.pow(b,2) - 4 * a * c;
		x1 = (-b + Math.sqrt(D))/(2*a);
		x2 = (-b - Math.sqrt(D))/(2*a);
		System.out.println(decimalFormat.format(x1));
		System.out.print(decimalFormat.format(x2));
	}
}
