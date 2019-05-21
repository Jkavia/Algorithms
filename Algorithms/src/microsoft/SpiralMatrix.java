package microsoft;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
	int[][] twodimmaxtrix = {{1,2,3},{4,5,6},{7,8,9}};
	
	List<Integer> ls = spiral(twodimmaxtrix);

	}

	private static List<Integer> spiral(int[][] twodimmaxtrix) {
		if(twodimmaxtrix==null && twodimmaxtrix.length==0) {return null;}
		List<Integer> retlist = new ArrayList<Integer>();
		return retlist;
	}

}
