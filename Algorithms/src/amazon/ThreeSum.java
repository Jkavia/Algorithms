package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {

		int[] arr = {-1,0,1,2,-1,-4};

		List<List<Integer>> ll=ThreeSumMethod(arr);
		for(List<Integer> al:ll) {
			for(Integer i:al) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> ThreeSumMethod(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> returnlist = new ArrayList<List<Integer>>();
		for(int i=0;i<nums.length;i++) {
			if(i>0 && nums[i]==nums[i-1]) {continue;}
			int sum = -nums[i],left=i+1,right=nums.length-1;
			
			while(left<right) {
				if(nums[left]+nums[right]==sum) {
					returnlist.add(Arrays.asList(nums[left],nums[right],nums[i]));
					left++;right--;
					while(nums[left]==nums[left-1]) {left++;}
					while(nums[right]==nums[right+1]) {right--;}
					
				}else if(nums[left]+nums[right]>sum) {left++;}else {right--;}
			}
			
		}
		return returnlist;
    }
	}


