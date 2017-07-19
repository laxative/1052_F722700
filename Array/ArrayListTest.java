package Array;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("apple");
		names.add("orange");
		names.add("pear");
		names.remove(1);
		
		System.out.println(names.get(1));
	}
}
