package microsoft;

public class Houserobbertwo {

	public static void main(String[] args) {
		int[] housesamout = { 1, 2, 1, 1 };
		int max = findTheMaxProfit(housesamout);
		System.out.println(max);

	}

	private static int findTheMaxProfit(int[] housesamout) {
		if (housesamout == null) {
			return 0;
		}
		if (housesamout.length == 1) {
			return housesamout[0];
		}
		if (housesamout.length == 2) {
			return Math.max(housesamout[0], housesamout[1]);
		}

		int prev_r_rf = housesamout[0]
		,prev_nr_rf =0,
		prev_r_nrf = 0,
		prev_nr_nrf =0;
		
		int curr_r_rf = housesamout[0]
				,curr_nr_rf =0,
				curr_r_nrf = 0,
				curr_nr_nrf =0;
		
		

		for (int i = 1; i <housesamout.length; i++) {
			curr_r_rf = prev_nr_rf + housesamout[i];
			curr_nr_rf = Math.max(prev_r_rf, prev_nr_rf);
			curr_r_nrf = prev_nr_nrf+housesamout[i];
			curr_nr_nrf =  Math.max(prev_nr_nrf, prev_r_nrf);
			
			
			prev_r_rf = curr_r_rf;
			prev_nr_rf =curr_nr_rf;
			prev_r_nrf = curr_r_nrf;
			prev_nr_nrf = curr_nr_nrf;
			
		}

		return Math.max(Math.max(prev_r_nrf, prev_nr_rf), prev_nr_nrf);
	}
}
