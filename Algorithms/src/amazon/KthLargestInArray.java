package amazon;

import java.util.Arrays;

public class KthLargestInArray {

	public static void main(String[] args) {
		int[] input = {3,2,1,5,6,4};
		int k=2;
		System.out.println(findtheKthLargest(input,k));
	}

	private static int findtheKthLargest(int[] input, int k) {
	Arrays.sort(input);
	int length = input.length;
	return input[length-k];
	}

}
