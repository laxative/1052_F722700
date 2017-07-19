package hw4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		double guess = n/2;
		double r;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		while(true) {
			r = n/guess;
			guess = (guess+r)/2;
			if(-0.01*guess < guess - (guess+r)/2 && guess - (guess+r)/2 < 0.01*guess) {
				break;
			}
		}
		System.out.println(decimalFormat.format(guess));
	}
}
