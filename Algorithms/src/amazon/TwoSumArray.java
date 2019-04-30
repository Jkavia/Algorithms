package amazon;

import java.util.*;

public class TwoSumArray {

	public static void main(String[] args) {
		int[] input = {1, 11, 15,7,7};
		int target = 14;
		List<Integer> indexes = findTwoSum(input,target);
		System.out.println(indexes.get(0)+" "+indexes.get(1));
	}

	private static List<Integer> findTwoSum(int[] input, int target) {
		List<Integer> retlist = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<input.length;i++) {
			map.put(input[i], i);
		}
		
		for(Integer i:map.keySet()) {
			if(map.containsKey(target-i) && target-i!=i) {
				retlist.add(map.get(i));
				retlist.add(map.get(target-i));
			}
		}
		
		
		
		return retlist;
	}

}
