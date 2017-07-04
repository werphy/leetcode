package leetcode;

public class add_Two_Numbers {
	
	/**
	 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
	   You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	   Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	   Output: 7 -> 0 -> 8
	 */
	
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode SumList = sum(l1, l2, 0);
	        return SumList;
	    }
	    public int add(ListNode l1, ListNode l2,int carry){
	        int a = (l1 == null ? 0 : l1.val);
	        int b = (l2 == null ? 0 : l2.val);
	        return a+b+carry;
	    }
	    public ListNode sum(ListNode l1, ListNode l2, int carry){
	        if(l1 != null || l2 != null) {
	            int sum = add(l1, l2, carry);
	            ListNode SumList;
	            if(sum >= 10){
	                SumList = new ListNode(sum % 10);
	                SumList.next = sum(l1 != null ? l1.next : l1, l2 != null ? l2.next : l2, 1);

	            }
	            else{
	                SumList = new ListNode(sum);
	                SumList.next = sum(l1 != null ? l1.next : l1, l2 != null ? l2.next : l2, 0);
	            }
	            
	            return SumList;
	        }
	        else if(l1 == null && l2 == null && carry == 1){
	           return new ListNode(1);
	        }
	        else{
	            return null;
	        }
	    }
	}
}
