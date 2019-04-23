package amazon;

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		int firstUniqueChar = findfirstUniqueChar("loveleetcode");
		System.out.println(firstUniqueChar);
	}

	private static int findfirstUniqueChar(String string) {
		int ret =-1;
		int[] arr = new int[256];
		
		for(int i=0;i<string.length();i++) {
			arr[string.charAt(i)]++;
		}
		for(int i=0;i<string.length();i++) {
			if(arr[string.charAt(i)]==1) {
				ret = i;
				break;
			};
		}
		return ret;
	}

}
