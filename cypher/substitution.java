package cypher;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Comparator;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;


public class substitution {
	   final static String key = "QWERTYUIOPASDFGHJKLZXCVBNM";
	
	 	  // Encryption
	    static String encrypt(String s) {
	        StringBuilder sb = new StringBuilder(s.length());
	 
	        for (char c : s.toCharArray())
	            sb.append(key.charAt((int) c - 65));
	 
	        return sb.toString();
	    }
	
	    
	    //Decryption
	    
	    static String decrypt(String s) {
	        StringBuilder sb = new StringBuilder(s.length());
	 
	        for (char c : s.toCharArray())
	            sb.append((char) (key.indexOf((int) c) + 65));
	 
	        return sb.toString();
	    }
	    
	    
	   
	    
	    //*Decryption
	    
	    static String decypher(String str) {
	    	int[] count1 = new int[255];
	    	int[] COUNT1 = new int[str.length()];
	    	HashMap<Character,Double>charCount1= new HashMap<Character,Double>();
	   	 
	    	int length1 = str.length();

	    	for (int i = 0; i < length1; i++) {
	    		count1[str.charAt(i)]++;
	    	}

	    	char[] ch1 = new char[str.length()];
	    	for (int i = 0; i < length1; i++) {
	    		ch1[i] = str.charAt(i);
	    		int find = 0;
	    		for (int j = 0; j <= i; j++) {
	    			if (str.charAt(i) == ch1[j])
	    				find++;
	    		}

	    		if (find == 1) {
	    			System.out.println("Number of Occurrence of " + str.charAt(i) + " letter is:" + count1[str.charAt(i)]);
	    			
	    			COUNT1[i]=count1[str.charAt(i)];
	    			
	    		}
	    		
	    		
	    	}
	    	
	    	for(int s=0;s<COUNT1.length;s++) {
	    		
	    		charCount1.put(str.charAt(s), (double) count1[str.charAt(s)]*100/str.length());
	    	}
	    	
	    	System.out.println(charCount1);
	    
	    	
	    	

	    	
	    	final char[] frequencyTable = new char[] {'E','T','A','O','I','N','S','H','R','W','D','L','Y','K','C','U','M','F','G','P','B','V','J','X','Q','Z'};
	    	final char[] alphabet = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	    	int[] count = new int[255];
	    	int[] COUNT = new int[str.length()];
	    	Double quality = (double) 0;
	    	HashMap<Character,Double>charFrequency = new HashMap<Character,Double>();
	    	HashMap<Character,Character>key = new HashMap<Character,Character>();
	    	String T= new String();
	   	 	int length = str.length();
	    	//get letters count
	    	for (int i = 0; i < length; i++) {
	    		count[str.charAt(i)]++;
	    	}
	    	//Perform English Letter Frequency Analysis
	    	char[] ch = new char[str.length()];
	    	for (int i = 0; i < length; i++) {
	    		ch[i] = str.charAt(i);
	    		int find = 0;
	    		for (int j = 0; j <= i; j++) {
	    			if (str.charAt(i) == ch[j])
	    				find++;
	    		}
	    		
	    		if (find == 1) {
	    			COUNT[i]=count[str.charAt(i)];	
	    		}	
	    	}
	    	for(int s=0;s<COUNT.length;s++) {
	    		charFrequency.put(str.charAt(s), (double) count[str.charAt(s)]/str.length());
	    	}
	    	HashMap<Character, Double> charFrequencySorted = new HashMap<Character, Double>(); 
	    	charFrequencySorted = (HashMap<Character, Double>)charFrequency.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)-> e2,LinkedHashMap::new));
	    	
	    	int i=0;
	    	for(char e: charFrequencySorted.keySet()) {
	    		key.put(frequencyTable[i], e);
	    		i++;
	    	}
	    	//indicate out of reach characters
	    	for (char e: alphabet) {
	    		if (!key.containsKey(e)) {
	    			key.put(e, '*');
	    			quality++;
	    		}
	    	}
	    	//calculate percentage of found key parts
	    	quality=100*(26-quality)/26;
	    	//Construct the key string
	    	for(char e: key.keySet()) {
	    		T+=key.get(e);
	    	}
	    	
	    	StringBuilder sb = new StringBuilder(str.length());
	        for (char c : str.toCharArray()) {
	            sb.append((char) (T.indexOf((int) c) + 65));
	        }
	        T="key:"+T+"("+String.format("%.2f", quality)+"%)\ntext: "+sb.toString();
			return T;
	    }
	    
}
