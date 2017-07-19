package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int max = 50;
		long[] numberArray = new long[(max+1)*(max+1)*(max+1)];
		//for init
		double temp;
		int cnt = 0;
		for(int i=0; i<=max; ++i) { //Math.pow(2,i)
			for(int j=0; j<=max; ++j) { //Math.pow(3,i)
				for(int k=0; k<=max; ++k) { //Math.pow(5,i)
					temp = Math.pow(2, i) * Math.pow(3, j) * Math.pow(5, k);
					numberArray[cnt++] = (long)temp;
					//System.out.println(numberArray[cnt-1]);  //JUST FOR CHECKING
				}
			}
		}
		Arrays.sort(numberArray);
		//
		//
		//
		
		
		Scanner in = new Scanner(System.in).useDelimiter("=|\n");
		char type = in.next().charAt(0);
		switch(type) {
			case 'X':
				int number = in.nextInt();
				boolean answer = false;
				for(int i=0; i<numberArray.length ; ++i) {
					if(number == numberArray[i]) {
						answer = true;
						break;
					}
				}
				System.out.println(answer);
				break;
			case 'Y':
				int num = in.nextInt();
				long ans = numberArray[num-1];
				System.out.println(ans);
				break;
			default:;
		}
	}
}
