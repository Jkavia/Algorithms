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
		
		int imin=-1, jmin=-1, i=0,j=0;
		int imax = twodimmaxtrix.length,jmax = twodimmaxtrix[0].length;
		boolean right=true,down=false, left=false,up=false;
		
		
		while(i>imin && i<imax && j>jmin && j<jmax) {
			System.out.println(twodimmaxtrix[i][j]);
			if(right) {
				retlist.add(twodimmaxtrix[i][j]);
				if(j==jmax-1) {
					imin++;
					down=true;right=false;}else {j++;}
				
			}
			if(down) {
				retlist.add(twodimmaxtrix[i][j]);
				if(i==imax-1) {
					jmax--;
					left=true;down=false;}else {i++;}
				
			}
			if(left) {
				retlist.add(twodimmaxtrix[i][j]);
				if(j==jmin-1) {
					imax--;
					up=true;left=false;}else {j--;}
				
			}
			if(up) {
				retlist.add(twodimmaxtrix[i][j]);
				if(i==imin-1) {
					jmin++;
					right=true;up=false;}else {i--;}
				
			}
			System.out.println(jmin+" "+imin+" "+jmax+" "+imax);
			
		}
		
		
		
		
		
		return retlist;
	}

}
