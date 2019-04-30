package amazon;
import java.util.*;

public class WordBreak {

	public static void main(String[] args) {
		String s = "mentosplus";
		List<String> wordDict= Arrays.asList("lee", "code", "men","tos","plus");
		
		boolean exists=findIfWordExists(s, wordDict);
		System.out.println(exists);
	}

	private static boolean findIfWordExists(String s, List<String> wordDict) {
	
		if(wordDict==null || wordDict.size()==0) {return false;}
		boolean[] bool = new boolean[s.length()+1];
		bool[0]=true;
		
		for(int i=1;i<=s.length();i++) {
			for(int j=0;j<i;j++) {
				if(bool[j] && wordDict.contains(s.substring(j, i))) {
					bool[i]=true;
					break;
				}
			}
		}
		return bool[s.length()];
	}

}
