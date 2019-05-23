package microsoft;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
	int[][] twodimmaxtrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	
	List<Integer> ls = spiral(twodimmaxtrix);

	for(Integer in: ls) {
		System.out.println(in);
	}
	}

	private static List<Integer> spiral(int[][] twodimmaxtrix) {
		if(twodimmaxtrix==null && twodimmaxtrix.length==0) {return null;}
		List<Integer> retlist = new ArrayList<Integer>();
		
		int rowstart = 0, colstart =0, rowend = twodimmaxtrix.length-1, colend = twodimmaxtrix[0].length-1;
		
		while(rowstart<=rowend && colstart<=colend) {
			
			for(int i=colstart; i<=colend; i++) {
				retlist.add(twodimmaxtrix[rowstart][i]);
			}rowstart++;
			
			for(int i=rowstart; i<=rowend; i++) {
				retlist.add(twodimmaxtrix[i][colend]);
			}colend--;
			
			if(rowstart<=rowend) {
				for(int i=colend; i>=colstart; i--) {
					retlist.add(twodimmaxtrix[rowend][i]);
				}rowend--;
			}
			
			if(colstart<=colend) {
				for(int i=rowend; i>=rowstart; i--) {
					retlist.add(twodimmaxtrix[i][colstart]);
				}colstart++;
			}

		}
		return retlist;
	}

}
