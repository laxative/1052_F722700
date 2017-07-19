package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {
	public static void main(String[] args) {
		try{
			Scanner scanner	= new Scanner(new FileInputStream("test.txt"));
			String name = scanner.nextLine();
			String id = scanner.nextLine();
			String school = scanner.nextLine();
			
			System.out.println("Name: " + name);
			System.out.println("id: " + id);
			System.out.println("school: " + school);
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		}
	}
}
