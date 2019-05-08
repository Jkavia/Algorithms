package microsoft;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
					
	String input = "Potattottal";
	
	String longestplaindrome =  longestPalindromicSubstring(input);
	System.out.println(longestplaindrome);

	}

	private static String longestPalindromicSubstring(String input) {
		if(input==null || input.isEmpty()) {return null;}
		String lonngestpalinlength="";
		for(int i=0;i<input.length();i++) {
			
			for(int j=i+1;j<=input.length();j++) {
				
				
				if(j-i>lonngestpalinlength.length() && isPalindrome(input.substring(i, j))) {
					lonngestpalinlength=input.substring(i,j);
				}
				
			}
			
		}
		
		
		return lonngestpalinlength;
	}

	private static boolean isPalindrome(String substring) {
		
		if(substring==null || substring.isEmpty()) {return false;}
		int i=0, j= substring.length()-1;
		
		while(i<j) {
			if(substring.charAt(i)!=substring.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

}
