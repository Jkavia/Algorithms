package amazon;

public class LongestPalindromicSubsequence {

	public static void main(String[] args) {
		String s = "bbbaba";

		int n = longestPalindromesubsequence(s);
		System.out.println(n);
	}

	private static int longestPalindromesubsequence(String s) {
	if(s.isEmpty() || s==null) {return 0;}
	int[][] dp = new int[s.length()][s.length()];
	
	for(int i=s.length()-1;i>=0;i--) {
		dp[i][i]=1;
		for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				dp[i][j]= dp[i+1][j-1]+2;
			}else {
				dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
			}
		}
	}
		return dp[0][s.length()-1];
	}

}
