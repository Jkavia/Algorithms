package microsoft;

public class AddDigits {

	public static void main(String[] args) {

		int digit = 3894;

		int singledigit = findsingledigit(digit);
		System.out.println(singledigit);

	}

	static int findsingledigit(int digit) {
		if((digit-10)<0) {
			return digit;
		}
		
		while((digit-10)>=0) {
			int subval = digit%10;
			int finval = digit-subval;
			int newdig = finval/10;
			digit=newdig+subval;
		}
		return digit;
	}
}
