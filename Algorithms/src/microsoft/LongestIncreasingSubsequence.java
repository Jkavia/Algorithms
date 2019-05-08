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
		int max=0,firstindex=0,lastindex=0;
		
		for(int i=0;i<input.length;i++) {
			if(i>0) {
				System.out.println(i);
				if(input[i]>input[i-1]) {
					
					lastindex =i;
				}else {
					
					int currentlength = (lastindex-firstindex)+1;
					System.out.println(currentlength);
					if(currentlength>max) {
						max=currentlength;
					}
					firstindex=i;
					lastindex=i;
				}
			}
			
		}
		
		return max;
		
		
	}

}
