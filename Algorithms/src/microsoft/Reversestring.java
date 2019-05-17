package microsoft;

public class Reversestring {

	public static void main(String[] args) {
	
		String input = "this is leetcode!";
		String reversed = reverse(input);
		System.out.println(reversed);
	}

	private static String reverse(String input) {
	if(input ==null || input.isEmpty()) {return null;}
	String ret = "";
	String[] strarr = input.trim().split("//s");
	
	for(int i= strarr.length-1;i>0;i--) {
		ret+=strarr[i]+" ";
	}
	ret+=strarr[0];
		return ret;
	}

}
