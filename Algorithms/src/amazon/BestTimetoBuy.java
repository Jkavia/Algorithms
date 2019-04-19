package amazon;

public class BestTimetoBuy {

	public static void main(String[] ar) {
		int arr[] = {9,1,2,4,1,5};
		System.out.println(findMaximumProfit(arr));
	}

	private static int findMaximumProfit(int[] arr) {
		int minvalue = arr[0], maxvalue=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>minvalue) {
			maxvalue = Math.max(maxvalue,arr[i]-minvalue);
		}else {
			minvalue = arr[i];
		}
	}
	
		
		return maxvalue;
	}
	
}
