package FileIO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
	public static void main(String[] args) {
		try{
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("./output2.obj"));
			int num = ois.readInt();
			System.out.println("num: " + num);
			
			Student student = (Student)ois.readObject();
			System.out.println("student name: " + student.getName());
			System.out.println("student age: " + student.getAge());
			
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
