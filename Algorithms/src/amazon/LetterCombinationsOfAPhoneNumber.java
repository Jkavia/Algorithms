package amazon;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		String phonenumber = "23";
		String[] mapping = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		List<String> retlist = new ArrayList<>();
		findcombinations(retlist, mapping, phonenumber, 0,"");
		for(String s:retlist) {
			System.out.print(s+" ");
		}
		
	}

	private static void findcombinations(List<String> retlist, String[] mapping, String phonenumber, int index,String combination) {
		if(index==phonenumber.length()) {
			retlist.add(combination);
			return;
		}
		
		String mappingForEachDigit = mapping[phonenumber.charAt(index)-'0'];
		for(int i=0;i<mappingForEachDigit.length();i++) {
			findcombinations(retlist,mapping,phonenumber,index+1,combination+mappingForEachDigit.charAt(i));
		}
	}

}
