package amazon;

import java.util.*;

public class FindTheCheapestRoadToBuild {

	public static void main(String[] args) {
		List<List<Integer>> roadsAvailable = new ArrayList<>();
		List<List<Integer>> costRoadsToBeRepaired = new ArrayList<>();

		methodToaddToRoadsAvailable(roadsAvailable);
		methodTocostRoadsToBeRepaired(costRoadsToBeRepaired);
		
		int mincost = getMinimumCostToRepair(5,5,roadsAvailable,3,costRoadsToBeRepaired);
		System.out.println(mincost);

	}

	public static int getMinimumCostToRepair(int numTotalAvailableCities, int numTotalAvailableRoads,
			List<List<Integer>> roadsAvailable, 
			int numRoadsToBeRepaired, List<List<Integer>> costRoadsToBeRepaired) {

		
		
		
		return 0;
	}

	private static void methodToaddToRoadsAvailable(List<List<Integer>> roadsAvailable) {
		addtoRoadsAvailable(1, 2, roadsAvailable);
		addtoRoadsAvailable(2, 3, roadsAvailable);
		addtoRoadsAvailable(3, 4, roadsAvailable);
		addtoRoadsAvailable(4, 5, roadsAvailable);
		addtoRoadsAvailable(1, 5, roadsAvailable);
	}

	private static void methodTocostRoadsToBeRepaired(List<List<Integer>> costRoadsToBeRepaired) {
		addtoRoadsAvailable(1, 2, 12, costRoadsToBeRepaired);
		addtoRoadsAvailable(3, 4, 30, costRoadsToBeRepaired);
		addtoRoadsAvailable(1, 5, 8, costRoadsToBeRepaired);
	}

	private static void addtoRoadsAvailable(int i, int j, int k, List<List<Integer>> costRoadsToBeRepaired) {
		List<Integer> input = new ArrayList<>();
		input.addAll(Arrays.asList(i, j, k));
		costRoadsToBeRepaired.add(input);
	}

	private static void addtoRoadsAvailable(int i, int j, List<List<Integer>> roadsAvailable) {
		List<Integer> input = new ArrayList<>();
		input.addAll(Arrays.asList(i, j));
		roadsAvailable.add(input);
	}

}
