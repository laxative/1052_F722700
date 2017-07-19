package hw5;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		String mode = in.nextLine();
		String type = in.nextLine();
		Document doc;
		switch(type) {
			case "Document":
				doc = new Document();
				doc.setText(in.nextLine());
				break;
			case "Email":
				doc = new Email();
				Email temp = (Email)doc;
				temp.setSender(in.nextLine());
				temp.setRecipient(in.nextLine());
				temp.setTitle(in.nextLine());
				temp.setText(in.nextLine());
				break;
			case "File":
				doc = new File();
				File tmp = (File)doc;
				tmp.setPathname(in.nextLine());
				tmp.setText(in.nextLine());
				break;
			default: 
				doc = new Document();
				break;
		}
		switch(mode) {
			case "A":
				System.out.print(doc.toString());
				break;
			case "B":
				String search = in.nextLine();
				System.out.println(doc.toString().contains(search));
				break;
			case "C":
				String changeItem = in.nextLine();
				changeItem = "set" + changeItem.substring(0,1).toUpperCase()
						+ changeItem.substring(1);
				String replace = in.nextLine();
				Method method = doc.getClass().getMethod(changeItem, String.class);
				method.invoke(doc, replace);
				System.out.println(doc.toString());
				break;
			default: break;
		}
	}
}
