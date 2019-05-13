package microsoft;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {10, 9, 2, 5, 3, 7, 101, 18};
		
		int op=oplongestIncreasingSubsequence(input);
		
		System.out.println(op);
	}

	private static int oplongestIncreasingSubsequence(int[] input) {
		int max=0;
		int[] dp= new int[input.length];
		
		
		for(int i=0;i<input.length;i++) {
			dp[i]=1;
		}
		
		for(int i=1;i<input.length;i++) {
			int currmax=0;
			
			for(int j=0;j<i;j++) {
				
				if(input[i]>input[j]) {
					currmax=Math.max(currmax, dp[j]);
				}
				
			}
			dp[i]=currmax+1;
			max = Math.max(max, dp[i]);
			
		}
		
		return max;
		
		
	}

}
