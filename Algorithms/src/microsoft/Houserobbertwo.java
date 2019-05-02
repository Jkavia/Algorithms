package microsoft;

public class Houserobbertwo {

	public static void main(String[] args) {
		int[] housesamout = {1,2,1,1};
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
		
	      int[] first = new int[housesamout.length+1];
	        int[] second = new int[housesamout.length+1];
	        
	        first[0] = 0;
	        first[1] = housesamout[0];
	        second[0] = 0;
	        second[1] = 0;
	        
	        
	        for(int i =2; i<=housesamout.length ; i++){
	            first[i] = Math.max(first[i-1], first[i-2]+housesamout[i-1]);
	            second[i] = Math.max(second[i-1], second[i-2]+housesamout[i-1]);
	        }
	        
			return Math.max(first[housesamout.length-1], second[housesamout.length]);
	}
}
