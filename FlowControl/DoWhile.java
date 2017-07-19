package FlowControl;

public class DoWhile {
	public static void main(String[] args) {
		int eventNumber = 2;
		do{
			System.out.println(eventNumber);
			eventNumber += 2;
		}while(eventNumber <= 10);
	}
}
