package amazon;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
	int[] costs = {1,100,1,1,1,100,1,1,100,1};
	//possible steps 1 or 2
	
	int mincost = findminCost(costs);
	System.out.println(mincost);
	}

	private static int findminCost(int[] costs) {
		if(costs == null) {return 0;}
		if(costs.length==1) {return costs[0];}
		if(costs.length==2) {return Math.min(costs[0], costs[1]);}
		
		int[] dp = new int[costs.length];
		dp[0] = costs[0]; dp[1]=costs[1];
		for(int i=2;i<dp.length;i++) {
			dp[i] = Math.min(dp[i-1]+costs[i],dp[i-2]+costs[i]);
		}
		return Math.min(dp[dp.length-1], dp[dp.length-2]);
	}
	

}
