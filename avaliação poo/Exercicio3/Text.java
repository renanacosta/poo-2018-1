public class Text {

	public static String reverse(String s) {
		String o = "";
		for(int x = s.length()-1; x>=0; x--) {
		o = o + s.charAt(x);
		}
		
		return o;
	}
	
	public static String strip(String s, char c) {
		String i = "";
		for(int x = 0; x<s.length(); x++) {
			if(c!=s.charAt(x)) {
				i = i + s.charAt(x);
				}
			}
		return i;
		}
	
	public static boolean palindrome(String s) {
		return strip(s,' ').equals(reverse(strip(s,' ')));
	
	}
}

