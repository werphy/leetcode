package leetcode;

public class Path_Sum {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 * 
	 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

		For example:
		Given the below binary tree and sum = 22,
		      5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
	 */
	
	
	public class TreeNode {
		      int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		      }
	public class Solution {
	    public boolean hasPathSum(TreeNode root, int sum) { 
	          System.out.println(sum);
	        return  hasPathSum(root,sum,0);
	        
	    }
	    
	   public boolean hasPathSum(TreeNode root,int sum,int sumTerm){
	         System.out.println(sum);
	        int sumTerm1 = sumTerm;
	       if(root == null){
	           return false;
	       }
	       sumTerm1 += root.val;
	       if(root.left == null && root.right == null ){
	           System.out.println(sumTerm1);
	           System.out.println(sum);
	           System.out.print(sumTerm1 == sum);
	            return sumTerm1 == sum ? true :false;
	        }
	       else if(root.left != null && root.right == null ){
	           return hasPathSum(root.left,sum,sumTerm1) == true ? true :false;
	       }
	       else if(root.left == null && root.right != null ){
	           return hasPathSum(root.right,sum,sumTerm1) == true  ? true :false;
	       }
	       else{
	           return hasPathSum(root.left,sum,sumTerm1) == true || hasPathSum(root.right,sum,sumTerm1) == true  ? true :false;
	       }
	    
	    }
	  
	}
}
