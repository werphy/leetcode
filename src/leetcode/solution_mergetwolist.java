package leetcode;

public class solution_mergetwolist {
	
	public static void main(String[] args) {
		ListNode k =new ListNode(0);
		System.out.println(mergeTwoLists(null,k).val);
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode term =null;
        ListNode term1;
        term1=term;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                if(term==null){
                    term=l1;
                    ;
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
