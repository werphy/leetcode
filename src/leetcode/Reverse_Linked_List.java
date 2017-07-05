package leetcode;

public class Reverse_Linked_List {
	/**
	 * Reverse a singly linked list.
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
	    public ListNode  reverseList(ListNode head) {
	        if(head==null)
	        {
	            return null;
	        }
	        ListNode term =new ListNode(head.val);
	        ListNode term1;
	        while(head.next != null){
	        head = head.next;
	        term1 = new ListNode(head.val);
	        term1.next = term;
	        term=term1;
	        }
	        return term;
	    }
	}
}
