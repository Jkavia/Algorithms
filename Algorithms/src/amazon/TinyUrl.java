package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TinyUrl {

	static List<String> al = new ArrayList<>();
	static String characters = "abcdefghijklmnopqrstuwxyzABCDEFGHIJKLMNOPQRSTUWXYZ0123456789";
	static int count = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 12345; i++) {
			al.add("http://facebook.com?x=jar8935hmsopf09");
		}
		al.add("http://google.com?x=jar8935hmsopf09");

		String encoded = encode("http://google.com?x=jar8935hmsopf09");
		System.out.println(encoded);

		String decoded = decode(encoded.split("com/")[1]);
		System.out.println(decoded);
	}

	private static String decode(String encoded) {
		int index = 0;
		for(int i=0;i<encoded.length();i++) {
			if(encoded.charAt(i)>'a' && encoded.charAt(i)<'z') {
				index = index*62 + encoded.charAt(i)-'a';
			}
			if(encoded.charAt(i)>'A' && encoded.charAt(i)<'Z') {
				index = index*62 + 26+encoded.charAt(i)-'A';
			}
			if(encoded.charAt(i)>'0' && encoded.charAt(i)<'9') {
				index = index*62 +52+ encoded.charAt(i)-'0';
			}
		}
		
		return al.get(index);
	}

	public static String getKey(int index) {

		String key = "";

		while (index > 0) {
			key += characters.charAt(index % 62);
			index = index / 62;
		}
		String retunring = "";
		for (int i = key.length() - 1; i >= 0; i--) {
			retunring += key.charAt(i);
		}
		return retunring;
	}

	// Encodes a URL to a shortened URL.
	public static String encode(String longUrl) {
		String key = getKey(al.indexOf(longUrl));
		return "http://tinyurl.com/" + key;
	}

	// Decodes a shortened URL to its original URL.
	// public static String decode(String shortUrl) {
	// return map.get(shortUrl.replace("http://tinyurl.com/", ""));
	// }
}
