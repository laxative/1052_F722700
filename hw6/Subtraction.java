package hw6;

public class Subtraction implements IOperation{
	public String perform(String num1, String num2) {
		//deal with pos-pos | neg-pos | pos+neg | neg-neg
		boolean NegNum1 = num1.substring(0, 1).equals("-");
		boolean NegNum2 = num2.substring(0, 1).equals("-");
		int sizeNum1 = (NegNum1)?num1.length()-1:num1.length();
		int sizeNum2 = (NegNum2)?num2.length()-1:num2.length();
		
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
			saveNum1[i] = Integer.valueOf(num1.substring(j, j+1))
					* ((NegNum1)?-1:1);
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
			saveNum2[i] = Integer.valueOf(num2.substring(j, j+1))
					* ((NegNum2)?-1:1);
			j++;
		}
		
		
		//calculate
		int save[] = new int[size+1];
		int temp;
		int cout = 0;
		for(int i=size; i>0; --i) {
			temp = saveNum1[i-1] - saveNum2[i-1] + cout;
			if(NegNum1 && NegNum2) {
				//neg - neg
				save[i] = temp<-10?temp+10:temp;
				cout = temp<-10?-1:0;
			}else{
				//pos - pos
				save[i] = temp<0?temp+10:temp;
				cout = temp<0?-1:0;
			}
		}
		save[0] = cout;
		//convert
		String answer = "";
		for(int i=0; i<size+1; ++i) {
			if(save[i]<0) {
				answer += "-";
				break;
			}
		}
		for(int i=0; i<size+1; ++i) {
			if(save[i]==0 && i!=size) continue;
			answer += Math.abs(save[i]);
		}
		return answer;
	}
}
