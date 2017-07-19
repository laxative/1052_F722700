package hw1;

public class Main {
	public static void main(String[] args) {
		String out = new String();
		String temp = new String();
		for(int i = 0; i < args.length; ++i) {
			temp = args[i].toLowerCase();
			switch(temp.charAt(0)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					out += temp.substring(0, 1).toUpperCase();
					out += temp.substring(1);
					out += "ay";
					if(i!=args.length-1) out += " ";
					break;
				default:
					out += temp.substring(1,2).toUpperCase();
					out += temp.substring(2);
					out += temp.substring(0,1);
					out += "ay";
					if(i!=args.length-1) out += " ";
			}
		}
		System.out.println(out);
	}
}
