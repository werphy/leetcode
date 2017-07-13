package leetcode;

public class Merge_Two_Sorted_Lists {
	/**
	 * Merge two sorted linked lists and return it as a new list. 
	 * The new list should be made by splicing together the nodes of the first two lists.
	 * 
	 * 
	 * 
	 * 
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public class Solution {
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode term =null;
	        ListNode term1 =null;
	        while(l1!=null&&l2!=null){
	            if(l1.val<l2.val){
	                if(term==null){
	                    term=l1;
	                    term1=term;
	                }
	                else{
	                    term1.next=l1;
	                    term1=term1.next;
	                }
	                l1=l1.next;
	            }
	            else{
	                if(term==null){
	                    term=l2;
	                    term1=term;
	                }
	                else{
	                    term1.next=l2;
	                    term1=term1.next;
	                }
	                l2=l2.next;
	            }
	        }
	        if(term!=null){
	        term1.next=l1!=null?l1:l2;
	        }
	        else{
	        term=l1!=null?l1:l2;
	        }
	        return term;
	    }
}
	}
