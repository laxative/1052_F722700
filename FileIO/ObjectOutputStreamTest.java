package FileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
	public static void main(String[] args) {
		Student student = new Student("laxative",19);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new
			FileOutputStream("./output2.obj"));
			//.writeInt(int)
			//.writeDouble(double)
			//.writeShort(short)
			//.writeLong(long)
			//.writeChar(char)
			//.writeFloat(float)
			//.writeBoolean(boolean)
			///writeUTF(String)
			//.writeObject(Object)
			oos.writeInt(123);
			oos.writeObject(student);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
