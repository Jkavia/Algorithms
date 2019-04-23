package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] input= {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> output = groupAnagrams(input);
		for(List l: output) {
			ArrayList<String> ll =(ArrayList<String>) l;
			for(String s: ll) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}

	private static List<List<String>> groupAnagrams(String[] input) {
		List<List<String>> returnlist = new ArrayList<>();
		Map<String,List<String>> anagramaslist = new HashMap<>();
		
		for(String str:input) {
		
			char[] chararr = str.toCharArray();
			Arrays.sort(chararr);
			String sorted = String.valueOf(chararr);
			if(!anagramaslist.containsKey(sorted)) {
				List<String> al = new ArrayList<>();
				al.add(str);
				anagramaslist.put(sorted, al);
			}else {
				anagramaslist.get(sorted).add(str);
			}
		}
		
		for(String l : anagramaslist.keySet()) {
			returnlist.add(anagramaslist.get(l));
		}
		return new ArrayList<List<String>>(anagramaslist.values());
	}

}
