package microsoft;
import java.util.*;

public class Findpermutationsofarray {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> re=permutations(arr);
	}

	private static List<List<Integer>> permutations(int[] arr) {
		List<List<Integer>> retlist = new ArrayList<>();
		if(arr==null || arr.length==0) {return null;}
		
		recursivepermute(retlist, arr, 0);
		
		return retlist;
	}

	private static void recursivepermute(List<List<Integer>> retlist, int[] arr, int i) {
		if(i==arr.length-1) {
			List<Integer> inner = new ArrayList<>();
			for(int x: arr) {
				inner.add(x);
			}
			retlist.add(inner);
		}
		
		for(int a=i;a<arr.length;a++) {
			swap(arr,a,i);
			recursivepermute(retlist, arr, i+1);
			//deswap
			swap(arr,a,i);
			
		}
		
	}

	private static void swap(int[] arr, int a, int i) {
		// TODO Auto-generated method stub
		
	}

}
