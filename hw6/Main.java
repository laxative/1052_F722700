package hw6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input[] = scanner.nextLine().split(" ");
		IOperation ioperation;
		String a = input[0];
		String operation = input[1];
		String b;
		for(int i=2; i<input.length; ++i) {
			if(i%2==1) operation = input[i];
			else {
				b = input[i];
				boolean NegA = a.substring(0, 1).equals("-");
				boolean NegB = b.substring(0, 1).equals("-");
				switch(operation) {
				case "+":
					if((!NegA && !NegB) || (NegA && NegB)) {
					//pos + pos | neg + neg
					ioperation = new Addition();
					a = ioperation.perform(a, b);
					}else{
					//pos + neg
					ioperation = new Subtraction();
					//make sure a>b
					IOperation tempOp = new Comparison();
					String temp;
					if(tempOp.perform(a, b).equals("-1")) {
						temp = a;
						a = b;
						b = temp;
					}
					//
					if(a.substring(0, 1).equals("-")) {
						a = a.substring(1);
					}else{
						b = b.substring(1);
					}
					a = ioperation.perform(a, b);
					}
					break;
				case "-":
					if((!NegA && !NegB) || (NegA && NegB)) {
					//pos + pos | neg + neg
					ioperation = new Subtraction();
					a = ioperation.perform(a, b);
					}else{
					//pos + neg
					ioperation = new Addition();
					
					if(b.substring(0, 1).equals("-")) {
						b = b.substring(1);
					}
					a = ioperation.perform(a, b);
					}
					break;
				case "<":
					ioperation = new Comparison();
					if(ioperation.perform(a, b).equals("-1")) a = "true";
					else a = "false";
					break;
				case ">":
					ioperation = new Comparison();
					if(ioperation.perform(a, b).equals("1")) a = "true";
					else a = "false";
					break;
				case "=":
					ioperation = new Comparison();
					if(ioperation.perform(a, b).equals("0")) a = "true";
					else a = "false";
					break;
				default:;
				}
			}
		}
		System.out.println(a);
		scanner.close();
	}
} 
