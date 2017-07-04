package leetcode;

public class Reverse_Integer {
	/**
	 * Reverse digits of an integer.
	   Example1: x = 123, return 321
       Example2: x = -123, return -321
	 */
	public class Solution {
	    public int reverse(int x) {
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
	        return a;
	    }
	}
}
