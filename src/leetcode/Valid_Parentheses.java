package leetcode;
import java.util.Stack;
public class Valid_Parentheses {
	/**
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
       The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	 * 
	 */
	public class Solution {
	    public boolean isValid(String s) {
	        if(s.length()%2!=0){
	            return false;
	        }
	        boolean isValid =true;
	        Stack st=new Stack();
	        for(int i=0;i<s.length();i++){
	            switch (s.charAt(i)){
	                case '(': st.push(s.charAt(i));break;
	                case '{': st.push(s.charAt(i));break;
	                case '[': st.push(s.charAt(i));break;
	                
	                case ')': if(st.size()>0&&st.pop().equals('(')){
	                            break;
	                             }
	                           else{
	                             isValid =false;
	                           }
	                case '}': if(st.size()>0&&st.pop().equals('{')){
	                            break;
	                             }
	                           else{
	                             isValid =false;
	                           }
	                case ']':if(st.size()>0&&st.pop().equals('[')){
	                            break;
	                             }
	                           else{
	                             isValid =false;
	                           }
	            } 
	            if(isValid==false)
	            {
	               return isValid;
	            }
	        }
	        if(st.size()>0){
	          isValid=false;
	        }
	        return isValid;
	    }
	    
	    
	    
	}
}
