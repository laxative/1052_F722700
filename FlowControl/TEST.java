package FlowControl;

public class TEST {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		if((b!= 0) && (a/b >= 2)) {
			System.out.println("bingo");
		}
		if((b!= 0) & (a/b >= 2)) {
			System.out.println("bingo again");
		}
	}
}
