package FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileOutputTest {
	public static void main(String[] args) {
		try{
			PrintWriter printwriter = new PrintWriter(
					new FileOutputStream("./output.txt", true));
			//ture means it'll append
			printwriter.println("Hello");
			printwriter.println("Guys");
			printwriter.println("Nice to meet you");
			
			printwriter.flush();
			printwriter.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
