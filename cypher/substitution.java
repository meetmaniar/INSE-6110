package cypher;

public class substitution {
	   final static String key = "@r6%ZXs\"v*N[#wSl9zq2^+g;Lo";
	 	  
	    static String encrypt(String s) {
	        StringBuilder sb = new StringBuilder(s.length());
	 
	        for (char c : s.toCharArray())
	            sb.append(key.charAt((int) c - 65));
	 
	        return sb.toString();
	    }
	 
	    static String decrypt(String s) {
	        StringBuilder sb = new StringBuilder(s.length());
	 
	        for (char c : s.toCharArray())
	            sb.append((char) (key.indexOf((int) c) + 65));
	 
	        return sb.toString();
	    }
	
}
