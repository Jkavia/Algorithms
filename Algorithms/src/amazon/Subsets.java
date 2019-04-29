package amazon;
import java.util.*;

public class Subsets {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3};
		List<List<Integer>> subsets = findSubsets(arr);
		
		for(List<Integer> ls:subsets) {
			for(Integer in:ls) {
				System.out.print(in);
			}
			System.out.println();
		}
		
	}

	private static List<List<Integer>> findSubsets(int[] arr) {
			List<List<Integer>> retlist = new ArrayList<>();
			
			recursesubsets(retlist, new Stack<Integer>(), 0,arr);
			
			return retlist;
	}
	//(n for stack)*(2^n fr output) subsets if we include , time is (n*2^n)
	private static void recursesubsets(List<List<Integer>> retlist, Stack<Integer> stack, int position,int[] arr) {
			if(arr.length==position) {
				List<Integer> list = new ArrayList<>(stack);
				retlist.add(list);
				return;
			}
			
			stack.add(arr[position]);
			recursesubsets(retlist, stack, position+1,arr);
			stack.pop();
			recursesubsets(retlist, stack, position+1,arr);
	}

}
