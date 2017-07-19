package IO;

import java.util.*;

public class DelimiterDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("##");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a);
		System.out.println(b);
	}
}
