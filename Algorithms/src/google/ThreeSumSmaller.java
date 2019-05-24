package google;

import java.util.Arrays;

public class ThreeSumSmaller {

	public static void main(String[] args) {
		int[] input = { -2, 0, 1, 3 };
		int target = 2;

		int ser = findsmaller(input, target);
	}

	private static int findsmaller(int[] input, int target) {
		if (input == null || input.length == 0) {
			return 0;
		}
		int retnumber = 0;
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {

			int index = i;
			int j = index + 1;
			int k = input.length - 1;

			while (j < k) {

				if ((input[i] + input[j] + input[k]) < target) {
					retnumber += k - j;// array is sorted so all number between j and k are smaller only
					j++;
					while (input[j] == input[j - 1]) {
						j++;
					}
				} else {
					k--;
					while (input[k] == input[k + 1]) {
						k--;
					}
				}
			}
		}

		return retnumber;
	}

}
