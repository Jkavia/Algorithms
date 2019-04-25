package amazon;

public class NumberOfIslands {

	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };
		
		System.out.println(fintheNumberOfIslands(grid));
	}

	private static int fintheNumberOfIslands(char[][] grid) {
		if(grid==null || grid.length==0) {return 0;}
		int totalNumberOfIslands = 0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][i]=='1') {
					totalNumberOfIslands+= sink(grid,i,j);
				}
			}
		}
		return totalNumberOfIslands;
	}

	private static int sink(char[][] grid, int i, int j) {
		//recursive terminations contions if we reach left/right boundary 
		if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]=='0') {return 0;}
		
		grid[i][j] ='0';
		sink(grid, i+1, j);
		sink(grid, i-1, j);
		sink(grid, i, j+1);
		sink(grid, i, j-1);
		
		return 1;
	}

}
