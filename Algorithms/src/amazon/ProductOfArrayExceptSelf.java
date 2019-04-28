package amazon;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		
		int[] retarr = fetchproductxcptself(arr);
		
		for(int i:retarr) {
			System.out.println(i);
		}
	}

	private static int[] fetchproductxcptself(int[] arr) {
		if(arr.length==0 || arr == null) {return null;}
		
		int[] output = new int[arr.length];
		int[] helper = new int[arr.length];
		int backmultiplier =1;
		for(int i=arr.length-1;i>=0;i--) {
			backmultiplier=backmultiplier*arr[i];
			helper[i]=backmultiplier;
		}
		int forwardmultiplier =1;
		output[0] = helper[1];
		
		for(int j=1;j<arr.length;j++) {
			forwardmultiplier=forwardmultiplier*arr[j-1];
			//System.out.println("fwdmltiplier  "+forwardmultiplier);
			if(j==arr.length-1) {
			output[j] = forwardmultiplier;
			continue;
		}
			//System.out.println("helper "+helper[j+1]);
			output[j] = forwardmultiplier*helper[j+1];	
		}
		
		
		return output;
	}

}
