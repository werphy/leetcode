package leetcode;

public class Count_and_Say {
	/**
	 * The count-and-say sequence is the sequence of integers with the first five terms as following:

		1.     1
		2.     11
		3.     21
		4.     1211
		5.     111221
		1 is read off as "one 1" or 11.
		11 is read off as "two 1s" or 21.
		21 is read off as "one 2, then one 1" or 1211.
		Given an integer n, generate the nth term of the count-and-say sequence.
		
		Note: Each term of the sequence of integers will be represented as a string.
	 * @author werphy
	 *
	 */
	public class Solution {
	    public String countAndSay(int n) {
	        if(n == 1){
	            return 1+"";
	        }
	        String str = countAndSay(n-1);
	        int count = 1;
	        String s = "";
	        for(int i = 0; i < str.length();i++){
	            if( i < str.length()-1 && (str.charAt(i) == str.charAt(i+1))){
	                count++;
	            }else{
	                s = s + count + str.charAt(i);
	                count = 1;
	            }
	        }
	        return s;
	    }
	}
}
