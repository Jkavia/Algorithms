package amazon;

public class FindLongestPalindromeInString {

	public static void main(String[] args) {
		String s = "bbbab";

	System.out.println(findlongestpalindrome(s));
	}


	private static String findlongestpalindrome(String s) {
		String longestpalindrome = "";
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < s.length(); j++) {
				if (j - i > longestpalindrome.length() - 1 && ispalindrome(i, j, s)) {
					longestpalindrome = s.substring(i, j + 1);
				}
			}
		}
		return longestpalindrome;
	}

	private static boolean ispalindrome(int i, int j, String s) {
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
