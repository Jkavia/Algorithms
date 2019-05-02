package microsoft;

public class HouseRobber {

	public static void main(String[] args) {
		// find max robbery amount if he cant rob two adjacent houses.
		int[] housesamout = { 1, 2, 3, 1, 1, 1, 9 };
		int max = findTheMaxProfit(housesamout);
		System.out.println(max);
	}

	private static int findTheMaxProfit(int[] housesamout) {
		if (housesamout == null) {
			return 0;
		}
		if (housesamout.length == 1) {
			return housesamout[0];
		}
		if (housesamout.length == 2) {
			return Math.max(housesamout[0], housesamout[1]);
		}

		int[] dp = new int[housesamout.length];
		dp[0] = housesamout[0];
		dp[1] = Math.max(housesamout[0], housesamout[1]);

		for (int i = 2; i < housesamout.length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + housesamout[i]);
		}
		return  dp[housesamout.length - 1];
	}

}
