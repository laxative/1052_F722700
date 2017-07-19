package hw6;

public class Comparison implements IOperation{
	public String perform(String num1, String num2) {
		boolean NegNum1 = num1.substring(0, 1).equals("-");
		boolean NegNum2 = num2.substring(0, 1).equals("-");
		int sizeNum1 = (NegNum1)?num1.length()-1:num1.length();
		int sizeNum2 = (NegNum2)?num2.length()-1:num2.length();
		//+ && -
		if(!NegNum1 && NegNum2) return "1";
		//- && +
		else if(NegNum1 && !NegNum2) return "-1";
		else{
			int size = sizeNum1>sizeNum2?sizeNum1:sizeNum2;
			//Num1
			int j;
			int saveNum1[] = new int[size];
			j = (NegNum1)?1:0;
			for(int i=0; i<size; ++i) {
				if(i<size-sizeNum1) {
					saveNum1[i] = 0;
					continue;
				}
				saveNum1[i] = Integer.valueOf(num1.substring(j, j+1));
				j++;
			}
			
			//Num2
			int saveNum2[] = new int[size];
			j = (NegNum2)?1:0;
			for(int i=0; i<size; ++i) {
				if(i<size-sizeNum2) {
					saveNum2[i] = 0;
					continue;
				}
				saveNum2[i] = Integer.valueOf(num2.substring(j, j+1));
				j++;
			}

			//compare
			for(int i=0; i<size; ++i) {
				if(saveNum1[i] < saveNum2[i]) {
					return (NegNum1 && NegNum2)?"1":"-1";
				}
				else if(saveNum1[i] > saveNum2[i]) {
					return (NegNum1 && NegNum2)?"-1":"1";
				}
			}
			return "0";
		}
	}
}
