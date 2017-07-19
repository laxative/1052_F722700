package IO;

import java.util.Scanner;

public class scannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line1 = scanner.nextLine();
		int num = Integer.valueOf(line1);
		System.out.println("num=" + num);
		
		
	}
}
