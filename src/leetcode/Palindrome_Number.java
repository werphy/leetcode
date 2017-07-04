package leetcode;

public class Palindrome_Number {
	/**
	 * Determine whether an integer is a palindrome. Do this without extra space.
	 * 
	 *
	 */
	public class Solution {
	    public boolean isPalindrome(int x) {
	     int xterm=x;
	        int a=0;
	        if(xterm>=10||xterm<=-10){
	           while(xterm!=0){
	            a=10*a+xterm%10;
	            xterm=xterm/10;
	            if((Integer.MIN_VALUE/10>a||a>Integer.MAX_VALUE/10)&&xterm!=0&&xterm<9){
	                a=0;
	                break;
	            }
	            }
	        }
	        else{
	            a=xterm;
	        }
	        return a==x&&x>=0?true:false;
	    }
	}
}
