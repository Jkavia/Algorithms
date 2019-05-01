package microsoft;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		String s = "leetcode";
		int indexoffirstnonrepating = firstUnique(s);
		System.out.println(indexoffirstnonrepating);
	}

	private static int firstUnique(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		int index = -1;
		int[] arr = new int[256];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}
		
		for (int i = 0; i < s.length(); i++) {
			if(arr[s.charAt(i)]==1) {
				index=i;
				break;
			}
		}
		return index;
	}

}
