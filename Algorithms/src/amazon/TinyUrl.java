package amazon;

import java.util.HashMap;

public class TinyUrl {

	HashMap<String, String> map = new HashMap<String, String>();
	String characters = "0123456789abcdefghijklmnopqrstuwxyzABCDEFGHIJKLMNOPQRSTUWXYZ";
	int count =1;
	
	public String getKey() {
		String key="";
		while(count>0) {
			count--;
			key += characters.charAt(count);
			count /= characters.length();
		}
		return key;
	}
	
	public String encode(String longUrl) {
		String key = getKey();
		map.put(key, longUrl);
		count++;
		return "http://tinyurl.com"+key;
	}
	
	public String decode(String shortUrl) {
		return map.get(shortUrl.replace("http://tinyurl.com", ""));
	}
}
