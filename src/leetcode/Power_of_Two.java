package leetcode;

public class Power_of_Two {
	
	/**
	 * Given an integer, write a function to determine if it is a power of two.
	 * @author werphy
	 *
	 */
	
	
	public class Solution {
	    

	    public boolean isPowerOfTwo(int n) {
		    int[] num ={2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536
			        ,131072,262144,524288,1048576,2097152,4194304,8388608
			        ,16777216,33554432,67108864,134217728,268435456,536870912,1073741824};
			    
	        if(n==1){
	            return true ;
	        }
	        for(int i = 0 ; i <30 ;i++){
	            if(n == num[i]){
	                return  true;
	            }
	        }     
	       return  false;
	        
	        
	    }
	}
	
	/**
	 * Given an integer, write a function to determine if it is a power of three
	 * @param n
	 * @return
	 */
	  public boolean isPowerOfThree(int n) {
	        
	        int[] num ={1,3,9,27,81,243,729,2187,6561,19683,59049,177147,531441,1594323,4782969,14348907,43046721,129140163,387420489,1162261467};
		    
	        for (int n1  :num){
	            if(n1 == n){
	                return true;
	            }
	        }
	        return false;
	    }
	
	
	
}
