package leetcode;

public class Longest_Common_Prefix {
	/**
	 * Write a function to find the longest common prefix string amongst an array of strings.
	 * 
	 * 
	 */
	public String longestCommonPrefix(String[] strs) {
	    if(strs == null || strs.length == 0)    return "";
	    String term = strs[0];
	    for (int i = strs.length -1 ;  i > 0 ; i++) 		
		{
	        while(strs[i].indexOf(term) != 0)
	        	term = term.substring(0,term.length()-1);
	        i++;
	    }
	    return term;
	}
}
