/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class P002_AddTwoNumbers{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode tmp = result;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int sum=0;
            int v1= l1==null?0:l1.val;
            int v2= l2==null?0:l2.val;
            
            sum=v1+v2+carry;
            carry = sum/10;
            
            tmp.next = new ListNode(sum%10);
            tmp = tmp.next;
            
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
        }
        return result.next;
    }
}
