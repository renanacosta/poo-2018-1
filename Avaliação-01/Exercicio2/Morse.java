public class Morse {
		
	    public static boolean isupper(char c) {
		    return c >= 'A' && c <= 'Z' && c !=' ';
	  	}

	    public static char downcase(char c) {
	    if (isupper(c)) return (char) (c + 32);
	    return c;
	    }
	
	    public static String downcase(String s) {
		    String r = "";
		    for (int i = 0; i < s.length(); i++) {
		      r += downcase(s.charAt(i));
		    }
		    return r;
		}

	    public static String substr(String s, int inicio, int qtd) {
	      String r = "";
	      for (int i = inicio; i < inicio + qtd; i++) {
	        r += s.charAt(i);
	      }

	      return r;
	    }
		
		public static String ToMorse(String s) {
		String s2 = (" abcdefghijklmnopqrstuvwxyz "); 
		String [] s1 = { "", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
	                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
	                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
	                "-.--", "--.." , "/" };
		 
		String morse = "";
		int n1 = 0;
		int n2 = 0;
		char c;
		s = downcase(s);
		for(int x = 0; n2<s.length(); x++) {
			n1 = (int)s.charAt(n2);
			if(((n1<97) || (n1>122)) && (n1!=32)){
				n2+=1;
			}else{
			c = s.charAt(n2);
			if(c==s2.charAt(x)) {
				for(int y = 0; y<s1[x].length(); y++ ) {
				morse += (s1[x].charAt(y));				
						}
				morse+= " ";
				n2 += 1;
				x = 0;
					}
				}
		   }
			morse = substr(morse, 0 , morse.length()-1);
			return morse;
	   }
  }
