package JavaPrograms;

import java.util.LinkedHashMap;

public class LongestSubString {
	
	
	//Java Program To Find Longest Substring Without Repeating Characters :

	public static void main(String[] args) {
		longestSubString("javaconceptoftheday");

	}
	
	
	public static void longestSubString(String inputString) {
		
		String longestsubString=null;
		int logestsubstringlength=0;
		
		
		LinkedHashMap<Character, Integer> charMapPos= new LinkedHashMap<Character, Integer>();
		
		char[] charArray=inputString.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			char ch=charArray[i];
			
			if(!charMapPos.containsKey(charArray[i]))
			{
				charMapPos.put(ch, i);
			}
			else {
				i= charMapPos.get(ch);
				charMapPos.clear();
			}
			
			
			if(charMapPos.size()>logestsubstringlength) {
				
				logestsubstringlength=charMapPos.size();
				longestsubString=charMapPos.keySet().toString();
				
			}
		
		}
		
		
		System.out.println("The longest characters are "+longestsubString +"and length is " + logestsubstringlength);
		
		
		
		
		
	}

}
