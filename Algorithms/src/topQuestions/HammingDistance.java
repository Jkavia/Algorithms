package topQuestions;

public class HammingDistance {

	//find total number of mismatch bits
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 11;
		System.out.println(hammingdist(num1,num2));
	}

	private static int hammingdist(int num1, int num2) {
		int xor = num1^num2;
		int count=0;
		
		while(xor!=0) {
			if((xor&1)==1)count++;
			xor=xor>>1;
		}
		return count;
	}

}
