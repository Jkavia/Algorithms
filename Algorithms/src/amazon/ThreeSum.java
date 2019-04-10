package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, -1, -1, -2, 0,1 };

		List<List<Integer>> ll=ThreeSum(arr);
		for(List<Integer> al:ll) {
			for(Integer i:al) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> ThreeSum(int[] arr) {
		Arrays.sort(arr);
		List<List<Integer>> retlist = new ArrayList<List<Integer>>();
		
		for(int i=0;i<arr.length-2;i++) {
			if(i==0||(i>0 && arr[i]!=arr[i-1])) {
				int sum = 0-arr[i];
				int left=i+1,right=arr.length-1;
				while(left<right) {
					if(arr[left]+arr[right]==sum) {
						retlist.add(Arrays.asList(arr[left],arr[right],arr[i]));
					
					while(arr[left]==arr[left+1])left++;
					while(arr[right]==arr[right-1])right--;
					left++;right--;
					}
					if(arr[left]+arr[right]<sum) {left++;}else {right--;}
				}
				
			}
			
		}
		return retlist;
	}

}
