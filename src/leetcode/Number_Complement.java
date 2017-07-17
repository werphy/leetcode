package leetcode;

public class Number_Complement {
	/**
	 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

		Note:
		The given integer is guaranteed to fit within the range of a 32-bit signed integer.
		You could assume no leading zero bit in the integer¡¯s binary representation.
	 * @author werphy
	 *
	 */
	public class Solution {
	    public int findComplement(int num) {
	        int complement = 0 ;
	        int n = 0;
	        int i = 1;
	        while((num>>n)>0){
	            complement += ( (num & i) ^ i );
	            n++;
	            i=i<<1;
	        }
	        return complement;
	    }
	}
}
