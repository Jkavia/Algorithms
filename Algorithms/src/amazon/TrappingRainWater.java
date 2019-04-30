package amazon;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] elevation = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		int maxwaterTapped = findtappedwater(elevation);
		System.out.println(maxwaterTapped);
	}

	private static int findtappedwater(int[] elevation) {
		if (elevation == null || elevation.length == 0) {
			return 0;
		}
		 int totalarea=0,left=0,right=elevation.length-1,leftMax=0,rightMax=0;
		 
		 while(left<right) {
			 leftMax = Math.max(leftMax, elevation[left]);
			 rightMax = Math.max(rightMax, elevation[right]);
			 
			 if(leftMax<rightMax) {
				 totalarea+=leftMax-elevation[left];
				 left++;
			 }else {
				 totalarea+=rightMax-elevation[right];
				 right--;
			 }
		 }
		 return totalarea;
		


	}

}
